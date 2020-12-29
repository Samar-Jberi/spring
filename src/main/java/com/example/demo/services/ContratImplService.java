package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IContratRepository;

@Service
public class ContratImplService implements IContratService {
	@Autowired
	IContratRepository Contra;

}
