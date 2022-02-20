package geometrie;

public class GeometrieFeatures {
	
	private static GeometrieFeatures features;
	
	
	private GeometrieFeatures() {
		
	}

	public static double berechneGesamtUmfang(IForm[] formen) {
		double gesamtUmfang=0;
		for(int i=0;i<formen.length;i++) {
			if(formen[i]!=null) {
				gesamtUmfang+=formen[i].berechneUmfang();
			}
		}
		return gesamtUmfang;
	}
	
	public static double berechneGesamtFlaeche(IForm[] formen) {
		double gesamtFlaeche=0;
		for(int i=0;i<formen.length;i++) {
			if(formen[i]!=null) {
				gesamtFlaeche+=formen[i].berechneFlaeche();
			}
		}
		return gesamtFlaeche;
	}
	
	public static GeometrieFeatures getFeatures() {
		if(features==null) {
			features=new GeometrieFeatures();
		}
		return features;
	}
	
}
