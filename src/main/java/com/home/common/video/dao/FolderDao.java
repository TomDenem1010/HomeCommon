package com.home.common.video.dao;

import com.home.common.video.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FOLDER")
public class FolderDao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "folder_seq")
    @SequenceGenerator(name = "folder_seq", sequenceName = "FOLDER_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "PATH", length = 256)
    private String path;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS", length = 128)
    private Status status;

    @CreatedDate
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;
}
