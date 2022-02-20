package debug;
import gebaude.*;
import moebel.*;
import features.*;
public class Main {

	public static void main(String[] args) {
		Holzhaus huette=new Holzhaus();
		huette.setBreite(5);
		huette.setHoehe(4);
		huette.setTiefe(3.5);
		
		Kleiderschrank schrank=new Kleiderschrank();
		schrank.setBreite(4);
		schrank.setHoehe(2.25);
		schrank.setTiefe(1);
		
		System.out.println("Volumen der Holzhütte: " + VolumenFeatures.berechneVolumen(huette));
		System.out.println("Volumen des Kleiderschranks: " + VolumenFeatures.berechneVolumen(schrank));
		
		IVolumen[] elemente=new IVolumen[10];
		elemente[0]=huette;
		elemente[1]=schrank;
		
		IVolumen[] arr= {huette, schrank};
		
		System.out.println("gesamtvolumen: " + berechneGesamtVolumen(elemente));

	}
	
	//gesamtvolumen berechnen:
	public static double berechneGesamtVolumen(IVolumen[] v) {
		double gesamtVolumen=0;
		for(int i=0;i<v.length;i++) {
			if(v[i]!=null) {
				gesamtVolumen+=VolumenFeatures.berechneVolumen(v[i]);
			}
		}
		return gesamtVolumen;
	}
	
	
	

}
