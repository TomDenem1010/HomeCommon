package com.home.common.video.repository;

import com.home.common.video.dao.VideoDao;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<VideoDao, Long> {

    Optional<VideoDao> findById(Long id);

    @Modifying
    @Query(value = "UPDATE VIDEO SET STATUS = ? WHERE STATUS = ?", nativeQuery = true)
    void updateAllVideoStatusByStatus(String toStatus, String fromStatus);

    @Modifying
    @Query(value = "UPDATE VIDEO SET STATUS = ?, UPDATED_AT = ? WHERE STATUS = ?", nativeQuery = true)
    void updateAllVideoStatusAndUpdatedAtByStatus(String toStatus, LocalDateTime updatedAt, String fromStatus);

    @Modifying
    @Query(value = "UPDATE VIDEO SET STATUS = ? WHERE ID = ?", nativeQuery = true)
    void updateVideoStatus(String status, Long videoId);

    @Modifying
    @Query(value = "UPDATE VIDEO SET STATUS = ?, UPDATED_AT = ? WHERE ID = ?", nativeQuery = true)
    void updateVideoStatusAndUpdatedAt(String status, LocalDateTime updatedAt, Long videoId);

    Optional<VideoDao> findByFolderIdAndName(Long folderId, String name);
}
