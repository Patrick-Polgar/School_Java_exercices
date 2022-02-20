package finanzamt;

public abstract class Person implements ISteuern{
	private String steuerNr;
	private String name;
	private String vorname;
	private double einkommen;
	
	public Person(String steuerNr, String name) {
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

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public double getEinkommen() {
		return einkommen;
	}

	public void setEinkommen(double einkommen) {
		this.einkommen = einkommen;
	}
	
	
	
	
}
