package geometrie;

public class Punkt implements Cloneable{
	private double posX;
	private double posY;
	
	
	
	public Punkt(double posX, double posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}
	public double getPosX() {
		return posX;
	}
	public void setPosX(double posX) {
		this.posX = posX;
	}
	public double getPosY() {
		return posY;
	}
	public void setPosY(double posY) {
		this.posY = posY;
	}
	
	@Override
	public Punkt clone() throws CloneNotSupportedException{
		return (Punkt) super.clone();
	}
	
	@Override
	public String toString() {
		return "Punkt mit den Koordinaten: x=" + posX + ", y=" + posY;
	}

	
	
}
