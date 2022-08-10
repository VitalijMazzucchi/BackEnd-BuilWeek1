package it.epicode.rivenditore;

import javax.persistence.Entity;

@Entity

public class Tabaccheria extends Rivenditore {

	public Tabaccheria() {
		super();
	}

	public Tabaccheria(String luogo, Boolean attivo) {
		super(luogo, attivo);
		// TODO Auto-generated constructor stub
	}

}
