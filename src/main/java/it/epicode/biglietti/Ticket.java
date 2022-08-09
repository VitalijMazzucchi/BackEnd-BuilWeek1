package it.epicode.biglietti;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Ticket {
	@Id
	private Integer numTicket;
	private Boolean utilizzato = false;
	private LocalDate dataAcquisto;
	
	public Ticket(Integer numTicket, Boolean utilizzato, LocalDate dataAcquisto) {
		super();
		this.numTicket = numTicket;
		this.utilizzato = utilizzato;
		this.dataAcquisto = dataAcquisto;
	}
	
	public Ticket() {
		super();
	}

	public Integer getNumTicket() {
		return numTicket;
	}
	public void setNumTicket(Integer numTicket) {
		this.numTicket = numTicket;
	}
	public Boolean getUtilizzato() {
		return utilizzato;
	}
	public void setUtilizzato(Boolean utilizzato) {
		this.utilizzato = utilizzato;
	}
	public LocalDate getDataAcquisto() {
		return dataAcquisto;
	}
	public void setDataAcquisto(LocalDate dataAcquisto) {
		this.dataAcquisto = dataAcquisto;
	}

	@Override
	public String toString() {
		return "Ticket [numTicket=" + numTicket + ", utilizzato=" + utilizzato + ", dataAcquisto=" + dataAcquisto + "]";
	}
	
}
