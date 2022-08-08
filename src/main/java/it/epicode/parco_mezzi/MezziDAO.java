package it.epicode.parco_mezzi;

import javax.persistence.EntityManager;

import jpautil.JpaUtil;

public class MezziDAO {
	public void save(Mezzi mezzo) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(mezzo);
		em.getTransaction().commit();
		em.close();
	}

	public Mezzi getById(String targa) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Mezzi mezzo = em.find(Mezzi.class, targa);
		return mezzo;
	}

	public void delete(String targa) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(getById(targa));
		em.getTransaction().commit();
		em.close();
	}

	public void refresh(Mezzi mezzo) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(mezzo);
		em.getTransaction().commit();
		em.close();
	}
}
