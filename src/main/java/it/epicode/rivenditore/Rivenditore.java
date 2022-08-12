package it.epicode.rivenditore;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import it.epicode.biglietti.Ticket;

@Entity

public abstract class Rivenditore {
	@Id
	private Integer partitaIva;
	private String luogo;
	private Boolean attivo;
	@OneToMany
	private List<Ticket> ticketLista = new ArrayList<Ticket>();

	public Rivenditore() {
		super();
	}


	public Rivenditore(Integer partitaIva, String luogo) {
		super();
		this.partitaIva = partitaIva;
		this.luogo = luogo;
	}

	public Integer getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(Integer partitaIva) {
		this.partitaIva = partitaIva;
	}

	public String getLuogo() {
		return luogo;
	}

	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}

	public Boolean getAttivo() {
		return attivo;
	}

	public void setAttivo(Boolean attivo) {
		this.attivo = attivo;
	}


	public List<Ticket> getTicketLista() {
		return ticketLista;
	}

	public void setTicketLista(List<Ticket> ticketLista) {
		this.ticketLista = ticketLista;
	}

	@Override
	public String toString() {
		return "Rivenditore [idRivenditore=" + partitaIva + ", luogo=" + luogo + ", attivo=" + attivo + "]";
	}

}
