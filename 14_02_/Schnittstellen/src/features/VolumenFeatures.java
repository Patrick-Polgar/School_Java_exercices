package features;

public class VolumenFeatures {
	public static double berechneVolumen(IVolumen v) {
		return v.getBreite()*v.getHoehe()*v.getTiefe();
	}

}
