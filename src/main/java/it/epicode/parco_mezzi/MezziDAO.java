package it.epicode.parco_mezzi;

import javax.persistence.EntityManager;

import it.epicode.biglietti.Biglietto;
import jpautil.JpaUtil;

public class MezziDAO {
	public void save(Mezzo mezzo) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(mezzo);
		em.getTransaction().commit();
		em.close();
	}

	public Mezzo getById(String targa) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Mezzo mezzo = em.find(Mezzo.class, targa);
		return mezzo;
	}

	public void delete(String targa) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(getById(targa));
		em.getTransaction().commit();
		em.close();
	}

	public void refresh(Mezzo mezzo) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(mezzo);
		em.getTransaction().commit();
		em.close();
	}
	public void timbra(Integer numBiglietto,String targa) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		Biglietto biglietto = em.find(Biglietto.class, numBiglietto);
		biglietto.setValido(false);
		Mezzo mezzo = getById(targa);
		mezzo.getBigliettiTiimbrati().add(biglietto);
		em.merge(biglietto);
		em.merge(mezzo);
		em.getTransaction().commit();
		em.close();
		
	}
	
	
	
}
