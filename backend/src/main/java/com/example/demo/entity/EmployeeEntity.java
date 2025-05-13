package com.example.demo.entity;

import java.time.ZonedDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@Table(name = "employee")
public class EmployeeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank(message = "Field 'firstName' is required.")
  @Column(name = "first_name")
  private String firstName;

  @Column(name = "middle_name")
  private String middleName;

  @NotBlank(message = "Field 'lastName' is required.")
  @Column(name = "last_name")
  private String lastName;

  @NotBlank(message = "Field 'salary' is required.")
  @Column(name = "salary")
  private Integer salary;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "address_id")
  private AddressEntity address;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "department_id", nullable = false)
  private DepartmentEntity department;

  @CreationTimestamp private ZonedDateTime createdAt;
}