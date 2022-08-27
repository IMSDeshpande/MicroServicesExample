package com.microservices.example.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.example.departmentservice.entity.Department;
import com.microservices.example.departmentservice.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		log.info("Inside saveDepartment method of department service");
		return departmentRepository.save(department);
	}

	public Department findByDepartmentId(Long departmentId) {
		// TODO Auto-generated method stub
		log.info("Inside findByDepartmentId method of department service");
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
