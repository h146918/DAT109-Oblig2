package no.hvl.dat109.validator;


public class Validator {

	public boolean isValidFirstname(String s) {

		return s.length() >= 2 && s.length() <= 20 && s.substring(0, 1).equals(s.substring(0, 1).toUpperCase());

	}

	public boolean isValidLastname(String s) {

		return s.length() >= 2 && s.length() <= 20 && s.substring(0, 1).equals(s.substring(0, 1).toUpperCase())
				&& !s.contains(" ");

	}

	public boolean isValidNumber(String s) {
		return s != null && s.matches(("\\d{8}$"));
	}
	

	
	public boolean isEqual(String s, String s2) {
		return s.equals(s2);
	}
	
	
}
