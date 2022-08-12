package it.epicode.rivenditore;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import it.epicode.biglietti.Ticket;
import it.epicode.biglietti.TicketDAO;
import jpautil.JpaUtil;

public class RivenditoreDao {
	

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
	        Rivenditore obj = em.find(Rivenditore.class, rivenditore.getPartitaIva());
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
	    
	    public List<Ticket> ricercadarivenditore(Integer s){
	        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	    	Query q = em.createNamedQuery("ticket.venditore");
	    	q.setParameter("partitaIva", s);
	    	List<Ticket> listavariabile = q.getResultList();
	    	em.close();
	    	return listavariabile;
	    }
	    
	    public List<Ticket> ricercadaperiodo(LocalDate i, LocalDate f){
	        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	        Query n = em.createNamedQuery("ticket.tempo");
	        n.setParameter("inizio", i);
	        n.setParameter("fine", f);
	        List<Ticket> storicoacquisti = n.getResultList();
	        em.close();
			return storicoacquisti;
	    }
	    
	    
	    
	    
}
	    
	    



