package finanzamt;

public class Stiftung extends Organisation{

	public Stiftung(String steuerNr, String name) {
		super(steuerNr, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSteuersatz() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double berechneEinnahmen() {
		// TODO Auto-generated method stub
		return 0;
	}

}
