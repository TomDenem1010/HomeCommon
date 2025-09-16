package com.home.common.video.repository;

import com.home.common.video.dao.FolderDao;

import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<FolderDao, Long> {

    Optional<FolderDao> findById(Long id);

    @Modifying
    @Query(value = "UPDATE FOLDER SET STATUS = ? WHERE STATUS = ?", nativeQuery = true)
    void updateAllFolderStatusByStatus(String toStatus, String fromStatus);

    @Modifying
    @Query(value = "UPDATE FOLDER SET STATUS = ?, UPDATED_AT = ? WHERE STATUS = ?", nativeQuery = true)
    void updateAllFolderStatusAndUpdatedAtByStatus(String toStatus, LocalDateTime updatedAt, String fromStatus);

    @Modifying
    @Query(value = "UPDATE FOLDER SET STATUS = ? WHERE ID = ?", nativeQuery = true)
    void updateFolderStatus(String status, Long folderId);

    @Modifying
    @Query(value = "UPDATE FOLDER SET STATUS = ?, UPDATED_AT = ? WHERE ID = ?", nativeQuery = true)
    void updateFolderStatusAndUpdatedAt(String status, LocalDateTime updatedAt, Long folderId);

    Optional<FolderDao> findByPath(String path);
}
