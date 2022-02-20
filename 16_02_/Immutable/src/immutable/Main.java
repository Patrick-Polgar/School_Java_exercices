package immutable;

public class Main {

	public static void main(String[] args) {
		
		char[] array=new char[4];
		array[0]='W';
		array[1]='o';
		array[2]='r';
		array[3]='t';
		
		int zahl=14;
		
		
		Immutable immu=new Immutable(zahl, array);
		zahl=15;
		//Problem Nr 1:
		// da ich immer noch zugriff habe per referenz auf das array, kann ich indirekt im "immutable" ändern!
		char[] temp=immu.getZeichenkette();
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]);
		}
		
		array[0]='T';
		temp=immu.getZeichenkette();
		System.out.println();
		for(char z : temp) {
			System.out.print(z);
		}
		
		//Problem Nr. 2
		// wenn der getter im immutable die referenz auf das geklonte array liefert, dann kann ich es hier auch ändern:
		char[] cNeu=immu.getZeichenkette();
		cNeu[0]='X';
		System.out.println();
		char[] arrAusImmutable=immu.getZeichenkette();
		for(char z : arrAusImmutable) {
			System.out.print(z);
		}

	}

}
