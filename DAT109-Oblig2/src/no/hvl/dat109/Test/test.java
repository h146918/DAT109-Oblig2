package no.hvl.dat109.Test;

import no.hvl.dat109.bil.Bil;
import no.hvl.dat109.utleiekontor.Utleiekontor;

public class test {

	public static void main(String[] args) {
		
		/**
		 * 
		 * 
		 * public Bil(String regnr, String merke, String modell, String farge, String gruppe)
		 * 
		 * 
		 * public Utleiekontor(String utleiekontorNavn, int tlfnr, String adresse) {
		 * 
		 */
		
		
		Bil bil1 = new Bil("A", "BMW", "E30", "RØD0", "B");
		bil1.setErLedig(true);
		Utleiekontor BGO = new Utleiekontor("BGO", 5632, "BlaBla");
		BGO.leggTilBil(bil1);
		
		
		
		System.out.println(BGO.listeOverLedigeBiler().toString());
		
		
		

	}

}
