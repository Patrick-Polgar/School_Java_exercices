package init;

import geometrie.*;

public class Main {

	public static void main(String[] args) {
		Linie rA=new Linie(new Punkt(12, 12), new Punkt(14, 14));
		Linie rB=new Linie(new Punkt(10, 10), new Punkt(8, 8));
		
		Rechteck r=new Rechteck(rA, rB, new Punkt(0,0));

		Punkt p1=new Punkt(30, 30);
		
		new Main().formAusgabe(r);
	}
	
	public void formAusgabe(GeometrischeForm form) {
		System.out.println(form);
	}
	
	
	

}
