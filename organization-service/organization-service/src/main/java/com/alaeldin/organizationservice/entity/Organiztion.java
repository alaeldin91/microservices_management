package com.alaeldin.organizationservice.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "organizations")
public class Organiztion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String organizationName;

    private String organizationDescription;
    @Column(nullable = false,unique = true)
    private String organizationCode;
    @CreationTimestamp
    private LocalDateTime createDate;
}
