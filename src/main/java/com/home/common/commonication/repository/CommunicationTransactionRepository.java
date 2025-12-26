package com.home.common.commonication.repository;

import com.home.common.commonication.dao.CommunicationTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunicationTransactionRepository
    extends JpaRepository<CommunicationTransaction, Long> {}
