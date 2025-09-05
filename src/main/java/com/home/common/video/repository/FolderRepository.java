package com.home.common.video.repository;

import com.home.common.video.dao.FolderDao;
import com.home.common.video.dto.FolderDto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<FolderDao, Long> {

    @Query(
            "SELECT new com.home.common.video.dto.FolderDto(f.id, f.path, f.status, f.createdAt, f.updatedAt) FROM Folder f WHERE f.id = :folderId")
    Optional<FolderDto> findFolderDtoById(Long folderId);
}
