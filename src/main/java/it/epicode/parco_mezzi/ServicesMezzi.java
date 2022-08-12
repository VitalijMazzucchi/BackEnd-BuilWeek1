package it.epicode.parco_mezzi;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import it.epicode.biglietti.Biglietto;
import it.epicode.tratta.Tratta;
import jpautil.JpaUtil;

public class ServicesMezzi {
	MezziDAO dao = new MezziDAO();
	
	public void save(Mezzo mezzo) {
		dao.save(mezzo);
	}

	public Mezzo getById(String targa) {
		return dao.getById(targa);
	}

	public void delete(String targa) {
		dao.delete(targa);
	}

	public void refresh(Mezzo mezzo) {
		dao.refresh(mezzo);
	}
	public void timbra(Integer numBiglietto,String targa, LocalDate v) {
		timbra(numBiglietto,targa, v);
	}
	
	public List<Tratta> ricercatratte(String targa){
	
		return ricercatratte( targa);
	}
}
