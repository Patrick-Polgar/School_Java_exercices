package finanzamt;

public class Verein extends Organisation{

	public Verein(String steuerNr, String name) {
		super(steuerNr, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double berechneEinnahmen() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getSteuersatz() {
		// TODO Auto-generated method stub
		return 0;
	}

}
