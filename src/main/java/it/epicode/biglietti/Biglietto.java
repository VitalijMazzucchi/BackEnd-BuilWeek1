package it.epicode.biglietti;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

import it.epicode.parco_mezzi.Mezzo;

@Entity
public class Biglietto extends Ticket{	
	private Boolean valido = true;
	private LocalDate datavalidazione;
	@ManyToOne
	private Mezzo mezzo; 
	
	public Biglietto() {
		super();
	}

	public Biglietto(Integer numTicket, LocalDate dataAcquisto) {
		super(numTicket, dataAcquisto);
	}

	public Boolean getValido() {
		return valido;
	}

	public void setValido(Boolean valido) {
		this.valido = valido;
	}

	public LocalDate getDatavalidazione() {
		return datavalidazione;
	}

	public void setDatavalidazione(LocalDate datavalidazione) {
		this.datavalidazione = datavalidazione;
	}

	public Mezzo getMezzo() {
		return mezzo;
	}

	public void setMezzo(Mezzo mezzo) {
		this.mezzo = mezzo;
	}
	
	
	
}
