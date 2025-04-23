package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DepartmentEntity;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {

  @Autowired
  DepartmentRepository departmentRepository;

  public Optional<DepartmentEntity> getDepartment(final Long departmentId) {
    return departmentRepository.findById(departmentId);
  }
}
