package no.hvl.dat109.bil;

import java.util.Date;

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
	private String gruppe;
	private int pris;
	private Date resFra = null;
	private Date resTil = null;
	private int km;
	

	public Bil() {
	};

	public Bil(String regnr, String merke, String modell, String farge, String gruppe, int pris,  int km) {
		this.regnr = regnr;
		this.merke = merke;
		this.modell = modell;
		this.farge = farge;
		this.gruppe = gruppe;
		this.pris = pris;
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

	public Date getResFra() {
		return resFra;
	}

	public void setResFra(Date resFra) {
		this.resFra = resFra;
	}

	public Date getResTil() {
		return resTil;
	}

	public void setResTil(Date resTil) {
		this.resTil = resTil;
	}

	public int getPris() {
		return pris;
	}

	public void setPris(int pris) {
		this.pris = pris;
	}

	@Override
	public String toString() {
		return "Bil [regnr=" + regnr + ", merke=" + merke + ", modell=" + modell + ", farge=" + farge + ", gruppe="
				+ gruppe + ", pris=" + pris + ", resFra=" + resFra + ", resTil=" + resTil + ", km=" + km + "]";
	}

	
	

}
