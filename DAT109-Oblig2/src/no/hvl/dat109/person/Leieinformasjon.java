package no.hvl.dat109.person;

import java.util.Date;

public class Leieinformasjon {
	
	private String utleieavdeling;
	private String returavdeing;
	private Date fraDato;
	private Date tilDato;
	
	public Leieinformasjon(String utleieavdeling, String returavdeing, Date fraDato, Date tilDato) {
		this.utleieavdeling = utleieavdeling;
		this.returavdeing = returavdeing;
		this.fraDato = fraDato;
		this.tilDato = tilDato;
	}

	public String getUtleieavdeling() {
		return utleieavdeling;
	}

	public void setUtleieavdeling(String utleieavdeling) {
		this.utleieavdeling = utleieavdeling;
	}

	public String getReturavdeling() {
		return returavdeing;
	}

	public void setReturavdeling(String returavdeing) {
		this.returavdeing = returavdeing;
	}

	public String getReturavdeing() {
		return returavdeing;
	}

	public void setReturavdeing(String returavdeing) {
		this.returavdeing = returavdeing;
	}

	public Date getFraDato() {
		return fraDato;
	}

	public void setFraDato(Date fraDato) {
		this.fraDato = fraDato;
	}

	public Date getTilDato() {
		return tilDato;
	}

	public void setTilDato(Date tilDato) {
		this.tilDato = tilDato;
	}


	
	

}
