/**
 * 
 */
package com.nandhi.myworks.HRInterface.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nandhi.myworks.HRInterface.entity.Department;
import com.nandhi.myworks.HRInterface.entity.Employee;
import com.nandhi.myworks.HRInterface.service.HRInterfaceService;

/**
 * @author Nandhi
 *
 */
@RestController
@RequestMapping("/hrinfo")
public class HRInterfaceController {

	@Autowired
	HRInterfaceService hrService;

	@RequestMapping(value = "/allemp", method = RequestMethod.GET)
	public Collection<Employee> findAllEmp() {
		return hrService.findAllEmp();
	}

	@RequestMapping(value = "/findemp", method = RequestMethod.GET)
	public Employee findOneEmp() {
		return hrService.findOneEmp();

	}

	@RequestMapping(value = "/alldept", method = RequestMethod.GET)
	public Collection<Department> findAllDept() {
		return hrService.findAllDept();
	}

	@RequestMapping(value = "/finddept", method = RequestMethod.GET)
	public Department findOneDept() {
		return hrService.findOneDept();

	}

}
