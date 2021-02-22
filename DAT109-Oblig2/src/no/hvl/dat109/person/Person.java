package no.hvl.dat109.person;

/**
 * 
 * Klasse som håndterer informasjon om person (som leier)
 * 
 * @author Gruppe 44
 *
 */
public class Person {

	private String fornavn;
	private String etternavn;
	private String adresse;
	private int telefon;
	private int kreditkort;

	public Person(String fornavn, String etternavn, String adresse, int telefon, int kreditkort) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.adresse = adresse;
		this.telefon = telefon;
		this.kreditkort = kreditkort;
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

	public int getKreditkort() {
		return kreditkort;
	}

	public void setKreditkort(int kreditkort) {
		this.kreditkort = kreditkort;
	}

}
