package com.home.common.video.mapper;

import com.home.common.video.dao.VideoDao;
import com.home.common.video.dto.VideoDto;
import com.home.common.video.repository.ActorRepository;
import com.home.common.video.repository.FolderRepository;
import lombok.AllArgsConstructor;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class VideoMapper {

        private FolderRepository folderRepository;
        private ActorRepository actorRepository;
        private FolderMapper folderMapper;
        private ActorMapper actorMapper;

        public VideoDto toDto(final VideoDao videoDao) {
                return new VideoDto(
                                videoDao.getId(),
                                folderMapper.toDto(folderRepository.findById(videoDao.getFolderId()).orElse(null)),
                                videoDao.getName(),
                                videoDao.getFullName(),
                                videoDao.getFileSize(),
                                actorRepository.findByVideos_Id(videoDao.getId()).stream()
                                                .map(actorMapper::toDto)
                                                .toList(),
                                videoDao.getStatus(),
                                videoDao.getCreatedAt(),
                                videoDao.getUpdatedAt());
        }

        public VideoDao toEntity(final VideoDto videoDto) {
                VideoDao videoDao = new VideoDao();

                videoDao.setId(videoDto.id());
                videoDao.setFolderId(
                                folderRepository.findByPath(
                                                (URLEncoder.encode(videoDto.folder().path(), StandardCharsets.UTF_8)))
                                                .orElseThrow(RuntimeException::new).getId());
                videoDao.setName(videoDto.name());
                videoDao.setFullName(videoDto.fullName());
                videoDao.setFileSize(videoDto.fileSize());
                videoDao.setStatus(videoDto.status());
                videoDao.setCreatedAt(videoDto.createdAt());
                videoDao.setUpdatedAt(videoDto.updatedAt());
                videoDao.setActors(videoDto.actors().stream()
                                .map(actor -> actorRepository.findByName(actor.name())
                                                .orElseThrow(RuntimeException::new))
                                .collect(Collectors.toSet()));

                return videoDao;
        }
}
