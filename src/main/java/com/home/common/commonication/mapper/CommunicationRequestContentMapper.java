package com.home.common.commonication.mapper;

import org.springframework.stereotype.Component;

import com.home.common.commonication.dao.CommunicationRequestContent;
import com.home.common.commonication.dto.CommunicationResponseContentDto;

@Component
public class CommunicationRequestContentMapper {

    public CommunicationResponseContentDto toDto(final CommunicationRequestContent communicationRequestContent) {
        return new CommunicationResponseContentDto(
                communicationRequestContent.getId(),
                communicationRequestContent.getTransactionId(),
                communicationRequestContent.getContent());
    }

    public CommunicationRequestContent toEntity(final CommunicationResponseContentDto communicationResponseContentDto) {
        CommunicationRequestContent communicationRequestContent = new CommunicationRequestContent();

        communicationRequestContent.setId(communicationResponseContentDto.id());
        communicationRequestContent.setTransactionId(communicationResponseContentDto.transactionId());
        communicationRequestContent.setContent(communicationResponseContentDto.content());

        return communicationRequestContent;
    }
}
