package it.epicode.biglietti;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.ManyToAny;

import it.epicode.rivenditore.Rivenditore;


@Entity
@NamedQuery(name = "ticket.venditore", query = "SELECT b FROM Ticket b WHERE b.rivenditore.partitaIva =:partitaIva")
@NamedQuery(name = "ticket.tempo", query = "SELECT b FROM Ticket b WHERE b.dataacquisto BETWEEN :inizio AND :fine")
@NamedQuery(name = "mezzo.timbro", query = "SELECT b FROM Biglietto b WHERE b.mezzo.targa = :targa")
@NamedQuery(name = "mezzo.datatimbro", query = "SELECT b FROM Biglietto b WHERE b.mezzo.targa = :targa AND b.datavalidazione BETWEEN :inizio AND :fine")


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
