package it.epicode.parco_mezzi;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import it.epicode.biglietti.Biglietto;
import it.epicode.tratta.Tratta;
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
	public void timbra(Integer numBiglietto,String targa, LocalDate v) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		Biglietto biglietto = em.find(Biglietto.class, numBiglietto);
		biglietto.setValido(false);
		biglietto.setDatavalidazione(v);
		Mezzo mezzo = getById(targa);
		mezzo.getBigliettiTiimbrati().add(biglietto);
		em.merge(biglietto);
		em.merge(mezzo);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Tratta> ricercatratte(String targa){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Mezzo mezzo = getById(targa);
		List<Tratta> tratte = mezzo.getTrattaLista();
		em.close();
		return tratte;
	}
	
	public void manutenzione(Integer idManu, String targa, LocalDate im, LocalDate fm) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
        Mezzo mezzo = getById(targa);
        if(mezzo.getStatoMezzo() == Stato_Mezzo.SERVIZIO) {
        	mezzo.setStatoMezzo(Stato_Mezzo.MANUTENZIONE);
    		Manutenzione manutenzione = new Manutenzione(idManu, mezzo, im, fm);
    		em.persist(manutenzione);
        	mezzo.getManutenzione().add(manutenzione);
        	em.merge(mezzo);
        	em.getTransaction().commit();
        	em.close();
        }    else {
        	mezzo.setStatoMezzo(Stato_Mezzo.SERVIZIO);
        	em.merge(mezzo);
        	em.getTransaction().commit();
        	em.close();
        }
		
	}
}
