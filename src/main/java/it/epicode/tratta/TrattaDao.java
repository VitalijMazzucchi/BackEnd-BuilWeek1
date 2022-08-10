package it.epicode.tratta;

import javax.persistence.EntityManager;

import jpautil.JpaUtil;

public class TrattaDao {
	public void save(Tratta tratta) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(tratta);
		em.getTransaction().commit();
		em.close();
	}

	public Tratta getById(String tratta) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Tratta mezzo = em.find(Tratta.class, tratta);
		return mezzo;
	}

	public void delete(String tratta) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(getById(tratta));
		em.getTransaction().commit();
		em.close();
	}

	public void refresh(Tratta tratta) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(tratta);
		em.getTransaction().commit();
		em.close();
	}

	
}
