package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Contrat;
@Repository
public interface IContratRepository extends CrudRepository<Contrat,Integer>{

}
