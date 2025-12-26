package com.home.common.commonication.repository;

import com.home.common.commonication.dao.CommunicationResponseContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunicationResponseContentRepository
    extends JpaRepository<CommunicationResponseContent, Long> {}
