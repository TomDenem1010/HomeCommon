package com.home.common.video.repository;

import com.home.common.video.dao.VideoDao;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<VideoDao, Long> {

  Optional<VideoDao> findById(Long id);

  @Modifying
  @Query(value = "SELECT * FROM VIDEO WHERE STATUS = ?", nativeQuery = true)
  List<VideoDao> findAllByStatus(String status);

  @Modifying
  @Query(value = "SELECT * FROM VIDEO WHERE STATUS = ? AND FOLDER_ID = ?", nativeQuery = true)
  List<VideoDao> findAllByStatusAndFolderId(String status, Long folderId);

  @Modifying
  @Query(
      value =
          "SELECT * FROM VIDEO LEFT JOIN VIDEO_ACTOR ON VIDEO.ID = VIDEO_ACTOR.VIDEO_ID WHERE VIDEO.STATUS = ? AND VIDEO_ACTOR.ACTOR_ID = ?",
      nativeQuery = true)
  List<VideoDao> findAllByStatusAndActorId(String status, Long actorId);

  @Modifying
  @Query(value = "UPDATE VIDEO SET STATUS = ? WHERE STATUS = ?", nativeQuery = true)
  void updateAllVideoStatusByStatus(String toStatus, String fromStatus);

  @Modifying
  @Query(value = "UPDATE VIDEO SET STATUS = ?, UPDATED_AT = ? WHERE STATUS = ?", nativeQuery = true)
  void updateAllVideoStatusAndUpdatedAtByStatus(
      String toStatus, LocalDateTime updatedAt, String fromStatus);

  @Modifying
  @Query(value = "UPDATE VIDEO SET STATUS = ? WHERE ID = ?", nativeQuery = true)
  void updateVideoStatus(String status, Long videoId);

  @Modifying
  @Query(value = "UPDATE VIDEO SET STATUS = ?, UPDATED_AT = ? WHERE ID = ?", nativeQuery = true)
  void updateVideoStatusAndUpdatedAt(String status, LocalDateTime updatedAt, Long videoId);

  Optional<VideoDao> findByFolderIdAndName(Long folderId, String name);
}
