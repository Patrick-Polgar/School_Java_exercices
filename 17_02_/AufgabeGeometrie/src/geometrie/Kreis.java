package geometrie;

import javax.naming.OperationNotSupportedException;

//Immutable

public final class Kreis extends GeometrischeForm{
	private double radius;

	public Kreis(double radius, Punkt pos) throws CloneNotSupportedException {
		super(pos.clone());
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public Punkt getPosition() throws CloneNotSupportedException {
		return this.getPosition().clone();
	}

	@Override
	public double berechneUmfang() {
		return Math.PI*2*radius;
	}

	@Override
	public double berechneFlaeche() {
		return (radius*radius)*Math.PI;
	}
	
	/**
	 * 
	 * Der Aufruf dieser Methode über ein Kreis-Objekt wirft sie ein OperationNotSupprtedExecption
	 * 
	 */
	@Override
	public void setPosition(Punkt p) throws OperationNotSupportedException {
		throw new OperationNotSupportedException("Kreis ist Immutable - setPostion nicht erlaubt");
	}
	

}
