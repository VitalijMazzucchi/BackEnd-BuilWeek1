package it.epicode.rivenditore;

import javax.persistence.Entity;

@Entity

public class Distributoreautorizzato extends Rivenditore {

	public Distributoreautorizzato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Distributoreautorizzato(Integer partitaIva, String luogo) {
		super(partitaIva, luogo);
		// TODO Auto-generated constructor stub
	}



}
