package gebaude;

import java.io.Serializable;

public abstract class Gebaeude implements features.IVolumen, Serializable{
	private double hoehe;
	private double breite;
	private double tiefe;
	public double getHoehe() {
		return hoehe;
	}
	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}
	public double getBreite() {
		return breite;
	}
	public void setBreite(double breite) {
		this.breite = breite;
	}
	public double getTiefe() {
		return tiefe;
	}
	public void setTiefe(double tiefe) {
		this.tiefe = tiefe;
	}
	
	
	
	

}
