package init;
/*
 * 	Polymorphie:
 * 
 * 		- Wenn eine Referenzvariable einen Typ erhält, lässt sich dieser nicht mehr ändern
 * 
 * 		- Eine Referenzvariable kann auf alles zeigen, was vom Typ der Variablen selbst oder von einem ihrer Untertypen ist
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
public class Main {

	public static void main(String[] args) {
		Auto karre=new Auto(); //lese: es liegt die referenzvariable karre vor, vom typ Auto, welche auf ein konkretes Auto-Objekt im Heap zeigt
		
		Cabrio cab=new Cabrio();
		karre.fahre();
		karre=cab; //An dieser Stelle passiert implizit ein Upcast von Cabrio -> Auto: Upcast funktioniert immer implizit, kann aber auch explizit geschehen
		karre.fahre();
		
		Cabrio back=(Cabrio)karre; //Hier findet ein expliziter Downcast statt von Auto -> Cabrio! 
		
		Auto auto=new Auto();
		//Cabrio mustang=(Cabrio)auto; //obwohl der Compiler mit diesem expliziten Downcast zufrieden ist, wird die Laufzeit eine ClassCastException werfen
									//-> ClassCastException, weil hinter der Variablen auto niemals vorher ein Cabrio-Objekt gesteckt hat									 
		//Typüberprüfung:
		if(karre instanceof Auto) {
			System.out.println("karre ist vom Typ Auto");
		}
		if(karre instanceof Cabrio) {
			System.out.println("karre ist auch vom Typ Cabrio");
		}
		
				
		if(auto instanceof Cabrio) {
			System.out.println("auto ist vom Typ Cabrio");
		}
		
		Cabrio cabriolet=new Cabrio();
		checkAuto(cabriolet);
		
		Auto fiat=new Auto();
		checkCabrio((Cabrio) fiat);
		
		Jeep jeep=new Jeep();
		
		Object[] arr=new Object[100];
		arr[0]=jeep; //damit das funktioniert, findet hier ein impliziter Upcast statt von Jeep -> Object
		arr[1]=cabriolet;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof Jeep) {
				((Jeep) arr[i]).allRadAntriebON(); //das Objekt an stelle i wird erst per Downcast in Jeep konvertiert und darauf wird dann die spezielle Methode aufgerufen
			}
		}
		
		
		
		
		
	}
	
	private static void checkAuto(Auto a) {
		//wenn hier an diese Methode ein Cabrio-Objekt übergeben wird, kann über die Referenzvariable a NUR das benutzt werden,
		//was der allgemeine Typ Auto kennt - nicht jedoch die ganzen speziellen Cabrio-Methoden!
		
		//wenn man aber trotzdem an die speziellen Methoden kommen möchte, muss man 1. Typ-Prüfungen machen und 2. einen Downcast durchführen
		if(a instanceof Cabrio) {
			Cabrio temp=(Cabrio)a;
			temp.oeffneVerdeck();
		}
	}
	
	private static void checkCabrio(Cabrio c) {
		
	}
	
	

}
