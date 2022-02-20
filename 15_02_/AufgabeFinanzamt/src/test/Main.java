package test;
import finanzamt.*;
public class Main {

	public static void main(String[] args) {
		Partei spd=new Partei("0000e", "SPD");
		Partei fdp=new Partei("1111", "FDP");
		Partei cdu=new Partei("uuuuu", "CDU");
		
		spd.setEinkommen(100000);
		spd.setAusgaben(120000);
		fdp.setEinkommen(10000099);
		fdp.setAusgaben(120000);
		cdu.setEinkommen(1000000);
		cdu.setAusgaben(120000);
		
		
		double spdSteuern=FinanzFeatures.berechneSteuern(spd);
		System.out.println("Die SPD muss " + spdSteuern + " Euro zahlen.");
		

	}

}
