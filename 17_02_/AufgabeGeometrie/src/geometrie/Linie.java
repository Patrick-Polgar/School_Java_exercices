package geometrie;

public class Linie {
	private Punkt punktA;
	private Punkt punktB;
	public Linie(Punkt punktA, Punkt punktB) {
		super();
		this.punktA = punktA;
		this.punktB = punktB;
	}
	public Punkt getPunktA() {
		return punktA;
	}
	public void setPunktA(Punkt punktA) {
		this.punktA = punktA;
	}
	public Punkt getPunktB() {
		return punktB;
	}
	public void setPunktB(Punkt punktB) {
		this.punktB = punktB;
	}
	
	public double berechneLaenge() {
		double deltaY=punktB.getPosY()-punktA.getPosY();
		double deltaX=punktB.getPosX()-punktA.getPosX();
		return Math.sqrt((deltaY*deltaY)+(deltaX*deltaX));
		
	}
	@Override
	public String toString() {
		return "Linie [punktA=" + punktA + ", punktB=" + punktB + "]";
	}
	
	

}
