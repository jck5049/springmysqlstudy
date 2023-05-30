package com.gdu.app09.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpDTO {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date hireDate;	// 고용일
	private String jobId;
	private double commissionPct;
	private double salary;
	private int managerId;
	// private int departmentId;
	private DeptDTO deptDTO;

}
