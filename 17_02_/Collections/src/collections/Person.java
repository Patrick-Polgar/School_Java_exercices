package collections;

public class Person {
	private String vorname;

	public Person(String vorname) {
		super();
		this.vorname = vorname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	@Override
	public String toString() {
		return "Person [vorname=" + vorname + "]";
	}
	
	

}
