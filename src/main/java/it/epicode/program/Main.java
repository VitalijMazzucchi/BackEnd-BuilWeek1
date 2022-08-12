package it.epicode.program;

import it.epicode.parco_mezzi.Bus;
import it.epicode.parco_mezzi.Stato_Mezzo;
import it.epicode.parco_mezzi.Tram;

import it.epicode.user.User;
import it.epicode.user.UserDAO;

public class Main {

	public static void main(String[] args) {
		
	
	UserDAO dao = new UserDAO();
	User us1 = new User("S93G", "Saro", "Gentile");
	User us2 = new User("G64R", "Gennaro", "Redentore");
	User us3 = new User("M88K", "Mario", "Kikko");
	User us4 = new User("I99E", "Iolanda", "Eccitata");
	User us5 = new User("R85A", "Renata", "Abbrustolita");
	User us6 = new User("S50P", "Sara", "Perchetiamo");
	
	dao.inserisci(us1);
	
	Bus bus1= new Bus("RM000SS", Stato_Mezzo.SERVIZIO, 35);
	Bus bus2= new Bus("AX888JJ", Stato_Mezzo.SERVIZIO, 35);
	Bus bus3= new Bus("GH456HH", Stato_Mezzo.SERVIZIO, 35);
	Bus bus4= new Bus("HH123YY", Stato_Mezzo.SERVIZIO, 35);
	
	Tram tram1 = new Tram("FF555RR", Stato_Mezzo.SERVIZIO, 150);
	Tram tram2 = new Tram("UU765WW", Stato_Mezzo.SERVIZIO, 150);
	Tram tram3 = new Tram("DE41PP", Stato_Mezzo.SERVIZIO, 150);
	Tram tram4 = new Tram("TR01AA", Stato_Mezzo.SERVIZIO, 150);
	}
}
