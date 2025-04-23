package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

  @Autowired
  EmployeeRepository employeeRepository;

  public Optional<EmployeeEntity> getEmployee(final Long employeeId) {
    return employeeRepository.findById(employeeId);
  }
}
