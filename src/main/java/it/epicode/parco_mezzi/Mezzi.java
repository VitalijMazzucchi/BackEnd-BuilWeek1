package it.epicode.parco_mezzi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Mezzi {
	@Id
	private String targa;
	private Stato_Mezzo statoMezzo;

	public Mezzi(String targa, Stato_Mezzo statoMezzo) {
		super();
		this.targa = targa;
		this.statoMezzo = statoMezzo;
	}

	public Mezzi() {
		super();
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public Stato_Mezzo getStatoMezzo() {
		return statoMezzo;
	}

	public void setStatoMezzo(Stato_Mezzo statoMezzo) {
		this.statoMezzo = statoMezzo;
	}

	@Override
	public String toString() {
		return "Mezzi [targa=" + targa + ", statoMezzo=" + statoMezzo + "]";
	}

}
