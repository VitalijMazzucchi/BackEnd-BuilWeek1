package it.epicode.rivenditore;

import javax.persistence.Entity;

@Entity

public class Tabaccheria extends Rivenditore {

	public Tabaccheria() {
		super();

	}

	public Tabaccheria(Integer partitaIva, String luogo) {
		super(partitaIva, luogo);
		// TODO Auto-generated constructor stub
	}

}
