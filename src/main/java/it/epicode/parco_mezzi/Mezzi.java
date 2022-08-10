package it.epicode.parco_mezzi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import it.epicode.biglietti.Ticket;
import it.epicode.tratta.Tratta;

@Entity
public abstract class Mezzi {
	@Id
	private String targa;
	private Stato_Mezzo statoMezzo;
	
	@OneToMany
	private List<Manutenzione> manutenzione = new ArrayList<Manutenzione>();

	@ManyToMany
	private List<Tratta> trattaLista = new ArrayList<Tratta>();
	
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

		
	public List<Tratta> getTrattaLista() {
		return trattaLista;
	}

	public void setTrattaLista(List<Tratta> trattaLista) {
		this.trattaLista = trattaLista;
	}

	@Override
	public String toString() {
		return "Mezzi [targa=" + targa + ", statoMezzo=" + statoMezzo + "]";
	}

}
