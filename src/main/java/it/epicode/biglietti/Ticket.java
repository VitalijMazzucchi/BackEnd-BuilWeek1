package it.epicode.biglietti;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

import it.epicode.rivenditore.Rivenditore;


@Entity
public abstract class Ticket {
	@Id
	private Integer numTicket;
	private LocalDate dataAcquisto;
	@ManyToOne
	private Rivenditore rivenditore; 
	public Ticket(Integer numTicket, LocalDate dataAcquisto) {
		super();
		this.numTicket = numTicket;
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
	public LocalDate getDataAcquisto() {
		return dataAcquisto;
	}
	public void setDataAcquisto(LocalDate dataAcquisto) {
		this.dataAcquisto = dataAcquisto;
	}

	@Override
	public String toString() {
		return "Ticket [numTicket=" + numTicket + ", dataAcquisto=" + dataAcquisto + "]";
	}
	
}
