package abstrakte;
/*
 * 	ABSTRAKTE KLASSEN:
 * 
 * 		- Abstrakte Klassen kann man nich instanziieren!
 * 
 * 		- Nur abstrakte Klassen dürfen auch abstrakte Methoden beinhalten
 * 
 * 		- Alle abstrakten Methoden einer abstrakten Klasse müssen in konkreten Unterklassen überschrieben werden
 * 
 * 		- Wenn abstrakte Klassen abstrakte Methoden von abstrakten Superklassen erben, dann müssen diese Unterklassen die
 * 		  geerbten Methoden NICHT überschreiben - können aber!
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */



public abstract class Mitarbeiter {
	private double gehalt;
	private String name;
	private String personalNummer;
	private boolean lagerZugang;
	
	//abstrakte Klassen können auch Konstruktoren beinhalten! -> auch in abstrakten Klassen wird der Default-Konstruktor gestellt
	
	
	
	//abstrakte methode
	public abstract double erfasseArbeitsZeit(); 

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonalNummer() {
		return personalNummer;
	}

	public void setPersonalNummer(String personalNummer) {
		this.personalNummer = personalNummer;
	}

	public boolean isLagerZugang() {
		return lagerZugang;
	}

	public void setLagerZugang(boolean lagerZugang) {
		this.lagerZugang = lagerZugang;
	}
	
	
	
	
	

}
