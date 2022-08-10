package it.epicode.parco_mezzi;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Manutenzione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private Mezzi mezzi;
	private LocalDate inizioManu;
	private LocalDate fineManu;
	private LocalDate fineServizio;
	private LocalDate inizioServizio;
	
	public Manutenzione(Integer id, Mezzi mezzi, LocalDate inizioManu, LocalDate fineManu) {
		super();
		this.id = id;
		this.mezzi = mezzi;
		this.inizioManu = inizioManu;
		this.fineManu = fineManu;
		this.fineServizio = inizioManu;
		this.inizioServizio = fineManu;
	}
	
	public Manutenzione() {
		super();
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Mezzi getMezzi() {
		return mezzi;
	}

	public void setMezzi(Mezzi mezzi) {
		this.mezzi = mezzi;
	}

	public LocalDate getInizioManu() {
		return inizioManu;
	}

	public void setInizioManu(LocalDate inizioManu) {
		this.inizioManu = inizioManu;
	}

	public LocalDate getFineManu() {
		return fineManu;
	}

	public void setFineManu(LocalDate fineManu) {
		this.fineManu = fineManu;
	}

	public LocalDate getFineServizio() {
		return fineServizio;
	}

	public void setFineServizio(LocalDate fineServizio) {
		this.fineServizio = fineServizio;
	}

	public LocalDate getInizioServizio() {
		return inizioServizio;
	}

	public void setInizioServizio(LocalDate inizioServizio) {
		this.inizioServizio = inizioServizio;
	}


	@Override
	public String toString() {
		return "Manutenzione [id=" + id + ", mezzi=" + mezzi + ", inizioManu=" + inizioManu + ", fineManu=" + fineManu
				+ ", fineServizio=" + fineServizio + ", inizioServizio=" + inizioServizio + "]";
	}

	
	
}
