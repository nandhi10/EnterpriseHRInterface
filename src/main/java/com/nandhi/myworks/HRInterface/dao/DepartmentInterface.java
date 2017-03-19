/**
 * 
 */
package com.nandhi.myworks.HRInterface.dao;

import org.springframework.data.repository.CrudRepository;

import com.nandhi.myworks.HRInterface.entity.Department;

/**
 * @author Nandhi
 *
 */
public interface DepartmentInterface extends CrudRepository<Department, Integer> {

}
