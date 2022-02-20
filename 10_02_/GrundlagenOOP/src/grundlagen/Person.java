package grundlagen;

public class Person {
	//Merke: Bei der Instanziierung einer Klasse werden alle Attribute auf Standard-Werte gesetzt:
	//	int -> 0
	//  boolean -> false
	//  double -> 0.0
	//  String -> null
	//  alle Referenzvariablen werden also demnach per Default auf null gesetzt
	private String name;
	protected String vorname;
	private int alter;
	private boolean weiblich;
	private String personalNummer="1AHH66768";
	private final int[] arr; //final: hier kann man kein neues int-Array mehr zuweisen, man kann das zugewiesene jedoch ändern
	
	//Konstruktoren:
	//Hauptaufgaben: Reservieren von Ressourcen und das Setzen von Init-Werten für wichtige Attribute
	/*public Person() {
		alter=18;
	}*/
	public Person(String name, int alter) {
		this.alter=alter;
		this.name=name;
		arr=new int[12]; //final-Attribute, welche einen komplexen Datentyp haben, müssen spätestens im Konstruktor initialisiert werden!
	}
	
	
	public Person initPerson(String personalnummer) {
		Person temp=new Person(this.name, this.alter);
		temp.personalNummer=personalnummer;
		return temp;
	}
	
	
	protected void spreche(String text) {
		
	}
	
	//überladene methoden
	public boolean pruefeVolljaehrigkeit() {
		if(this.alter>=18) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//überladene methode
	public boolean pruefeVolljaehrigkeit(boolean usa) {
		boolean volljaehrig=false;
		if(usa) {
			if(this.alter>=21) {
				volljaehrig=true;
			}
			else {
				volljaehrig=false;
			}
		}else {
			pruefeVolljaehrigkeit();
		}
		return volljaehrig;
	}
	
	
	/*
	 * 		Überladen von Methoden:
	 * 
	 * 			- Methodenname muss identisch sein
	 * 			- Parameterliste muss sich unterscheiden
	 * 			- Rückgabetyp kann anders sein, muss aber nicht
	 * 			- Sichtbarkeit kann anders sein, muss aber nicht
	 * 			- Methoden können auch in Unterklassen überladen werden
	 * 
	 * 
	 * 		Überschreiben von Methoden:
	 * 
	 * 			- Methodenname muss identisch sein
	 * 			- Parameterliste muss identisch sein
	 * 			- Sichtbarkeit kann OFFENER sein, aber nicht enger!
	 * 			- Rückgabetyp muss kovariant sein
	 * 
	 * 				-> Kovarianz: Alles vom selben Typ inklusiver aller Untertypen
	 * 				-> Kontravarianz: Alles vom selben Typ inklusive aller Supertypen
	 * 				-> Invarianz: Typ muss der selbe bleiben, darf sich nicht ändern
	 * 
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
	
	
	
	
	
}
