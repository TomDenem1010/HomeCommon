package com.home.common.video.mapper;

import com.home.common.video.dao.VideoDao;
import com.home.common.video.dto.VideoDto;
import com.home.common.video.repository.ActorRepository;
import com.home.common.video.repository.FolderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class VideoMapper {

    private ActorRepository actorRepository;
    private FolderRepository folderRepository;

    public VideoDto toDto(final VideoDao videoDao) {
        return new VideoDto(
                videoDao.getId(),
                folderRepository.findFolderDtoById(videoDao.getFolderId()).orElse(null),
                videoDao.getName(),
                videoDao.getFileSize(),
                actorRepository.findActorDtosToVideo(videoDao.getId()),
                videoDao.getStatus(),
                videoDao.getCreatedAt(),
                videoDao.getUpdatedAt());
    }

    public static VideoDao toEntity(final VideoDto videoDto) {
        return new VideoDao(
                videoDto.id(),
                videoDto.folder().id(),
                videoDto.name(),
                videoDto.fileSize(),
                videoDto.status(),
                videoDto.createdAt(),
                videoDto.updatedAt());
    }
}
