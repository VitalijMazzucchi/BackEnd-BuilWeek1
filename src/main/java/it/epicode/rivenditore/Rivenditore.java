package it.epicode.rivenditore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public abstract class Rivenditore {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rivenditabiglietti;
	private String luogo;
	private Boolean attivo;
	private Integer bigliettiemessi;

	public Rivenditore(String luogo, Boolean attivo) {
		super();
		this.luogo = luogo;
		this.attivo = attivo;
	}

	public Rivenditore() {
		super();
	}

	public Integer getRivenditabiglietti() {
		return rivenditabiglietti;
	}

	public void setRivenditabiglietti(Integer rivenditabiglietti) {
		this.rivenditabiglietti = rivenditabiglietti;
	}

	public String getLuogo() {
		return luogo;
	}

	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}

	public Boolean getAttivo() {
		return attivo;
	}

	public void setAttivo(Boolean attivo) {
		this.attivo = attivo;
	}

	public Integer getBigliettiemessi() {
		return bigliettiemessi;
	}

	public void setBigliettiemessi(Integer bigliettiemessi) {
		this.bigliettiemessi = bigliettiemessi;
	}

	@Override
	public String toString() {
		return "Rivenditore [rivenditabiglietti=" + rivenditabiglietti + ", luogo=" + luogo + ", attivo=" + attivo
				+ ", bigliettiemessi=" + bigliettiemessi + "]";
	}

}
