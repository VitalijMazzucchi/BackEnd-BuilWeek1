package it.epicode.parco_mezzi;

import javax.persistence.Entity;

@Entity
public class Tram extends Mezzi {
	private Integer capienza = 100;

	public Integer getCapienza() {
		return capienza;
	}

	public void setCapienza(Integer capienza) {
		this.capienza = capienza;
	}

	public Tram() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tram(String targa, Stato_Mezzo statoMezzo) {
		super(targa, statoMezzo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tram [capienza=" + capienza + ", toString()=" + super.toString() + "]";
	}

}
