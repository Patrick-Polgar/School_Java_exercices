package abstrakte;

public abstract class Lagerarbeiter extends Mitarbeiter{
	private String lagerBereich;
	
	//abstrakte methode
	public abstract void inventur();

	public String getLagerBereich() {
		return lagerBereich;
	}

	public void setLagerBereich(String lagerBereich) {
		this.lagerBereich = lagerBereich;
	}
	
	
	

}
