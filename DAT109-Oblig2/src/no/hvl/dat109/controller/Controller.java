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

		Bil b1 = new Bil("ST58393", "BMW", "S3", "Hvit", "Gruppe A", 750, 124000);
		Bil b2 = new Bil("EL62401", "Tesla", "Roadster", "Blå", "Gruppe A", 750, 75000);
		Bil b3 = new Bil("ST35810", "Audi", "A4", "Hvit", "Gruppe A", 750, 200000);
		Bil b4 = new Bil("ST91724", "Opel", "Astra", "Grønn", "Gruppe A", 750, 170000);
		Bil b5 = new Bil("ST15834", "Ford", "Focus", "Rød", "Gruppe A", 750, 54000);
		Bil b6 = new Bil("ST58396", "BMW", "S3", "Rød", "Gruppe A", 750, 124000);
		Bil b7 = new Bil("EL62491", "Tesla", "Roadster", "Sort", "Gruppe A", 750, 75000);
		Bil b8 = new Bil("ST33810", "Audi", "A4", "Gul", "Gruppe A", 750, 200000);
		Bil b9 = new Bil("ST95624", "Opel", "Astra", "Grønn", "Gruppe A", 750, 170000);
		Bil b10 = new Bil("ST18432", "Ford", "Focus", "Rød", "Gruppe A", 750, 54000);
		
		//Stor bil
		Bil b11 = new Bil("EL60351", "Nissan", "Evalia", "Hvit", "Gruppe C", 1100, 14100);
		Bil b12 = new Bil("ST51485", "Volkswagen", "Caddy", "Blå", "Gruppe C", 1100, 98000);
		Bil b13 = new Bil("ST71942", "Fiat", "Talento", "Sort", "Gruppe C", 1100, 73000);
		Bil b14 = new Bil("ST90248", "Ford", "Transit", "Metallic", "Gruppe C", 1100, 140000);
		Bil b15 = new Bil("ST13522", "Ford", "Caravelle", "Grønn", "Gruppe C", 1100, 151000);
		Bil b16 = new Bil("ST94512", "Citroen", "Berlingo", "Rød", "Gruppe C", 1100, 173000);
		
		//Stasjonsvogn
		Bil b17 = new Bil("ST51284", "Volvo", "V90", "Sort", "Gruppe D", 900, 54000);
		Bil b18 = new Bil("ST71252", "Skoda", "Oktavia", "Metallic", "Gruppe D", 900, 42000);
		Bil b19 = new Bil("ST41270", "Mercedes-Benz", "C200 T", "Blå", "Gruppe D", 900, 96000);
		Bil b20 = new Bil("ST51263", "Mercedes-Benz", "C300e", "Sort", "Gruppe D", 900, 86000);
		Bil b21 = new Bil("ST15050", "Audi", "RS6", "Grå", "Gruppe D", 900, 103000);
		Bil b22 = new Bil("ST62791", "Volkswagen", "Passat", "Hvit", "Gruppe D", 900, 242000);

		List<Bil> l1 = new ArrayList<Bil>(Arrays.asList(b2, b3, b5, b6, b9, b12, b15));
		List<Bil> l2 = new ArrayList<Bil>(Arrays.asList(b4, b1, b5, b7, b17, b18));
		List<Bil> l3 = new ArrayList<Bil>(Arrays.asList(b2, b1, b5, b8, b11, b17));
		List<Bil> l4 = new ArrayList<Bil>(Arrays.asList(b2, b3, b4, b13, b14));
		List<Bil> l5 = new ArrayList<Bil>(Arrays.asList(b19, b20, b21, b22));

		Utleiekontor utleiekontor1 = new Utleiekontor("Bergen", 55292500, "Kanalveien 48", l1);
		Utleiekontor utleiekontor2 = new Utleiekontor("Oslo", 22210000, "Jernbanetorget 1", l2);
		Utleiekontor utleiekontor3 = new Utleiekontor("Stavanger", 51538202, "Olav V s gate 13", l3);
		Utleiekontor utleiekontor4 = new Utleiekontor("Trondheim", 73503500, "Bratsbergvegen 11-13", l4);
		Utleiekontor utleiekontor5 = new Utleiekontor("Bergen, Flesland", 55226075, "Flyplassenvegen 555", l5);
		Utleiekontor utleiekontor6 = new Utleiekontor("Oslo, Gardermoen", 22210000, "Edvard Munchs veg 2060", l4);

		leggTilUtleiekontorer(utleiekontor1);
		leggTilUtleiekontorer(utleiekontor2);
		leggTilUtleiekontorer(utleiekontor3);
		leggTilUtleiekontorer(utleiekontor4);
		leggTilUtleiekontorer(utleiekontor5);
		leggTilUtleiekontorer(utleiekontor6);

	}

	@SuppressWarnings("deprecation")
	public Date stringTilDato(String datoString) {

		System.out.println(datoString);
		
		String[] dato = datoString.split("-");

		Date date = new Date();
		date.setYear(Integer.parseInt(dato[0]));
		date.setMonth(Integer.parseInt(dato[1]));
		date.setDate(Integer.parseInt(dato[2]));
		
		System.out.println(dato[0]);
		System.out.println(dato[1]);
		System.out.println(dato[2]);
		
		System.out.println("mnd: " + date.getMonth());
		
		return date;
	}

	@SuppressWarnings("deprecation")
	public int regnUtPris(Date hentet, Date planlagtLevering, Date faktiskLevering, String reservertAvdeling,
			String faktiskAvdeling) {

		int fastpris = 550;
		int gebyr = 750;

		int dager = faktiskLevering.getDate() - hentet.getDate() + 1;
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















