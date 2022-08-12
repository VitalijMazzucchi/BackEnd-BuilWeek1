package it.epicode.tratta;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;

import it.epicode.biglietti.Ticket;
import it.epicode.parco_mezzi.Mezzo;

@Entity
public class Tratta {
@Id
 private String id; //nome del percorso
 private LocalTime inizioTratta;
 private LocalTime fineTratta;
 private Integer tempoMedio;
 private Duration duration; //durata del percorso
 @ManyToMany
 private List<Mezzo> mezziLista = new ArrayList<Mezzo>();
  
public Tratta(String id, LocalTime inizioTratta, LocalTime fineTratta, Integer tempoMedio) {
	super();
	this.id = id;
	this.inizioTratta = inizioTratta;
	this.fineTratta = fineTratta;
	this.tempoMedio = tempoMedio;
	this.duration = duration.between(inizioTratta, fineTratta);
}

public Tratta() {
	super();
}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public LocalTime getInizioTratta() {
	return inizioTratta;
}
public void setInizioTratta(LocalTime inizioTratta) {
	this.inizioTratta = inizioTratta;
}
public LocalTime getFineTratta() {
	return fineTratta;
}
public void setFineTratta(LocalTime fineTratta) {
	this.fineTratta = fineTratta;
}
public Integer getTempoMedio() {
	return tempoMedio;
}
public void setTempoMedio(Integer tempoMedio) {
	this.tempoMedio = tempoMedio;
}

public Duration getDuration() {
	return duration;
}
public void setDuration(Duration duration) {
	this.duration = duration;
}


public List<Mezzo> getMezziLista() {
	return mezziLista;
}

public void setMezziLista(List<Mezzo> mezziLista) {
	this.mezziLista = mezziLista;
}

@Override
public String toString() {
	return "Tratta [id=" + id + ", inizioTratta=" + inizioTratta + ", fineTratta=" + fineTratta + ", tempoMedio" + tempoMedio + ", duration" + duration + "]";
}
 

 

 
 
 
}
