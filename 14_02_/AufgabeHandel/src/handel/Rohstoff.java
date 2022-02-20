package handel;

public class Rohstoff extends Ware{
	
	private String einheit;
	private double preisProEinheit;
	
	
	public Rohstoff(String bezeichnung) {
		super(bezeichnung);
	}


	public String getEinheit() {
		return einheit;
	}


	public void setEinheit(String einheit) {
		this.einheit = einheit;
	}


	@Override
	public double berechnePreis() {
		// TODO Auto-generated method stub
		return this.getMenge()*preisProEinheit;
	}
	
	
	
	

}
