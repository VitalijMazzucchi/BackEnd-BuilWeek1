package it.epicode.program;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

import it.epicode.gestionale.Gestionale;
import it.epicode.parco_mezzi.Bus;
import it.epicode.parco_mezzi.Stato_Mezzo;
import it.epicode.parco_mezzi.Tram;
import it.epicode.rivenditore.Distributoreautorizzato;
import it.epicode.rivenditore.Tabaccheria;
import it.epicode.tessera.Tessera;
import it.epicode.tratta.Tratta;
import it.epicode.user.User;


public class Main {

	public static void main(String[] args) {
		
		Gestionale g = new Gestionale();	
	User us1 = new User("S93G", "Saro", "Gentile");
	User us2 = new User("G64R", "Gennaro", "Redentore");
	User us3 = new User("M88K", "Mario", "Kikko");
	User us4 = new User("I99E", "Iolanda", "Eccitata");
	User us5 = new User("R85A", "Renata", "Abbrustolita");
	User us6 = new User("S50P", "Sara", "Perchetiamo");
	g.user.inserisci(us1);
	g.user.inserisci(us2);
	g.user.inserisci(us3);
	g.user.inserisci(us4);
	g.user.inserisci(us5);
	g.user.inserisci(us6);
	
	Distributoreautorizzato distr = new Distributoreautorizzato(450392, "Via del Cappotto");
	Distributoreautorizzato distr1 = new Distributoreautorizzato(45678, "Via del Maniscalco");
	Distributoreautorizzato distr2 = new Distributoreautorizzato(93485, "Via del Soporifero");
	g.rivenditore.inserisci(distr);
	g.rivenditore.inserisci(distr1);
	g.rivenditore.inserisci(distr2);
	
	Tabaccheria tab = new Tabaccheria(33020, "Piazza Selvaggia");
	Tabaccheria tab1 = new Tabaccheria(77362, "Piazza Festa");
	Tabaccheria tab2 = new Tabaccheria(99203, "Piazza Ripulita");
	Tabaccheria tab3 = new Tabaccheria(11993, "Piazza Grande");
	g.rivenditore.inserisci(tab);
	g.rivenditore.inserisci(tab1);
	g.rivenditore.inserisci(tab2);
	g.rivenditore.inserisci(tab3);
	
	Bus bus1= new Bus("RM000SS", Stato_Mezzo.SERVIZIO, 35);
	Bus bus2= new Bus("AX888JJ", Stato_Mezzo.SERVIZIO, 35);
	Bus bus3= new Bus("GH456HH", Stato_Mezzo.SERVIZIO, 35);
	Bus bus4= new Bus("HH123YY", Stato_Mezzo.SERVIZIO, 35);
	g.mezzi.save(bus1);
	g.mezzi.save(bus2);
	g.mezzi.save(bus3);
	g.mezzi.save(bus4);
	
	Tram tram1 = new Tram("FF555RR", Stato_Mezzo.SERVIZIO, 150);
	Tram tram2 = new Tram("UU765WW", Stato_Mezzo.SERVIZIO, 150);
	Tram tram3 = new Tram("DE41PP", Stato_Mezzo.SERVIZIO, 150);
	Tram tram4 = new Tram("TR01AA", Stato_Mezzo.SERVIZIO, 150);
	g.mezzi.save(tram1);
	g.mezzi.save(tram2);
	g.mezzi.save(tram3);
	g.mezzi.save(tram4);
	
	Tessera tes1 = new Tessera(1122, LocalDate.of(2022, 6, 22));
	Tessera tes2= new Tessera(2345, LocalDate.of(2022, 1 , 30));
	Tessera tes3 = new Tessera(5678, LocalDate.of(2022, 4 , 9));
	Tessera tes4 = new Tessera(1010, LocalDate.of(2022, 8, 1));
	g.tessera.save(tes1);
	g.tessera.save(tes2);
	g.tessera.save(tes3);
	g.tessera.save(tes4);
	//attribuisco ad utenti una tessera
	us1.setTessera(tes1);
	us2.setTessera(tes2);
	us3.setTessera(tes3);
	us4.setTessera(tes4);
	//modifico utente e ottengo in db la tabella con i campi delle tessere relativi all'utente piene
	g.user.modifica(us1);
	g.user.modifica(us2);
	g.user.modifica(us3);
	g.user.modifica(us4);
	
	Tratta tra = new Tratta("Tratta del mausoleo", LocalTime.of(12, 20), LocalTime.of(14, 20), Duration.ofMinutes(45));
	Tratta tra1 = new Tratta("Tratta del Colosseo", LocalTime.of(17, 40), LocalTime.of(18, 20), Duration.ofMinutes(30));
	Tratta tra2 = new Tratta("Tratta del Testicolo", LocalTime.of(20, 0), LocalTime.of(21, 0), Duration.ofMinutes(5));
	g.tratta.save(tra);
	g.tratta.save(tra1);
	g.tratta.save(tra2);
	}
}
