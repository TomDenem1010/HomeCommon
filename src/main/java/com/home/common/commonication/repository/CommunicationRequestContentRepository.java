package com.home.common.commonication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.common.commonication.dao.CommunicationRequestContent;

@Repository
public interface CommunicationRequestContentRepository extends JpaRepository<CommunicationRequestContent, Long> {

}
