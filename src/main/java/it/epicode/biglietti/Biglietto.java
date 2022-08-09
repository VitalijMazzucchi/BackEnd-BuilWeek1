package it.epicode.biglietti;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Biglietto extends Ticket{
	private Boolean valido = true;
	
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
