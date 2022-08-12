package it.epicode.biglietti;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import it.epicode.parco_mezzi.Mezzo;
import jpautil.JpaUtil;

public class TicketServices {
	TicketDAO dao = new TicketDAO();
	public void save(Ticket ticket) {
		dao.save(ticket);
	}

	public Ticket getById(Integer numTicket) {
		return dao.getById(numTicket);
	}

	public void delete(Integer numTicket) {
		dao.delete(numTicket);
	}

	public void refresh(Ticket mezzo) {
		dao.refresh(mezzo);
	}
	public List<Biglietto> ricercadamezzo(Mezzo targa){
    	return ricercadamezzo(targa);
    }
	
	public List<Biglietto> ricercadamezzo(Mezzo targa, LocalDate i, LocalDate f){
		return ricercadamezzo(targa, i, f);
    }
}
