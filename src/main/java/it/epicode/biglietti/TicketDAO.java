package it.epicode.biglietti;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import it.epicode.parco_mezzi.Mezzo;
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
	
	public List<Biglietto> ricercadamezzo(Mezzo targa){
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
    	Query q = em.createNamedQuery("mezzo.timbro");
    	q.setParameter("targa", targa.getTarga());
    	List<Biglietto> listavariabile = q.getResultList();
    	em.close();
    	return listavariabile;
    }
	
	public List<Biglietto> ricercadamezzo(Mezzo targa, LocalDate i, LocalDate f){
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
    	Query q = em.createNamedQuery("mezzo.datatimbro");
    	q.setParameter("targa", targa.getTarga());
        q.setParameter("inizio", i);
        q.setParameter("fine", f);
        List<Biglietto> listavariabile = q.getResultList();
        em.close();
		return listavariabile;
    }
	
	
	
	
	
	}
	
	
	

