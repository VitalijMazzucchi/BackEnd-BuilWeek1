package it.epicode.parco_mezzi;

import java.time.LocalDate;

import javax.persistence.EntityManager;

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
	public void manutenzione(Integer idManu, String targa, LocalDate im, LocalDate fm) {
		dao.manutenzione(idManu, targa, im, fm);
	}
}
