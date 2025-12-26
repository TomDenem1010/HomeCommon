package com.home.common.commonication.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "COMMUNICATION_RESPONSE_CONTENT")
public class CommunicationResponseContent {

  @Id
  @GeneratedValue(
      strategy = GenerationType.SEQUENCE,
      generator = "communication_response_content_seq")
  @SequenceGenerator(
      name = "communication_response_content_seq",
      sequenceName = "COMMUNICATION_RESPONSE_CONTENT_SEQ",
      allocationSize = 1)
  @Column(name = "ID")
  private Long id;

  @Column(name = "TRANSACTION_ID", length = 256)
  private String transactionId;

  @Column(name = "CONTENT")
  private String content;
}
