package no.hvl.dat109.kunder;

import java.util.ArrayList;
import java.util.List;

public class KundeServer {

	static List<Kundeinformasjon> server = new ArrayList<Kundeinformasjon>();

	public static void leggTilKunde(Kundeinformasjon kundeinformasjon) {
		server.add(kundeinformasjon);
	}

	public static void fjernKunde(Kundeinformasjon kundeinformasjon) {

		for (Kundeinformasjon kunde : server) {
			if (kunde.getPerson().getFornavn().equals(kundeinformasjon.getPerson().getFornavn())
					&& kunde.getPerson().getEtternavn().equals(kundeinformasjon.getPerson().getEtternavn())) {
				server.remove(kunde);
			}
		}
	}

//	public static Kundeinformasjon finnKunde(String fornavn, String etternavn) {
//
//		Kundeinformasjon kundeinformasjon = null;
//
//		for (Kundeinformasjon kunde : server) {
//			if (kunde.getPerson().getFornavn().equals(fornavn) && kunde.getPerson().getEtternavn().equals(etternavn)) {
//				kundeinformasjon = kunde;
//			}
//
//		}
//
//		return kundeinformasjon;
//		
//	}
	
	public static Kundeinformasjon finnKunde(String regnr) {

		Kundeinformasjon kundeinformasjon = null;

		for (Kundeinformasjon kunde : server) {
			if (kunde.getBil().getRegnr().equals(regnr)) {
				kundeinformasjon = kunde;
				System.out.println("Funnet!");
			}

		}

		return kundeinformasjon;
		
	}
	
	public static void SkrivUtServer() {
		
		for(Kundeinformasjon k : server) {
			System.out.println(k.getPerson().toString() + " " + k.getBil().toString());
		}
		
	}

}
