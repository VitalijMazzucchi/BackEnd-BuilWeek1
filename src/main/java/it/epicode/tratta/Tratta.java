package it.epicode.tratta;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tratta {
@Id
 private String id;
 private LocalTime inizioTratta;
 private LocalTime fineTratta;
 private Integer tempoMedio;
 
 
public Tratta(String id, LocalTime inizioTratta, LocalTime fineTratta, Integer tempoMedio) {
	super();
	this.id = id;
	this.inizioTratta = inizioTratta;
	this.fineTratta = fineTratta;
	this.tempoMedio = tempoMedio;
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

@Override
public String toString() {
	return "Tratta [id=" + id + ", inizioTratta=" + inizioTratta + ", fineTratta=" + fineTratta + ", tempoMedio" + tempoMedio + "]";
}
 

 

 
 
 
}
