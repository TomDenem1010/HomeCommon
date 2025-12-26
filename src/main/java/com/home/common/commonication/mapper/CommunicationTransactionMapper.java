package com.home.common.commonication.mapper;

import com.home.common.commonication.dao.CommunicationTransaction;
import com.home.common.commonication.dto.CommunicationTransactionDto;
import org.springframework.stereotype.Component;

@Component
public class CommunicationTransactionMapper {

  public CommunicationTransactionDto toDto(
      final CommunicationTransaction communicationTransaction) {
    return new CommunicationTransactionDto(
        communicationTransaction.getId(),
        communicationTransaction.getTransactionId(),
        communicationTransaction.getRequestedPath(),
        communicationTransaction.getSenderIp(),
        communicationTransaction.getRequestedAt(),
        communicationTransaction.getResponseAt());
  }

  public CommunicationTransaction toEntity(
      final CommunicationTransactionDto communicationTransactionDto) {
    CommunicationTransaction communicationTransaction = new CommunicationTransaction();

    communicationTransaction.setId(communicationTransactionDto.id());
    communicationTransaction.setTransactionId(communicationTransactionDto.transactionId());
    communicationTransaction.setRequestedPath(communicationTransactionDto.requestedPath());
    communicationTransaction.setSenderIp(communicationTransactionDto.senderIp());
    communicationTransaction.setRequestedAt(communicationTransactionDto.requestedAt());
    communicationTransaction.setResponseAt(communicationTransactionDto.responseAt());

    return communicationTransaction;
  }
}
