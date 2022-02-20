package handel;

public abstract class Ware {
	private double menge;
	private String bezeichnung;
	
	public Ware(String bezeichnung) {
		this.bezeichnung=bezeichnung;
		
	}
	
	
	public abstract double berechnePreis();
	

	public double getMenge() {
		return menge;
	}

	public void setMenge(double menge) {
		this.menge = menge;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
	
	
	
	

}
