package it.epicode.parco_mezzi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import it.epicode.biglietti.Biglietto;
import it.epicode.tratta.Tratta;

@Entity
public abstract class Mezzo {
	@Id
	private String targa;
	private Stato_Mezzo statoMezzo;
	
	@OneToMany
	private List<Manutenzione> manutenzione = new ArrayList<Manutenzione>();

	@ManyToMany
	private List<Tratta> trattaLista = new ArrayList<Tratta>();
	
	@OneToMany
	private List<Biglietto> bigliettiTiimbrati = new ArrayList<>();
	
	public Mezzo(String targa, Stato_Mezzo statoMezzo) {
		super();
		this.targa = targa;
		this.statoMezzo = statoMezzo;
	}

	public Mezzo() {
		super();
	}
	

	public List<Manutenzione> getManutenzione() {
		return manutenzione;
	}

	public void setManutenzione(List<Manutenzione> manutenzione) {
		this.manutenzione = manutenzione;
	}

	public List<Biglietto> getBigliettiTiimbrati() {
		return bigliettiTiimbrati;
	}

	public void setBigliettiTiimbrati(List<Biglietto> bigliettiTiimbrati) {
		this.bigliettiTiimbrati = bigliettiTiimbrati;
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
