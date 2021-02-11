package no.hvl.dat109.Bil;

/**
 * 
 * @author Gruppe 44
 * 
 * 
 *
 */

public class Bil {
	
	private String regnr;
	private String merke;
	private String modell;
	private String farge;
	private String gruppe;		//utleiegruppe
	private int km;				//kilometerstand
	
	public Bil(String regnr, String merke, String modell, String farge, String gruppe, int km) {
		this.regnr = regnr;
		this.merke = merke;
		this.modell = modell;
		this.farge = farge;
		this.gruppe = gruppe;
		this.km = km;
	}


	public String getRegnr() {
		return regnr;
	}

	public void setRegnr(String regnr) {
		this.regnr = regnr;
	}

	public String getMerke() {
		return merke;
	}

	public void setMerke(String merke) {
		this.merke = merke;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public String getFarge() {
		return farge;
	}

	public void setFarge(String farge) {
		this.farge = farge;
	}

	public String getGruppe() {
		return gruppe;
	}

	public void setGruppe(String gruppe) {
		this.gruppe = gruppe;
	}
	
	public int getKm() {
		return km;
	}
	
	public void setKm(int km) {
		this.km = km;
	}
	
	
	
	
	

}