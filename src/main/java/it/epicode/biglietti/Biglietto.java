package it.epicode.biglietti;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Biglietto extends Ticket{

	public Biglietto() {
		super();
	}

	public Biglietto(Integer numTicket, Boolean utilizzato, LocalDate dataAcquisto) {
		super(numTicket, utilizzato, dataAcquisto);
	}

}
