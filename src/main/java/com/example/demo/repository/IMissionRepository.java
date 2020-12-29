package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Mission;
@Repository
public interface IMissionRepository extends CrudRepository<Mission,Integer>{
	

	
}
