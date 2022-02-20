package finanzamt;

public class Unternehmen extends Organisation{

	public Unternehmen(String steuerNr, String name) {
		super(steuerNr, name);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public double berechneEinnahmen() {
		return 0;
	}

	@Override
	public double getSteuersatz() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
