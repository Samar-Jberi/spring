package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Department;
import com.example.demo.entities.Employe;
import com.example.demo.entities.Entreprise;

public interface IEntrepriseService {
	public int ajouterEntreprise(Entreprise entreprise);
	 public int ajouterDepartement(Department dep);
	 void affecterDepartementAEntreprise(int depId, int entrepriseId);
	 List<String> getAllDepartementsNamesByEntreprise(int entrepriseId);
	 public void deleteEntrepriseetDepartment(int ide);
	 public void ajouterEtAffecterEntrepriseDepartment(Department dep, Entreprise e);
	 public void affecterEmployeDepartement(Employe user, Department dep);
		public List<Employe> getallEmployebyEntreprise (int identr);
		public Employe getEmploye(String nom, String pwd);
	    public void mettreAjourEmailByEmployeId(String email, int employeId);

}
