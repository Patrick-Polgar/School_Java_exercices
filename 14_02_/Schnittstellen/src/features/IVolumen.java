package features;
/*
 * 	SCHNITTSTELLEN/INTERFACES:
 * 
 * 		- Interfaces kann man nicht instanziieren
 * 		- Alle Methoden in Interfaces sind implizit public und abstract!
 * 		- Klassen k�nnen beliebig viele Schnittstellen implementieren
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public interface IVolumen {
	//interfaces k�nnen konstanten als "attribute" halten -> sind immer alle public static und final!
	int WERT=34;
	
	
	public abstract double getTiefe();
	double getBreite();
	double getHoehe();
	
}
