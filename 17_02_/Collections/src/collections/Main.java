package collections;

import java.util.*;

/*
 * 	Collections:
 * 
 * 		-> Eine Klassensammlung, welche dafür geschaffen wurde, Elementsammlungen zu verwalten
 * 		-> Je nach Collectiontyp, werden entsprechend eine Reihe von Operationen auf die Elementsammlung angeboten
 * 
 * 
 * 		-> Die wichtigsten Grundtypen der Collections:
 * 
 * 			1. Collections vom Typ List
 * 			2. Colelctions vom Typ Set
 * 			3. Collections vom Typ Map
 * 
 * 
 * 		-> Merke: ALLES wird auf Collections vom Typ Object gespeichert!!!  -> Upcast nach Object
 * 
 * 		-> Alle relevanten Klassen und Schnisstellen der Collection API befinden sich im package java.util
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
@SuppressWarnings("all")
public class Main {
	
	public static void main(String[] args) {
		//Collections vom Typ List(implementieren alle das Interface List)
		//Haupteigenschaften von List:
		/*
		 * 	-> Speichern zusammenhängende Elemente, auf welche sequenziell oder wahlfrei zugegriffen werden kann
		 * 	-> wachsen und schrumpfen dynamisch - es gibt also nie "Lücken"
		 *  -> bieten einen Iterator an
		 *  -> neue Elemente werden standardmässig hinten angefügt
		 *  -> man kann aber auch Elemente gezielt an einer bestimmten Position in der Liste einfügen
		 *  -> Listen haben eine Index(wie Arrays)
		 * 	-> Einfügereihenfolge = Ausgabereihenfolge
		 * 
		 * 
		 */
		
		ArrayList arrLi=new ArrayList();
		Auto a=new Auto();
		a.setPs(120);
		a.setHersteller("VW");
		
		arrLi.add(a);
		Person p=new Person("Otto");
		arrLi.add(p);
		
		//liste per schleife klassisch durchlaufen:
		for(int i=0;i<arrLi.size();i++) {
			System.out.println(arrLi.get(i));
		}
		
		//durchlaufen per Iterator:
		Iterator it=arrLi.iterator();
		
		while(it.hasNext()) {
			Object temp=it.next();
			if(temp instanceof Auto) {
				Auto a1=(Auto)temp;
			}
			System.out.println(temp);
			//während des iterierens sollte die next() immer nur einmal aufgerufen werden
			//wenn man während des iterierens löschen möchte, dann immer nur mit der remove() des iterators!
		}
		
		//repräsentiert eine doppelt verkettete, lineare liste -> besonders performant bei massiven einfüge-/löschoperationen
		LinkedList lili=new LinkedList();
		
		
	}

}
