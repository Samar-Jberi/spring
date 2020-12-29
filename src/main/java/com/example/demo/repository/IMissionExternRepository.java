package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.MissionExtern;
@Repository
public interface IMissionExternRepository extends CrudRepository<MissionExtern , String> {

}
