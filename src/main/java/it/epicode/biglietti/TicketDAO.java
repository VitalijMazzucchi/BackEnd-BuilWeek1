package it.epicode.biglietti;

import javax.persistence.EntityManager;

import jpautil.JpaUtil;

public class TicketDAO {
	public void save(Ticket ticket) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(ticket);
		em.getTransaction().commit();
		em.close();
	}

	public Ticket getById(Integer numTicket) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Ticket tick = em.find(Ticket.class, numTicket);
		return tick;
	}

	public void delete(Integer numTicket) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(getById(numTicket));
		em.getTransaction().commit();
		em.close();
	}

	public void refresh(Ticket mezzo) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(mezzo);
		em.getTransaction().commit();
		em.close();
	}
}
