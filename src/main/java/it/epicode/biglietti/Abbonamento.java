package it.epicode.biglietti;

import java.time.LocalDate;

import javax.persistence.Entity;
  
@Entity
public class Abbonamento extends Ticket {

	private Periodicita periodicita;

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	public Abbonamento(Integer numTicket, LocalDate dataAcquisto, Periodicita periodicita) {
		super(numTicket, dataAcquisto);
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Abbonamento [periodicita=" + periodicita + ", toString()=" + super.toString() + "]";
	}
	public Abbonamento() {

	}

}
