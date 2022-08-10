package it.epicode.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.epicode.biglietti.Abbonamento;
import it.epicode.biglietti.Biglietto;
import it.epicode.biglietti.Ticket;
import it.epicode.biglietti.TicketDAO;
import it.epicode.tessera.Tessera;

public class RivenditoreService {
	TicketDAO dao = new TicketDAO();
	private Logger log = LoggerFactory.getLogger(RivenditoreService.class);
	
    public void giveBiglietto (Biglietto biglietto) {
    	dao.save(biglietto);
    }
    
    public void giveAbbonamento (Abbonamento abbonamento, Tessera tessera) {
    	if(tessera.getValido() == true) {
    		dao.save(abbonamento);
    	}
    	else {
    		log.error("Tessera non valida o scaduta");
    	}
    }
    
}
