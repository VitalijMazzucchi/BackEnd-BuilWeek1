package it.epicode.tratta;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tratta {
@Id
 private String id;
 private LocalTime inizioTratta;
 private LocalDateTime fineTratta;
 //private Integer numTratte;
public Tratta(String id, LocalTime inizioTratta, LocalDateTime fineTratta) {
	super();
	this.id = id;
	this.inizioTratta = inizioTratta;
	this.fineTratta = fineTratta;
}
public Tratta() {
	super();
}
@Override
public String toString() {
	return "Tratta [id=" + id + ", inizioTratta=" + inizioTratta + ", fineTratta=" + fineTratta + "]";
}
 

 

 
 
 
}
