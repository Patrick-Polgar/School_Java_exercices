package finanzamt;

public class FinanzFeatures {
	
	
	public static double berechneSteuern(ISteuern kunde) {
		double einnahmen=kunde.berechneEinnahmen();
		double satz=kunde.getSteuersatz();
		return (einnahmen/100)*satz;
	}
	
	public static double berechneZuVersteuerndesGesamteinkommen(ISteuern[] kunden) {
		double gesamtEinkommen=0;
		for(int i=0; i<kunden.length;i++) {
			gesamtEinkommen+=kunden[i].berechneEinnahmen();
		}
		return gesamtEinkommen;
	}
	

}
