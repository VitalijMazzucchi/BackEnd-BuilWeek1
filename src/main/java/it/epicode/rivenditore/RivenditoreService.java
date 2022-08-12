package it.epicode.rivenditore;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.epicode.biglietti.Abbonamento;
import it.epicode.biglietti.Biglietto;
import it.epicode.biglietti.TicketDAO;
import it.epicode.tessera.Tessera;
import jpautil.JpaUtil;

public class RivenditoreService {
	TicketDAO dao = new TicketDAO();
	RivenditoreDao daor = new RivenditoreDao();
	private Logger log = LoggerFactory.getLogger(RivenditoreService.class);

	public void inserisci(Rivenditore rivenditore) {
		daor.inserisci(rivenditore);
	}

	public void modifica(Rivenditore rivenditore) {
		daor.modifica(rivenditore);
	}

	public Rivenditore recuperadaid(Rivenditore rivenditore) {
		return daor.recuperadaid(rivenditore);
	}

	public void elimina(Rivenditore rivenditore) {
		daor.elimina(rivenditore);
	}

	public void giveBiglietto(Biglietto biglietto) {
		dao.save(biglietto);
	}

	public void giveAbbonamento(Abbonamento abbonamento, Tessera tessera) {
		if (tessera.getValido() == true) {
			dao.save(abbonamento);
		} else {
			log.error("Tessera non valida o scaduta");
		}
	}

}
