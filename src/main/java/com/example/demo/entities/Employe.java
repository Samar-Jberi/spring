package com.example.demo.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Employe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id; 
	 public String nom;
	 public String prenom;
	 public String email;
	 private String password;
	 public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isActif; 
	 
	@ManyToMany(mappedBy="employes")
	 private List<Department> departements;
@Enumerated(EnumType.STRING)
	private Role role;
		
		public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Employe(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isActif() {
		return isActif;
	}


	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}


	


	public List<Department> getDepartements() {
		return departements;
	}


	public void setDepartements(List<Department> departements) {
		this.departements = departements;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	

		

}
