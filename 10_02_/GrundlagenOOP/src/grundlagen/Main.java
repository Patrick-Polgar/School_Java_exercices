package grundlagen;

import test.Teilnehmer;

public class Main {
	
	//Attribute/Member
	protected int zahl; //primitive Instanzvariable
	private static int wert; //primitive Klassenvariable
	private String text; //komplexe Instanzvariable vom Typ String - die Variable mit dem Bezeichner "text" ist vom Typ String und eine Referenzvariable
	boolean maennlich;
	private static int globalerWert;
	/*
	 * 	Referenzvariablen speichern die Adresse auf dem Heap, über welche das Objekt angesprochen werden kann
	 * 
	 */

	public static void main(String[] args) { //Signatur einer Methode
		Main m=new Main();
		System.out.println(m);
		//lokale primitive Variable: -> Alle Variablen, welche innerhalb von Methoden erzeigt werden, nennen wir "lokal" !
		int x=9;
		
		globalerWert=10;
		m.globalerWert=11;
		m.macheA(x);
		m.maennlich=true;
		System.out.println("x nach dem Aufruf: " + x);
		Person p=new Person("Olaf", x);
		Person p1=new Person("Peters", 38);
		Administrator admin=new Administrator();
		Teilnehmer pruefling=new Teilnehmer("Peter");
		pruefling.pruefeVolljaehrigkeit();
		
		
	}
	
	//Merke: In Java findet IMMER Call-By-Value statt(es gibt in Java kein Call-By-Reference)
	//-> Call-By-Value: Es wird IMMER eine Wertekopie übergeben(bei primitiven -> der gespeicherte Wert wird kopiert, bei 
															   // Referenzvariablen -> die Adresse des Objekts)
	public void macheA(int x) {
		
		int var;
		
		maennlich=true;
		x=x+1;
		System.out.println(x + " in macheA");
	}
	
	/*
	 * 	Die Sichtbarkeitsmodifizierer:
	 * 
	 * 		-> public: Element ist überall sichtbar
	 * 
	 * 		-> private: Nur in der Klasse sichtbar, in welcher sich das Element befindet
	 * 
	 * 		-> default(kein expliziter Sichtbarkeitsmodifizierer): Element ist paketweit sichtbar
	 * 			-> In Unterklassen, welche sich in anderen Paketen befinden nicht sichtbar
	 * 
	 * 
	 * 		-> protected: Element ist paketweit sichtbar
	 * 			-> Auch sichtbar in Unterklassen, welche sich in anderen Paketen befinden
	 * 
	 * 
	 * 
	 * 
	 */
	
	/*	Zugriffsmodifizierer:
	 * 
	 * 		-> static:
	 * 
	 * 			- Element sind klassengebunden und existieren im Speicher zu Programmstart UNABHÄNGIG von Objekten!
	 * 			- Element existiert nur EIN MAL im Speicher!(Alle Objekte der Klasse teilen sich also ein static-Element)
	 * 			- Werden normalerweise angesprochen per Klassenname.element
	 * 			- Auch über Referenzvariablen der Klasse können static-Elemente angesprochen werden
	 * 			- Aus statischen Methoden heraus kann man DIREKT nur etwas ansprechen(Attribut/Methode), was selbst auch static ist
	 * 				-> Alternative: Objekt erzeugen - dann kann man auch alles andere per Referenz ansprechen
	 * 
	 * 		-> final
	 * 
	 * 			- Man kann Klassen, Attribute und Methoden auf final setzen
	 * 			- Eine final Klasse kann nicht mehr erweitert werden -> Compilerfehler
	 * 			- final Methoden können in Unterklassen nicht überschrieben werden
	 * 			- Attribute, welche final sind, können nach ihrer ERSTEN Initialisierung keinen anderen Wert mehr zugewiesen bekommen!
	 * 			
	 * 				-> Konstanten sind in aller Regel static und final:
	 * 
	 * 					static final double STEUERSATZ=24.5;
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	

}

class Test{
	
}





