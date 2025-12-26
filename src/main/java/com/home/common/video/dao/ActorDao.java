package com.home.common.video.dao;

import com.home.common.video.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ACTOR")
public class ActorDao {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "actor_seq")
  @SequenceGenerator(name = "actor_seq", sequenceName = "ACTOR_SEQ", allocationSize = 1)
  @Column(name = "ID")
  private Long id;

  @Column(name = "NAME", length = 256)
  private String name;

  @Enumerated(EnumType.STRING)
  @Column(name = "STATUS", length = 128)
  private Status status;

  @CreatedDate
  @Column(name = "CREATED_AT")
  private LocalDateTime createdAt;

  @LastModifiedDate
  @Column(name = "UPDATED_AT")
  private LocalDateTime updatedAt;

  @ManyToMany(mappedBy = "actors")
  private Set<VideoDao> videos = new HashSet<>();
}
