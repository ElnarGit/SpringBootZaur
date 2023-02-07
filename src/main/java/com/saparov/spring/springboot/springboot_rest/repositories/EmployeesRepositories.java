package com.saparov.spring.springboot.springboot_rest.repositories;


import com.saparov.spring.springboot.springboot_rest.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepositories extends JpaRepository<Employee, Integer> {
}
