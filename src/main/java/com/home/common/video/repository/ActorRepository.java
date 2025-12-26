package com.home.common.video.repository;

import com.home.common.video.dao.ActorDao;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<ActorDao, Long> {

  List<ActorDao> findByVideos_Id(Long videoId);

  @Modifying
  @Query(value = "SELECT * FROM ACTOR WHERE STATUS = ?", nativeQuery = true)
  List<ActorDao> findAllByStatus(String status);

  @Modifying
  @Query(value = "UPDATE ACTOR SET STATUS = ? WHERE STATUS = ?", nativeQuery = true)
  void updateAllActorStatusByStatus(String toStatus, String fromStatus);

  @Modifying
  @Query(value = "UPDATE ACTOR SET STATUS = ?, UPDATED_AT = ? WHERE STATUS = ?", nativeQuery = true)
  void updateAllActorStatusAndUpdatedAtByStatus(
      String toStatus, LocalDateTime updatedAt, String fromStatus);

  @Modifying
  @Query(value = "UPDATE ACTOR SET STATUS = ? WHERE ID = ?", nativeQuery = true)
  void updateActorStatus(String status, Long actorId);

  @Modifying
  @Query(value = "UPDATE ACTOR SET STATUS = ?, UPDATED_AT = ? WHERE ID = ?", nativeQuery = true)
  void updateActorStatusAndUpdatedAt(String status, LocalDateTime updatedAt, Long actorId);

  Optional<ActorDao> findByName(String name);
}
