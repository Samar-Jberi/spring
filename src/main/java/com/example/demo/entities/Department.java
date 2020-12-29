package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;




@Entity
public class Department implements Serializable {
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	public String name;
	@OneToMany(mappedBy ="department",cascade = CascadeType.ALL)
private Set<MissionExtern> Mission; 
	@ManyToMany
private List<Employe> employes;
	
	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})//persist means add,merge pour dire  que a chaque fois que ja vais faire la mise a jour de dep je vais ausi faire la mise a jour d entreprise (same for add)
	private Entreprise entreprise;
	
	
	
	
	
	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	

	public Department(String name) {
		super();
		this.name = name;
	}

	
	

	public Department(String name, Set<MissionExtern> mission) {
		super();
		this.name = name;
		Mission = mission;
		
	}

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

	public Set<MissionExtern> getMission() {
		return Mission;
	}

	public void setMission(Set<MissionExtern> mission) {
		Mission = mission;
	}

	

	
}
