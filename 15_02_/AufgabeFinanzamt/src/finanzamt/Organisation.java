package finanzamt;

public abstract class Organisation implements ISteuern{
	private String steuerNr;
	private String name;
	private double einkommen;
	private double ausgaben;
	
	public Organisation(String steuerNr, String name) {
		this.steuerNr=steuerNr;
		this.name=name;
	}

	public String getSteuerNr() {
		return steuerNr;
	}

	public void setSteuerNr(String steuerNr) {
		this.steuerNr = steuerNr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	

	public double getEinkommen() {
		return einkommen;
	}

	public void setEinkommen(double einkommen) {
		this.einkommen = einkommen;
	}

	public double getAusgaben() {
		return ausgaben;
	}

	public void setAusgaben(double ausgaben) {
		this.ausgaben = ausgaben;
	}
	
	
	
	
	

}
