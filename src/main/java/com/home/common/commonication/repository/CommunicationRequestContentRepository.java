package com.home.common.commonication.repository;

import com.home.common.commonication.dao.CommunicationRequestContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunicationRequestContentRepository
    extends JpaRepository<CommunicationRequestContent, Long> {}
