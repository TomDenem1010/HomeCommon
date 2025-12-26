package com.home.common.commonication.mapper;

import org.springframework.stereotype.Component;

import com.home.common.commonication.dao.CommunicationResponseContent;
import com.home.common.commonication.dto.CommunicationResponseContentDto;

@Component
public class CommunicationResponseContentMapper {

    public CommunicationResponseContentDto toDto(final CommunicationResponseContent communicationResponseContent) {
        return new CommunicationResponseContentDto(
                communicationResponseContent.getId(),
                communicationResponseContent.getTransactionId(),
                communicationResponseContent.getContent());
    }

    public CommunicationResponseContent toEntity(
            final CommunicationResponseContentDto communicationResponseContentDto) {
        CommunicationResponseContent communicationResponseContent = new CommunicationResponseContent();

        communicationResponseContent.setId(communicationResponseContentDto.id());
        communicationResponseContent.setTransactionId(communicationResponseContentDto.transactionId());
        communicationResponseContent.setContent(communicationResponseContentDto.content());

        return communicationResponseContent;
    }
}
