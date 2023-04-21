package com.example.demo.domain;

import java.time.*;

import lombok.*;

@Data
public class Employee {
	private int employeeId;
	private String lastName;
	private String firstName;
	private LocalDate birth;
	private String Photo;
	private String Notes;
}
