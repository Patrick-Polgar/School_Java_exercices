package geometrie;

import javax.naming.OperationNotSupportedException;

public abstract class GeometrischeForm implements IForm{

	private Punkt position;

	public GeometrischeForm(Punkt position) {
		super();
		this.position = position;
	}
	
	public abstract double berechneUmfang();
	
	public abstract double berechneFlaeche();

	public Punkt getPosition() throws CloneNotSupportedException {
		return position;
	}

	public void setPosition(Punkt position) throws OperationNotSupportedException {
		this.position = position;
	}
	
	
	
	
}
