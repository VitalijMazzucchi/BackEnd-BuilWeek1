package it.epicode.user;

import javax.persistence.EntityManager;

import jpautil.JpaUtil;

public class UserService {
	UserDAO dao = new UserDAO();
	
	public void inserisci(User user) {
		dao.inserisci(user);
	}
	
	public void modifica(User user) {
		dao.modifica(user);
	}
	
	public User recuperaDaID(User user) {
	 return dao.recuperaDaID(user);
	}
	
	public void cancella(User user) {
	 dao.cancella(user);
	}
}
