package handel;

public class Aktie extends Ware{
	
	private double kursInDollar;
	
	
	public Aktie(String bezeichnung) {
		super(bezeichnung);
	}


	public double getKursInDollar() {
		return kursInDollar;
	}


	public void setKursInDollar(double kursInDollar) {
		this.kursInDollar = kursInDollar;
	}


	@Override
	public double berechnePreis() {
		
		return this.getMenge()*kursInDollar;
	}

	
	
	
}
