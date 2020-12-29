package com.example.demo.services;



import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Department;
import com.example.demo.entities.Employe;
import com.example.demo.entities.Entreprise;
import com.example.demo.repository.IEmployeRepository;
import com.example.demo.repository.IEntrepriseRepository;
import com.example.demo.repository.IdepartmentRepository;

@Service
public class EntrepriseImplService implements IEntrepriseService{
	@Autowired
	IEntrepriseRepository entreRep;
	
	@Autowired
	IdepartmentRepository deparRep;
	
	@Autowired
	IEmployeRepository  ERep;
	
	private static final Logger l = LogManager.getLogger(EntrepriseImplService.class);

	@Override
	public int ajouterEntreprise(Entreprise entreprise) {
		entreRep.save(entreprise);
		return (entreprise.getId());
	}

	@Override
	public int ajouterDepartement(Department dep) {
		deparRep.save(dep);
		return (dep.getId());
	}

	@Override
	public void affecterDepartementAEntreprise(int depId, int entrepriseId) {
		Entreprise e =  entreRep.findById(entrepriseId).orElse(null);
		Department d = deparRep.findById(depId).orElse(null);
		d.setEntreprise(e);
		deparRep.save(d);
		
		
	}

	@Override
	public List<String> getAllDepartementsNamesByEntreprise(int entrepriseId) {
		Entreprise e =  entreRep.findById(entrepriseId).orElse(null);
		List<Department> ldep =  (List<Department>) e.getDepartements();
		List<String> lnom = new ArrayList<String>();
		for(Department dep:ldep){
			lnom.add(dep.getName());
		}
		return lnom;
	}

	@Override
	public void deleteEntrepriseetDepartment(int ide) {
		Entreprise e =  entreRep.findById(ide).orElse(null);
		entreRep.delete(e);
		
	}

	@Override
	public void ajouterEtAffecterEntrepriseDepartment(Department dep, Entreprise e) {
		dep.setEntreprise(e);//l'affectation
		deparRep.save(dep);//l'ajout
		
	}

	@Override
	public void affecterEmployeDepartement(Employe user, Department dep) {
		Department depar = deparRep.findById(dep.getId()).orElse(null);
		
		
	//	dep.setEmploye(user);
		deparRep.save(depar);	
		
		
		
		
		
		
	}

	@Override
	public List<Employe> getallEmployebyEntreprise(int identr) {
		Entreprise e = entreRep.findById(identr).orElse(null);
		List<Department> lD = (List<Department>) e.getDepartements();
		List<String> lEmpl = new ArrayList<String>();
		//List<Employe> listE = (List<Employe>) e.getDepartements();
		List<Employe> listE = new ArrayList<Employe>();
		//List<String> l = new ArrayList<String>();
		
		for(Department dep:lD)
		{
			
			//	listE.add(dep.getEmploye());
			}
			
		
		
		return listE;
	}

	@Override
	public Employe getEmploye(String nom, String pwd) {
		//return null;
		
		List<Employe> listE = new ArrayList<Employe>();
		List<Employe> listEm = new ArrayList<Employe>();
		listE = (List<Employe>) ERep.findAll();
		for( Employe E:listE){
		if (E.equals(this.getEmploye(nom, pwd))){
			listE.add(E);
			
		}
		
		}
		return (Employe) listE;
	}
		
		
	

	@Override
	public void mettreAjourEmailByEmployeId(String email, int employeId) {
		Employe e = ERep.findById(employeId).orElse(null);
		e.setEmail(email);
		
		
	}

}
