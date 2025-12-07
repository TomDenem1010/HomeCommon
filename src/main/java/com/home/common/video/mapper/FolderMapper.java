package com.home.common.video.mapper;

import com.home.common.video.dao.FolderDao;
import com.home.common.video.dto.FolderDto;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.springframework.stereotype.Component;

@Component
public class FolderMapper {

    public FolderDto toDto(final FolderDao folderDao) {
        return new FolderDto(
                folderDao.getId(),
                folderDao.getPath(),
                folderDao.getStatus(),
                folderDao.getCreatedAt(),
                folderDao.getUpdatedAt());
    }

    public FolderDao toEntity(final FolderDto folderDto) {
        FolderDao folderDao = new FolderDao();

        folderDao.setId(folderDto.id());
        folderDao.setPath(folderDto.path());
        folderDao.setStatus(folderDto.status());
        folderDao.setCreatedAt(folderDto.createdAt());
        folderDao.setUpdatedAt(folderDto.updatedAt());

        return folderDao;
    }
}
