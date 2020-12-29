package com.example.demo;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entities.Contrat;
import com.example.demo.entities.Department;
import com.example.demo.entities.Employe;
import com.example.demo.entities.Entreprise;
import com.example.demo.services.IEmployeService;
import com.example.demo.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TptimesheetApplicationTests {
	
	
	
	@Autowired
	IEntrepriseService entreServices;
	
	
	@Autowired
	IEmployeService employeServices;
	private static final Logger l = LogManager.getLogger(TptimesheetApplicationTests.class);

	@Test
	public void contextLoads() {
		Entreprise e = new Entreprise("SSIS","ghazela");
        // entreServices.ajouterEntreprise(e);
		
		Department d = new Department("RH");
		Employe em = new Employe("Samar","jberi");
		//entreServices.ajouterDepartement(d);
		
		//entreServices.affecterDepartementAEntreprise(1, 1);
		/*List<String> lnom = entreServices.getAllDepartementsNamesByEntreprise(1);
		for (String nom:lnom){
			l.info(nom);
		}*/
		
		//entreServices.deleteEntrepriseetDepartment(1);
		employeServices.ajouterEmploye(em);
	
		
	}
	}
