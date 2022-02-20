package immutable;
/*
 * 	Das Entwurfsmuster Immutable:
 * 
 * 		-> Was ist das Problem, um welches es hier geht?
 * 
 * 			-> Wie designe ich eine Klasse, deren Objekte nach ihrer Instanziierung nicht mehr �nderbar sind(Attribute)?
 * 
 * 		-> Wof�r braucht man so etwas?
 * 
 * 			-> H�ufig braucht man "robuste" Objekte, welche sich von Manipulationen �ber Refenrenzweitergabe sch�tzen m�ssen, um
 * 			   Inkonsistenzen zu verhindern(Identit�ten, PK, Elemente auf Sets....)		
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
 * 
 * 
 * 
 * 
 * 
 */
public final class Immutable {
	
	//alle attribute m�ssen private sein
	private int zahl;
	private char[] zeichenkette;//hier wird eine objektkopie zugewiesen, nicht die adresse des �bergebenen originals!
	
	//die attributwerte werden nur am anfang bei der instanziierung einmalig �ber den konstruktor gesetzt
	public Immutable(int zahl, char[] array) {
		this.zahl=zahl;
		this.zeichenkette=array.clone(); //hier wird mit der clone-methode aus der superklasse object eine objektkopie des arrays erzeugt
	}

	
	
	//ein immutable bietet KEINE set-methoden an, sondern nur getter:
	public int getZahl() {
		return zahl;
	}

	//wenn getter in einem immutable objekte zur�ckgegen, dann m�ssen diese vor der r�ckgabe ebenfalls kopiert werden!
	public char[] getZeichenkette() {
		return zeichenkette.clone();
	}
	

}
