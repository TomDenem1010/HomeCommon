package com.home.common.commonication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.common.commonication.dao.CommunicationResponseContent;

@Repository
public interface CommunicationResponseContentRepository extends JpaRepository<CommunicationResponseContent, Long> {

}
