package collections;

public class Auto {
	
	private int ps;
	private String hersteller;
	
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	public String getHersteller() {
		return hersteller;
	}
	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}
	@Override
	public String toString() {
		return "Auto [ps=" + ps + ", hersteller=" + hersteller + "]";
	}
	
	

}
