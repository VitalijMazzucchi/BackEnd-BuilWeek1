package it.epicode.biglietti;

import java.time.LocalDate;

public class Abbonamento extends Ticket {

	private Periodicita periodicita;

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	public Abbonamento(Integer numTicket, Boolean utilizzato, LocalDate dataAcquisto, Periodicita periodicita) {
		super(numTicket, utilizzato, dataAcquisto);
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Abbonamento [periodicita=" + periodicita + ", toString()=" + super.toString() + "]";
	}

	public Abbonamento(Integer numTicket, Boolean utilizzato, LocalDate dataAcquisto) {
		super(numTicket, utilizzato, dataAcquisto);
	}

}
