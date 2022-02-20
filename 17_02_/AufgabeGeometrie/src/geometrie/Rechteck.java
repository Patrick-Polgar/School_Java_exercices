package geometrie;

public class Rechteck extends GeometrischeForm{
	private Linie seiteA;
	private Linie seiteB;
	
	public Rechteck(Linie seiteA, Linie seiteB, Punkt pos) {
		super(pos);
		this.seiteA = seiteA;
		this.seiteB = seiteB;
	}
	public Linie getSeiteA() {
		return seiteA;
	}
	public void setSeiteA(Linie seiteA) {
		this.seiteA = seiteA;
	}
	public Linie getSeiteB() {
		return seiteB;
	}
	public void setSeiteB(Linie seiteB) {
		this.seiteB = seiteB;
	}
	@Override
	public double berechneUmfang() {
		return 2 * (seiteA.berechneLaenge() + seiteB.berechneLaenge());
	}
	@Override
	public double berechneFlaeche() {
		return seiteA.berechneLaenge()*seiteB.berechneLaenge();
	}
	@Override
	public String toString() {
		return "Rechteck [seiteA=" + seiteA + ", seiteB=" + seiteB + "]";
	}
	
	
	

}
