package no.hvl.dat109.kunder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Gruppe 44
 *
 */
public class KundeServer {

	static List<Kundeinformasjon> server = new ArrayList<Kundeinformasjon>();

	public static void leggTilKunde(Kundeinformasjon kundeinformasjon) {
		server.add(kundeinformasjon);
	}

	/**
	 * Metode for å fjerne en kunde
	 * 
	 * @param kundeinformasjon
	 */
	public static void fjernKunde(Kundeinformasjon kundeinformasjon) {

		for (Kundeinformasjon kunde : server) {
			if (kunde.getPerson().getFornavn().equals(kundeinformasjon.getPerson().getFornavn())
					&& kunde.getPerson().getEtternavn().equals(kundeinformasjon.getPerson().getEtternavn())) {
				server.remove(kunde);
			}
		}
	}

	/**
	 * Metode for å finne en kunde
	 * 
	 * @param regnr
	 * @return Kundeinformasjon
	 */
	public static Kundeinformasjon finnKunde(String regnr) {

		Kundeinformasjon kundeinformasjon = null;

		for (Kundeinformasjon kunde : server) {
			if (kunde.getBil().getRegnr().equals(regnr)) {
				kundeinformasjon = kunde;
			}

		}

		return kundeinformasjon;

	}

	/**
	 * TESTMetode for å skrive ut hvilken bil en kunde har leiet (kosoll)
	 */
//	public static void SkrivUtServer() {
//
//		for (Kundeinformasjon k : server) {
//			System.out.println(k.getPerson().toString() + " " + k.getBil().toString());
//		}
//
//	}

}
