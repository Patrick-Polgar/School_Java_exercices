package immutable;
/*
 * 	Das Entwurfsmuster Immutable:
 * 
 * 		-> Was ist das Problem, um welches es hier geht?
 * 
 * 			-> Wie designe ich eine Klasse, deren Objekte nach ihrer Instanziierung nicht mehr änderbar sind(Attribute)?
 * 
 * 		-> Wofür braucht man so etwas?
 * 
 * 			-> Häufig braucht man "robuste" Objekte, welche sich von Manipulationen über Refenrenzweitergabe schützen müssen, um
 * 			   Inkonsistenzen zu verhindern(Identitäten, PK, Elemente auf Sets....)		
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
	
	//alle attribute müssen private sein
	private int zahl;
	private char[] zeichenkette;//hier wird eine objektkopie zugewiesen, nicht die adresse des übergebenen originals!
	
	//die attributwerte werden nur am anfang bei der instanziierung einmalig über den konstruktor gesetzt
	public Immutable(int zahl, char[] array) {
		this.zahl=zahl;
		this.zeichenkette=array.clone(); //hier wird mit der clone-methode aus der superklasse object eine objektkopie des arrays erzeugt
	}

	
	
	//ein immutable bietet KEINE set-methoden an, sondern nur getter:
	public int getZahl() {
		return zahl;
	}

	//wenn getter in einem immutable objekte zurückgegen, dann müssen diese vor der rückgabe ebenfalls kopiert werden!
	public char[] getZeichenkette() {
		return zeichenkette.clone();
	}
	

}
