package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Contrat;
import com.example.demo.entities.Department;
import com.example.demo.entities.Employe;
import com.example.demo.repository.IContratRepository;
import com.example.demo.repository.IEmployeRepository;
import com.example.demo.repository.IEntrepriseRepository;
import com.example.demo.repository.IdepartmentRepository;

@Service
public class EmployeImplService implements IEmployeService {
	
	
	@Autowired
	IEmployeRepository ERep;
	
	@Autowired
	IdepartmentRepository DRep;
	
	@Autowired
	IContratRepository ECon;
	
	@Autowired
	IEntrepriseRepository EntRep;

	@Override
	public int ajouterEmploye(Employe employe) {
	ERep.save(employe);
	return (employe.getId());
	}

	@Override
	public void affecterEmployeADepartement(int employeId, int depId) {
		Department d =  DRep.findById(depId).orElse(null);
		Employe e =  ERep.findById(employeId).orElse(null);
	//	d.getEmployes().add(e);
		DRep.save(d);
	}

	@Override
	public int ajouterContrat(Contrat contrat) {
		ECon.save(contrat);
		
		return (contrat.getReference());
	}

	@Override
	public void affecterContratAEmploye(int contratId, int employeId) {
		Contrat C =  ECon.findById(contratId).orElse(null);
		Employe e =  ERep.findById(employeId).orElse(null);
	    C.setEmploye(e);
		
	}

	@Override
	public String getEmployePrenomById(int employeId) {
		Employe e = ERep.findById(employeId).orElse(null);
		
		return e.getPrenom();
	}

	@Override
	public long getNombreEmployeJPQL() {
		
		return ERep.count();
	}

	@Override
	public List<String> getAllEmployeNamesJPQL() {
		//List<String> empList = ERep.
		return null;
	}

	@Override
	public Employe authenticate(String email, String password) {
		return ERep.getEmployeByEmailAndPassword(email, password);
		
	}

}
