package no.hvl.dat109.kunder;

import no.hvl.dat109.bil.Bil;
import no.hvl.dat109.person.Leieinformasjon;
import no.hvl.dat109.person.Person;

/**
 * 
 * @author Gruppe 44
 *
 */
public class Kundeinformasjon {

	private Person person;
	private Bil bil;
	private Leieinformasjon leieinformasjon;

	public Kundeinformasjon(Person person, Bil bil, Leieinformasjon leieinformasjon) {
		this.person = person;
		this.bil = bil;
		this.leieinformasjon = leieinformasjon;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Bil getBil() {
		return bil;
	}

	public void setBil(Bil bil) {
		this.bil = bil;
	}

	public Leieinformasjon getLeieinformasjon() {
		return leieinformasjon;
	}

	public void setLeieinformasjon(Leieinformasjon leieinformasjon) {
		this.leieinformasjon = leieinformasjon;
	}

}
