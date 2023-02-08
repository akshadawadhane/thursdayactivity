es (16 sloc)  347 Bytes

package com.emp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

	
	private long empId;
	private String name;
	private double salary;
	
	//entity reference
	Address address;//has a relationship
	}