package com.home.common.commonication.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "COMMUNICATION_TRANSACTION")
public class CommunicationTransaction {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "communication_transaction_seq")
  @SequenceGenerator(
      name = "communication_transaction_seq",
      sequenceName = "COMMUNICATION_TRANSACTION_SEQ",
      allocationSize = 1)
  @Column(name = "ID")
  private Long id;

  @Column(name = "TRANSACTION_ID", length = 256)
  private String transactionId;

  @Column(name = "REQUESTED_PATH", length = 256)
  private String requestedPath;

  @Column(name = "SENDER_IP", length = 64)
  private String senderIp;

  @CreatedDate
  @Column(name = "REQUEST_AT")
  private LocalDateTime requestedAt;

  @Column(name = "RESPONSE_AT")
  private LocalDateTime responseAt;
}
