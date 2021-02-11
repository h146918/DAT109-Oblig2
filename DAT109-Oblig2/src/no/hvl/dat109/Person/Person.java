package no.hvl.dat109.Person;

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

	private String Fornavn;
	private String Etternavn;
	private String Adresse;
	private int telefon;

	public String getFornavn() {
		return Fornavn;
	}

	public void setFornavn(String fornavn) {
		Fornavn = fornavn;
	}

	public String getEtternavn() {
		return Etternavn;
	}

	public void setEtternavn(String etternavn) {
		Etternavn = etternavn;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

	public Person(String fornavn, String etternavn, String adresse, int telefon) {
		super();
		Fornavn = fornavn;
		Etternavn = etternavn;
		Adresse = adresse;
		this.telefon = telefon;
	}

	@Override
	public String toString() {
		return "Person [Fornavn=" + Fornavn + ", Etternavn=" + Etternavn + ", Adresse=" + Adresse + ", telefon="
				+ telefon + "]";
	}

}
