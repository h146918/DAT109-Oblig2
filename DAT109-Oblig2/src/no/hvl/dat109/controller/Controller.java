package no.hvl.dat109.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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

		Bil b1 = new Bil("ST58393", "BMW", "S3", "Hvit", "GruppeA", 124000);
		Bil b2 = new Bil("EL62401", "Tesla", "Roadster", "Blå", "GruppeA", 75000);
		Bil b3 = new Bil("ST35810", "Audi", "A4", "Hvit", "GruppeA", 200000);
		Bil b4 = new Bil("ST91724", "Opel", "Astra", "Grønn", "GruppeA", 170000);
		Bil b5 = new Bil("ST15832", "Ford", "Focus", "Rød", "GruppeA", 54000);
		
		//Stor bil
		Bil b6 = new Bil("EL60351", "Nissan", "Evalia", "Hvit", "GruppeC", 14100);
		Bil b7 = new Bil("ST51485", "Volkswagen", "Caddy", "Blå", "GruppeC", 98000);
		Bil b8 = new Bil("ST71942", "Fiat", "Talento", "Sort", "GruppeC", 73000);
		Bil b9 = new Bil("ST90248", "Ford", "Transit", "Metallic", "GruppeC", 140000);
		Bil b10 = new Bil("ST13522", "Ford", "Caravelle", "Grønn", "GruppeC", 151000);
		Bil b11 = new Bil("ST94512", "Citroen", "Berlingo", "Rød", "GruppeC", 173000);
		
		//Stasjonsvogn
		Bil b12 = new Bil("ST51284", "Volvo", "V90", "Sort", "GruppeD", 54000);
		Bil b13 = new Bil("ST71252", "Skoda", "Oktavia", "Metallic", "GruppeD", 42000);
		Bil b14 = new Bil("ST41270", "Mercedes-Benz", "C200 T", "Blå", "GruppeD", 96000);
		Bil b15 = new Bil("ST51263", "Mercedes-Benz", "C300e", "Sort", "GruppeD", 86000);
		Bil b16 = new Bil("ST15050", "Audi", "RS6", "Grå", "GruppeD", 103000);
		Bil b17 = new Bil("ST62791", "Volkswagen", "Passat", "Hvit", "GruppeD", 242000);

		List<Bil> l1 = new ArrayList<Bil>(Arrays.asList(b2, b3, b5, b6, b9, b12, b15));
		List<Bil> l2 = new ArrayList<Bil>(Arrays.asList(b4, b1, b5, b7, b10, b16));
		List<Bil> l3 = new ArrayList<Bil>(Arrays.asList(b2, b1, b5, b8, b11, b17));
		List<Bil> l4 = new ArrayList<Bil>(Arrays.asList(b2, b3, b4, b13, b14));

		Utleiekontor utleiekontor1 = new Utleiekontor("Bergen", 65786578, "Hovedgate1", l1);
		Utleiekontor utleiekontor2 = new Utleiekontor("Oslo", 65786578, "Hovedgate2", l2);
		Utleiekontor utleiekontor3 = new Utleiekontor("Stavanger", 65786578, "Hovedgate3", l3);
		Utleiekontor utleiekontor4 = new Utleiekontor("Trondheim", 65786578, "Hovedgate4", l4);

		leggTilUtleiekontorer(utleiekontor1);
		leggTilUtleiekontorer(utleiekontor2);
		leggTilUtleiekontorer(utleiekontor3);
		leggTilUtleiekontorer(utleiekontor4);

	}

	@SuppressWarnings("deprecation")
	public Date stringTilDato(String datoString) {

		String[] dato = datoString.split("-");

		Date date = new Date(Integer.parseInt(dato[0]), Integer.parseInt(dato[1]), Integer.parseInt(dato[2]));
		
		return date;
	}

	@SuppressWarnings("deprecation")
	public int regnUtPris(Date hentet, Date planlagtLevering, Date faktiskLevering, String reservertAvdeling,
			String faktiskAvdeling) {

		int fastpris = 550;
		int gebyr = 750;

		int dager = faktiskLevering.getDay() - hentet.getDay() + 1;
		int mnd = (faktiskLevering.getMonth() - hentet.getMonth()) * 30;
		int aar = (faktiskLevering.getYear() - hentet.getYear()) * 365;

		System.out.println("Dager: " + dager);
		System.out.println("Mnd: " + mnd);
		System.out.println("År: " + aar);
		
		int total = (dager + mnd + aar) * fastpris;
		
		System.out.println("Total: " + total);

		if (!reservertAvdeling.equals(faktiskAvdeling)) {
			total += gebyr;
			System.out.println("Total m gebyr " + gebyr);
		}
		
		

		return total;
	}

}















