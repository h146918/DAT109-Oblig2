package no.hvl.dat109.person;

/**
 * 
 * @author Gruppe 44
 * 
 *         V.01 Alpha
 * 
 *         Personklasse som oppretter en person etter at en kunde har lagret
 *         informasjon på nettsiden denne skal brukes videre for å holde
 *         kontroll på hvilken kunde som har reservert en bil
 *
 */

public class Person {

	private String fornavn;
	private String etternavn;
	private String adresse;
	private int telefon;



	public Person(String fornavn, String etternavn, String adresse, int telefon) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.adresse = adresse;
		this.telefon = telefon;
	}
	
	
	
	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return this.etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTelefon() {
		return this.telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

	



	

}
