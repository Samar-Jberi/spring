package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Department;
@Repository
public interface IdepartmentRepository extends CrudRepository<Department,Integer> {

}
