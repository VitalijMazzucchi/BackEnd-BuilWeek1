package it.epicode.user;

import javax.persistence.EntityManager;

import jpautil.JpaUtil;

public class UserDAO {
	public void inserisci(User user) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
	}
	
	public void modifica(User user) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(user);
		em.getTransaction().commit();
		em.close();
	}
	
	public User recuperaDaID(User user) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		User u = em.find(User.class, user.getCodfisc());
		em.close();
		return u;
	}
	
	public void cancella(User user) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(recuperaDaID(user));
		em.getTransaction().commit();
		em.close();
	}
	
	
}
