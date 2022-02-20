package test;
import grundlagen.Person;

public class Teilnehmer extends Person{
	
	private boolean zerti;
	
	public Teilnehmer(String vorname) {
		super(vorname, 18);
		this.vorname=vorname;
	}
	
	//überschriebene variante der methode
	@Override
	public Teilnehmer initPerson(String pn) {
		return null;
	}
	
	
	@Override
	public void spreche(String text) {
		
	}
	
	
	
	
	
	
}



