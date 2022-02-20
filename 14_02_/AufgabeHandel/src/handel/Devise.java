package handel;

public class Devise extends Ware{

	private double wechselKursInDollar;
	
	
	public Devise(String bezeichnung) {
		super(bezeichnung);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	public double getWechselKursInDollar() {
		return wechselKursInDollar;
	}





	public void setWechselKursInDollar(double wechselKursInDollar) {
		this.wechselKursInDollar = wechselKursInDollar;
	}





	@Override
	public double berechnePreis() {
		// TODO Auto-generated method stub
		return this.getMenge()*wechselKursInDollar;
	}

	
	
	
}
