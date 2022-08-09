package it.epicode.tessera;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tessera {
@Id
 private Integer numTessera;
 private LocalDate inizioValidita;
 private Boolean valido;

public Tessera(Integer numTessera, LocalDate inizioValidita) {
	super();
	this.numTessera = numTessera;
	this.inizioValidita = inizioValidita;
	this.valido = inizioValidita.plusDays(365).isBefore(LocalDate.now());
}

public Tessera() {
	super();
}

public Integer getNumTessera() {
	return numTessera;
}

public void setNumTessera(Integer numTessera) {
	this.numTessera = numTessera;
}

public LocalDate getInizioValidita() {
	return inizioValidita;
}

public void setInizioValidita(LocalDate inizioValidita) {
	this.inizioValidita = inizioValidita;
}

public Boolean getValido() {
	return valido;
}

public void setValido(Boolean valido) {
	this.valido = valido;
}

@Override
public String toString() {
	return "Tessera [numTessera=" + numTessera + "]";
}
 

}
