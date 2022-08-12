package it.epicode.gestionale;

import it.epicode.biglietti.TicketServices;
import it.epicode.parco_mezzi.ServicesMezzi;
import it.epicode.rivenditore.RivenditoreService;
import it.epicode.tessera.TesseraService;
import it.epicode.tratta.TrattaService;
import it.epicode.user.UserService;

public class Gestionale {
  TicketServices ticket = new TicketServices();
  ServicesMezzi mezzi = new ServicesMezzi();
  RivenditoreService rivenditore = new RivenditoreService();
  TesseraService tessera = new TesseraService();
  TrattaService tratta = new TrattaService();
  UserService user = new UserService();
  
}
