package finanzamt;

public class Partei extends Organisation{

	public Partei(String steuerNr, String name) {
		super(steuerNr, name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double berechneEinnahmen() {
		if(getEinkommen()>getAusgaben()) {
			return getEinkommen()-getAusgaben();
		}
		else
		{
			return getEinkommen();
		}
	}
	

	@Override
	public double getSteuersatz() {
		if(getEinkommen()>getAusgaben()) {
			return 50;
		}
		else {
			return 0;
		}
	}
	
	
	
	
	

}
