/**
 * 
 */
package com.nandhi.myworks.HRInterface.dao;

import org.springframework.data.repository.CrudRepository;

import com.nandhi.myworks.HRInterface.entity.Employee;

/**
 * @author Nandhi
 *
 */

public interface EmployeeInterface extends CrudRepository<Employee, Integer> {

}
