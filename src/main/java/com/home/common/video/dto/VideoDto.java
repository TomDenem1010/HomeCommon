package com.home.common.video.dto;

import com.home.common.video.Status;
import java.time.LocalDateTime;
import java.util.List;

public record VideoDto(
        Long id,
        FolderDto folder,
        String name,
        String fileSize,
        List<ActorDto> actors,
        Status status,
        LocalDateTime createdAt,
        LocalDateTime updatedAt) {}
