package it.epicode.tessera;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tessera {
@Id
 private Integer numTessera;

public Tessera(Integer numTessera) {
	super();
	this.numTessera = numTessera;
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

@Override
public String toString() {
	return "Tessera [numTessera=" + numTessera + "]";
}
 

}
