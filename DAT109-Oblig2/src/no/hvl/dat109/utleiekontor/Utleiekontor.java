package no.hvl.dat109.utleiekontor;

import java.util.List;
import java.util.stream.Collectors;

import no.hvl.dat109.bil.Bil;

public class Utleiekontor {

	private String utleiekontorNavn;
	private List<Bil> utleieBiler;
	private int tlfnr;
	private String adresse;

	/**
	 * Metode som returner en liste med Biler som er ledig i utleieBiler
	 * 
	 * 
	 * @return Metode som returnerer en liste med biler som er ledige fra
	 *         utleiekontoret
	 * 
	 * 
	 * 
	 */

	public List<Bil> listeOverLedigeBiler() {

		List<Bil> returListe = utleieBiler.stream().filter(bil -> bil.isErLedig()).collect(Collectors.toList());
		return returListe;

	}

	/**
	 * 
	 * Metode som legger til en bil i utleieBiler
	 * 
	 * 
	 * @return Metode som legger til en bil i listen til utleiekontoret
	 * 
	 */

	public void leggTilBil(Bil bil) {

		utleieBiler.add(bil);

	}

	public Utleiekontor() {
	};

	public Utleiekontor(String utleiekontorNavn, int tlfnr, String adresse, List<Bil> utleieBiler) {
		this.utleiekontorNavn = utleiekontorNavn;
		this.tlfnr = tlfnr;
		this.adresse = adresse;
		this.utleieBiler = utleieBiler;

	}

	public String getUtleiekontorNavn() {
		return utleiekontorNavn;
	}

	public void setUtleiekontorNavn(String utleiekontorNavn) {
		this.utleiekontorNavn = utleiekontorNavn;
	}

	public List<Bil> getUtleieBiler() {
		return utleieBiler;
	}

	public void setUtleieBiler(List<Bil> utleieBiler) {
		this.utleieBiler = utleieBiler;
	}

	public int getTlfnr() {
		return tlfnr;
	}

	public void setTlfnr(int tlfnr) {
		this.tlfnr = tlfnr;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
