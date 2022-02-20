package singleton;
/*
 * 	Entwurfsmuster/Design Pattern:
 * 
 * 		-> Best Practices f�r Probleme mit einer gewi�en Komplexit�t in der OOP, welche immer wieder auftauchen
 * 
 * 		-> Werden in aller Regel mit einem Klassendiagramm + Beschreibeungstext beschrieben
 * 
 * 		-> Alle Entwurfsmuster sind im Wandel begriffen und sie werden in der Praxis eher selten 1:1 in den eigenen Code �bernommen
 * 
 * 		-> Fast alle Entwurfsmuster sind unabh�ngig von Programmiersprachen beschrieben)alle Muster k�nnen in jeder OOP-Sprache realisiert werden)
 * 
 * 		-> Alle Entwurfsmuster haben Kritikpunkte, also Vor- und Nachteile!
 * 
 * 		-> DAS ENTWURFSMUSTER SINGLETON:
 * 
 * 			-> Was ist das immer wiederkehrende Problem?
 * 				
 * 				-> Wie designe ich eine Klasse, von der es nur ein einziges Objekt zur Laufzeit geben kann?
 * 
 * 				-> Wann braucht man so etwas?
 * 			
 * 					-> In aller Regel dann, wenn das Programm zentrale Verwaltungsobjekte ben�tigt(Spooler, Diagnose-Manager, Fehler-Manager...)
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

public class Singleton {
	
	private static Singleton singleton;
	
	private Singleton() {
		
	}
	
	public static Singleton getSingleton() {
		if(singleton==null) {
			singleton=new Singleton();
		}
		return singleton;
	}
}
