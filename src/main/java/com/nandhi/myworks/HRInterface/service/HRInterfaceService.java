/**
 * 
 */
package com.nandhi.myworks.HRInterface.service;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nandhi.myworks.HRInterface.dao.DepartmentInterface;
import com.nandhi.myworks.HRInterface.dao.EmployeeInterface;
import com.nandhi.myworks.HRInterface.entity.Department;
import com.nandhi.myworks.HRInterface.entity.Employee;

/**
 * @author Nandhi
 *
 */
@Service
@Component
@Transactional
public class HRInterfaceService {

	@Autowired
	EmployeeInterface empIDAO;

	@Autowired
	DepartmentInterface deptIDAO;

	public Employee findOneEmp() {
		return empIDAO.findOne(10000);
	}

	public Collection<Employee> findAllEmp() {
		return (Collection<Employee>) empIDAO.findAll();
	}

	public Department findOneDept() {
		return deptIDAO.findOne(1000);
	}

	public Collection<Department> findAllDept() {
		return (Collection<Department>) deptIDAO.findAll();
	}

}
