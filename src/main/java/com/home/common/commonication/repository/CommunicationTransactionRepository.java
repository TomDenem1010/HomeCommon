package com.home.common.commonication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.common.commonication.dao.CommunicationTransaction;

@Repository
public interface CommunicationTransactionRepository extends JpaRepository<CommunicationTransaction, Long> {

}
