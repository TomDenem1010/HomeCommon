package com.home.common.video.dto;

import com.home.common.video.Status;
import java.time.LocalDateTime;

public record ActorDto(
    Long id, String name, Status status, LocalDateTime createdAt, LocalDateTime updatedAt) {}
