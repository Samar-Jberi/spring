package com.example.demo.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Entreprise implements Serializable{
	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id; 
	public String name;
	public Entreprise(String name, String raisonSociale) {
		super();
		this.name = name;
		this.raisonSociale = raisonSociale;
	}

	public String raisonSociale;
	
	@OneToMany(mappedBy="entreprise",fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
	private Set<Department> Departements;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public Set<Department> getDepartements() {
		return Departements;
	}

	public void setDepartements(Set<Department> departements) {
		Departements = departements;
	}

	

}
