package it.epicode.rivenditore;

import javax.persistence.Entity;

@Entity

public class Distributoreautorizzato extends Rivenditore {

	public Distributoreautorizzato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Distributoreautorizzato(String luogo, Boolean attivo) {
		super(luogo, attivo);
		// TODO Auto-generated constructor stub
	}

}
