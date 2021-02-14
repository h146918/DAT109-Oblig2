package no.hvl.dat109.person;

public class Leieinformasjon {
	
	private String utleieavdeling;
	private String returavdeing;
	private String fraDato;
	private String tilDato;
	
	public Leieinformasjon(String utleieavdeling, String returavdeing, String fraDato, String tilDato) {
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

	public String getFraDato() {
		return fraDato;
	}

	public void setFraDato(String fraDato) {
		this.fraDato = fraDato;
	}

	public String getTilDato() {
		return tilDato;
	}

	public void setTilDato(String tilDato) {
		this.tilDato = tilDato;
	}
	
	

}
