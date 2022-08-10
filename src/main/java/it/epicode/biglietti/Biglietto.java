package it.epicode.biglietti;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import it.epicode.parco_mezzi.Mezzo;

@Entity
public class Biglietto extends Ticket{
	private Boolean valido = true;
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
	
}
