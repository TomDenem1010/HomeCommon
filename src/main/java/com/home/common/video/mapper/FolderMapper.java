package com.home.common.video.mapper;

import com.home.common.video.dao.FolderDao;
import com.home.common.video.dto.FolderDto;
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
        return new FolderDao(
                folderDto.id(),
                folderDto.path(),
                folderDto.status(),
                folderDto.createdAt(),
                folderDto.updatedAt());
    }
}
