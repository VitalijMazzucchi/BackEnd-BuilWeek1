package it.epicode.gestionale;

import it.epicode.biglietti.TicketServices;
import it.epicode.parco_mezzi.ServicesMezzi;
import it.epicode.rivenditore.RivenditoreService;
import it.epicode.tessera.TesseraService;
import it.epicode.tratta.TrattaService;
import it.epicode.user.UserService;

public class Gestionale {
 public TicketServices ticket = new TicketServices();
 public ServicesMezzi mezzi = new ServicesMezzi();
 public  RivenditoreService rivenditore = new RivenditoreService();
 public TesseraService tessera = new TesseraService();
 public TrattaService tratta = new TrattaService();
 public  UserService user = new UserService();
  
}
