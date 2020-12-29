package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;


@Entity
public class MissionExtern  extends Mission implements Serializable {
	public String emailFacturation;
	public int tauxJournalierMoyen;
	public String getEmailFacturation() {
		return emailFacturation;
	}
	public void setEmailFacturation(String emailFacturation) {
		this.emailFacturation = emailFacturation;
	}
	public int getTauxJournalierMoyen() {
		return tauxJournalierMoyen;
	}
	public void setTauxJournalierMoyen(int tauxJournalierMoyen) {
		this.tauxJournalierMoyen = tauxJournalierMoyen;
	}

}
