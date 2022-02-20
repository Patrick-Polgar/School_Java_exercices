package moebel;

public abstract class Moebel implements features.IVolumen{
	private double hoehe;
	private double tiefe;
	private double breite;
	
	public double getHoehe() {
		return hoehe;
	}
	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}
	public double getTiefe() {
		return tiefe;
	}
	public void setTiefe(double tiefe) {
		this.tiefe = tiefe;
	}
	public double getBreite() {
		return breite;
	}
	public void setBreite(double breite) {
		this.breite = breite;
	}
	
	
	
	
}
