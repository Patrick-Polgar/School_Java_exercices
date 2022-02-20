package grundlagen;

//Merke: Jede Klasse in Java hat einen Konstruktor! Wenn der Entwickler keinen eigenen Konstruktor setzt, so wird vom Compiler der
//sogenannte Default-Konstruktor gestellt
public class Administrator{ //wenn eine Klasse nicht explizit von einer anderen Klasse erbt, dann erbt sie implizit immer von Object

	//Default-Konstruktor:
	public Administrator() {
		super(); //hier wird der parameterlose Konstruktor der Superklasse aufgerufen
		//Merke: Aufrufe anderer Konstruktoren per super() oder this() müssen immer die ERSTE Anweisung im Konstruktor sein!
	}
	
	
}
