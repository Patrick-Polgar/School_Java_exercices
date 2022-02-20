package abstrakte;

public class MitarbeiterFeatures {

	
	
	public static double berechneGesamtArbeitsZeit(Mitarbeiter[] mitarbeiterListe) {
		double arbeitsZeitGesamt=0;
		for(int i=0;i<mitarbeiterListe.length;i++) {
			arbeitsZeitGesamt+=mitarbeiterListe[i].erfasseArbeitsZeit();
		}
		return arbeitsZeitGesamt;
		
	}
	
}
