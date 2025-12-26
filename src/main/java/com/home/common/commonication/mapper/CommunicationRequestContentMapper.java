package com.home.common.commonication.mapper;

import com.home.common.commonication.dao.CommunicationRequestContent;
import com.home.common.commonication.dto.CommunicationRequestContentDto;
import org.springframework.stereotype.Component;

@Component
public class CommunicationRequestContentMapper {

  public CommunicationRequestContentDto toDto(
      final CommunicationRequestContent communicationRequestContent) {
    return new CommunicationRequestContentDto(
        communicationRequestContent.getId(),
        communicationRequestContent.getTransactionId(),
        communicationRequestContent.getContent());
  }

  public CommunicationRequestContent toEntity(
      final CommunicationRequestContentDto communicationRequestContentDto) {
    CommunicationRequestContent communicationRequestContent = new CommunicationRequestContent();

    communicationRequestContent.setId(communicationRequestContentDto.id());
    communicationRequestContent.setTransactionId(communicationRequestContentDto.transactionId());
    communicationRequestContent.setContent(communicationRequestContentDto.content());

    return communicationRequestContent;
  }
}
