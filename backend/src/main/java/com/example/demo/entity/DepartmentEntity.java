package com.example.demo.entity;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@Table(name = "department")
public class DepartmentEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank(message = "Field 'name' is required.")
  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Builder.Default
  @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<EmployeeEntity> employees = new ArrayList<>();

  @CreationTimestamp private ZonedDateTime createdAt;
}