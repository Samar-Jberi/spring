package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;






@Entity
public class Contrat implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int reference;
	@Temporal(TemporalType.DATE)
	public Date dateDebut;
	public float salaire;
	public String typeContrat;
	@OneToOne
	private Employe employe;
	
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public int getReference() {
		return reference;
	}
	public Contrat(float salaire) {
		super();
		this.salaire = salaire;
	}
	public void setReference(int reference) {
		this.reference = reference;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	public String getTypeContrat() {
		return typeContrat;
	}
	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}

}
