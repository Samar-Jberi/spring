package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Contrat;
import com.example.demo.entities.Employe;

public interface IEmployeService {
	public int ajouterEmploye(Employe employe);
    public void affecterEmployeADepartement(int employeId, int depId);
    public int ajouterContrat(Contrat contrat);
    public void affecterContratAEmploye(int contratId, int employeId);
    public String getEmployePrenomById(int employeId);
	public long getNombreEmployeJPQL();
	public List<String> getAllEmployeNamesJPQL();
	public Employe authenticate(String email, String password) ;

}
