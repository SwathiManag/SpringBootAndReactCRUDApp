package com.demo.service;

import java.util.List;

import com.demo.dto.EmployeeDto;

public interface EmployeeService {
	
	List<EmployeeDto> getAllEmployees();

    EmployeeDto createEmployee(EmployeeDto employee);

    EmployeeDto getEmployeeById(Long employeeId);

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto employeeDto);

    void deleteEmployee(Long employeeId);
    
}
