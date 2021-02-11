package no.hvl.dat109.bil;

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
	private String gruppe; // utleiegruppe

	private boolean erLedig;
	// private Date utleiePeriode;

	public boolean isErLedig() {
		return erLedig;
	}

	public void setErLedig(boolean erLedig) {
		this.erLedig = erLedig;
	}

	public Bil(String regnr, String merke, String modell, String farge, String gruppe) {
		this.regnr = regnr;
		this.merke = merke;
		this.modell = modell;
		this.farge = farge;
		this.gruppe = gruppe;

	}

	@Override
	public String toString() {
		return "Bil [regnr=" + regnr + ", merke=" + merke + ", modell=" + modell + ", farge=" + farge + ", gruppe="
				+ gruppe + ", erLedig=" + erLedig + "]";
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


}
