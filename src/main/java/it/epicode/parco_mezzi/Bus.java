package it.epicode.parco_mezzi;

import javax.persistence.Entity;

@Entity
public class Bus extends Mezzo {
	private Integer capienza = 35;

	public Integer getCapienza() {
		return capienza;
	}

	public void setCapienza(Integer capienza) {
		this.capienza = capienza;
	}

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Bus(String targa, Stato_Mezzo statoMezzo, Integer capienza) {
		super(targa, statoMezzo);
		this.capienza = capienza;
	}

	@Override
	public String toString() {
		return "Bus [capienza=" + capienza + ", toString()=" + super.toString() + "]";
	}

}
