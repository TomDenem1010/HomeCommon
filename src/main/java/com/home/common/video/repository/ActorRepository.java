package com.home.common.video.repository;

import com.home.common.video.dao.ActorDao;
import com.home.common.video.dto.ActorDto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<ActorDao, Long> {

    @Query(
            "SELECT new com.home.common.video.dto.ActorDto(a.id, a.name, a.status, a.createdAt, a.updatedAt) FROM Actor a JOIN a.videos v WHERE v.id = :videoId")
    List<ActorDto> findActorDtosToVideo(Long videoId);
}
