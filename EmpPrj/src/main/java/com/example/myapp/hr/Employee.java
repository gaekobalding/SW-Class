package com.example.myapp.hr;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String jobId;
	private double salary;
	private double commissionPct;
	private int managerId;
	private int departmentId;

}
