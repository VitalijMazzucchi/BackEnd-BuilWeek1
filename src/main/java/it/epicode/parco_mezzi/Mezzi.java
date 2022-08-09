package it.epicode.parco_mezzi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import it.epicode.tratta.Tratta;

@Entity
public abstract class Mezzi {
	@Id
	private String targa;
	private Stato_Mezzo statoMezzo;
	@OneToOne
	private Tratta tratta;
	public Mezzi(String targa, Stato_Mezzo statoMezzo, Tratta tratta) {
		super();
		this.targa = targa;
		this.statoMezzo = statoMezzo;
		this.tratta = tratta;
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
	
	public Tratta getTratta() {
		return tratta;
	}

	public void setTratta(Tratta tratta) {
		this.tratta = tratta;
	}

	@Override
	public String toString() {
		return "Mezzi [targa=" + targa + ", statoMezzo=" + statoMezzo + "]";
	}

}
