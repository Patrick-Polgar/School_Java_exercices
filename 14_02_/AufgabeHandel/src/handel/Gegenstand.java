package handel;

public class Gegenstand extends Ware{
	
	private double preisProStueck;

	public Gegenstand(String bezeichnung) {
		super(bezeichnung);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	public double getPreisProStueck() {
		return preisProStueck;
	}





	public void setPreisProStueck(double preisProStueck) {
		this.preisProStueck = preisProStueck;
	}





	@Override
	public double berechnePreis() {
		// TODO Auto-generated method stub
		return this.getMenge()*preisProStueck;
	}
	
	
	

}
