package no.hvl.dat109.utleiekontor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import no.hvl.dat109.bil.Bil;

/**
 * 
 * @author Gruppe 44
 * 
 *         Denne klassen hånderer utleiekontorene
 * 
 *         v.03A
 * 
 * 
 * 
 *
 */

public class Utleiekontor {

	private String utleiekontorNavn;
	private List<Bil> utleieBiler;
	private int tlfnr;
	private String adresse;

	public List<Bil> listeOverLedigeBiler() {

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

		List<Bil> returListe = utleieBiler.stream().filter(bil -> bil.isErLedig()).collect(Collectors.toList());
		return returListe;

	}

	public void leggTilBil(Bil bil) {

		/**
		 * 
		 * Metode som legger til en bil i utleieBiler
		 * 
		 * 
		 * @return Metode som legger til en bil i listen til utleiekontoret
		 * 
		 */

		utleieBiler.add(bil);

	}

	public Utleiekontor(String utleiekontorNavn, int tlfnr, String adresse) {
		this.utleiekontorNavn = utleiekontorNavn;
		this.tlfnr = tlfnr;
		this.adresse = adresse;
		this.utleieBiler = new ArrayList<Bil>();
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
