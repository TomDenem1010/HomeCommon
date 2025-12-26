package com.home.common.commonication.repository;

import com.home.common.commonication.dao.CommunicationTransaction;
import java.time.LocalDateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunicationTransactionRepository
    extends JpaRepository<CommunicationTransaction, Long> {

  @Modifying
  @Query(
      value = "UPDATE COMMUNICATION_TRANSACTION SET RESPONSE_AT = ? WHERE TRANSACTION_ID = ?",
      nativeQuery = true)
  void updateCommunicationTransactionResponseAt(LocalDateTime responseAt, String transactionId);
}
