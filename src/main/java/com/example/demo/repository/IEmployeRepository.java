package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employe;
@Repository
public interface IEmployeRepository extends CrudRepository<Employe,Integer> {
	public Employe getEmployeByEmailAndPassword(String email, String password);

}
