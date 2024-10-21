package model;

import java.time.LocalDateTime;

public class Manifestacija {

	private String ime;
	private String mesto;
	private int kapacitet;
	private String cena;
	private LocalDateTime datum;

	public Manifestacija(String ime, String mesto, int kapacitet, String cena) {
		super();
		this.ime = ime;
		this.mesto = mesto;
		this.kapacitet = kapacitet;
		this.cena = cena;
		this.datum = LocalDateTime.now();
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getMesto() {
		return mesto;
	}

	public void setMesto(String mesto) {
		this.mesto = mesto;
	}

	public int getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}

	public String getCena() {
		return cena;
	}

	public void setCena(String cena) {
		this.cena = cena;
	}

	public LocalDateTime getDatum() {
		return datum;
	}

	public void setDatum(LocalDateTime datum) {
		this.datum = datum;
	}

	@Override
	public String toString() {
		return "Manifestacija [ime=" + ime + ", mesto=" + mesto + ", kapacitet=" + kapacitet + ", cena=" + cena + "]";
	}

}
