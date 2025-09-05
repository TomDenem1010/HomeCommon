package com.home.common.video.dto;

import com.home.common.video.Status;
import java.time.LocalDateTime;

public record FolderDto(
        Long id, String path, Status status, LocalDateTime createdAt, LocalDateTime updatedAt) {}
