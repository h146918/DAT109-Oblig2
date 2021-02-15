package no.hvl.dat109.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import no.hvl.dat109.bil.Bil;
import no.hvl.dat109.utleiekontor.Utleiekontor;

public class Controller {

	List<Utleiekontor> utleiekontorer = new ArrayList<Utleiekontor>();

	public Bil finnBilMedReg(String regnr, List<Bil> liste) {

		Bil bil = new Bil();

		for (Bil b : liste) {
			if (b.getRegnr().equals(regnr)) {
				bil = b;
			}
		}

		return bil;
	}

	public void leggTilUtleiekontorer(Utleiekontor utleiekontor) {
		utleiekontorer.add(utleiekontor);
	}

	public Utleiekontor finnUtleieKontor(String utleiekontorString) {

		Utleiekontor utleiekontor = new Utleiekontor();

		for (Utleiekontor k : utleiekontorer) {
			if (k.getUtleiekontorNavn().equals(utleiekontorString)) {
				utleiekontor = k;
			}
		}

		return utleiekontor;

	}

	public void opprettBilerOgKontorer() {

		Bil b1 = new Bil("ST2323", "BMW", "S3", "Hvit", "GruppeA",124000);
		Bil b2 = new Bil("EL8756", "Tesla", "Roadster", "Blå", "GruppeA",75000);
		Bil b3 = new Bil("ST2323", "Audi", "A4", "Hvit", "GruppeA",200000);
		Bil b4 = new Bil("ST2323", "Opel", "Astra", "Grønn", "GruppeA",170000);
		Bil b5 = new Bil("ST2323", "Ford", "Focus", "Rød", "GruppeA",54000);

		List<Bil> l1 = new ArrayList<Bil>(Arrays.asList(b2, b3, b5));
		List<Bil> l2 = new ArrayList<Bil>(Arrays.asList(b4, b1, b5));
		List<Bil> l3 = new ArrayList<Bil>(Arrays.asList(b2, b1, b5));
		List<Bil> l4 = new ArrayList<Bil>(Arrays.asList(b2, b3, b4));

		Utleiekontor utleiekontor1 = new Utleiekontor("Bergen", 65786578, "Hovedgate1", l1);
		Utleiekontor utleiekontor2 = new Utleiekontor("Oslo", 65786578, "Hovedgate2", l2);
		Utleiekontor utleiekontor3 = new Utleiekontor("Stavanger", 65786578, "Hovedgate3", l3);
		Utleiekontor utleiekontor4 = new Utleiekontor("Trondheim", 65786578, "Hovedgate4", l4);

		leggTilUtleiekontorer(utleiekontor1);
		leggTilUtleiekontorer(utleiekontor2);
		leggTilUtleiekontorer(utleiekontor3);
		leggTilUtleiekontorer(utleiekontor4);

	}
	
	
	public String parseDato(String datoString) {
		
		String[] dato = datoString.split("-");
		
		for(String d : dato) {
			System.out.println(d);
		}
		
		return "test";
	}
	
	

}
