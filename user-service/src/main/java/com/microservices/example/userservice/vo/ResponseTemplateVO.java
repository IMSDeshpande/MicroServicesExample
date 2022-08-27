package com.microservices.example.userservice.vo;

import com.microservices.example.userservice.entity.UserTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

	private UserTable user;
	private Department department;
}
