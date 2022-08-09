package it.epicode.rivenditore;

import javax.persistence.EntityManager;

import jpautil.JpaUtil;

public class RivenditoreDAO {
	public void inserisci (Rivenditore rivenditore) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(rivenditore);	
		em.getTransaction().commit();
		em.close();
	}
	
	public void modifica(Rivenditore rivenditore){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(rivenditore);	
		em.getTransaction().commit();
		em.close();
	}
	
	public Rivenditore recuperadaid(Rivenditore rivenditore){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Rivenditore obj = em.find(Rivenditore.class, rivenditore.getRivenditabiglietti());	
		em.close();
		return obj;
	}
	
	public void elimina(Rivenditore rivenditore){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(recuperadaid(rivenditore));	
		em.getTransaction().commit();
		em.close();
	}
	
	
}
