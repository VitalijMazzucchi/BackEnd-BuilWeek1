package it.epicode.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import it.epicode.tessera.Tessera;

@Entity
public class User {
	@Id
	private String codfisc;
	private String name;
	private String surname;
	@OneToOne
	private Tessera tessera;
	
	public User(String codfisc, String name, String surname) {
		super();
		this.codfisc = codfisc;
		this.name = name;
		this.surname = surname;
	}
	
	
	public User() {
		super();
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getCodfisc() {
		return codfisc;
	}
	public void setCodfisc(String codfisc) {
		this.codfisc = codfisc;
	}


	public Tessera getTessera() {
		return tessera;
	}
	public void setTessera(Tessera tessera) {
		this.tessera = tessera;
	}
	
}
