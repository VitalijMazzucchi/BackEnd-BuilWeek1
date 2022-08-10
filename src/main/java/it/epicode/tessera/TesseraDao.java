package it.epicode.tessera;

import javax.persistence.EntityManager;

import jpautil.JpaUtil;

public class TesseraDao {
	public void save(Tessera tessera) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(tessera);
		em.getTransaction().commit();
		em.close();
	}

	public Tessera getById(String tessera) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Tessera mezzo = em.find(Tessera.class, tessera);
		return mezzo;
	}

	public void delete(String tessera) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(getById(tessera));
		em.getTransaction().commit();
		em.close();
	}

	public void refresh(Tessera tessera) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(tessera);
		em.getTransaction().commit();
		em.close();
	}

	
}
