package com.home.common.video.repository;

import com.home.common.video.dao.VideoDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<VideoDao, Long> {}
