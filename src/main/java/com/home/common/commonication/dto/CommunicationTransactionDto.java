package com.home.common.commonication.dto;

import java.time.LocalDateTime;

public record CommunicationTransactionDto(
    Long id,
    String transactionId,
    String requestedPath,
    String senderIp,
    LocalDateTime requestedAt,
    LocalDateTime responseAt) {}
