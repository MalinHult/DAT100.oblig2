package Oblig2;

public class Tabeller {

	// a)
	public static void skrivUt (int[] tabell) {
		for(int e : tabell) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	
	// b)
	public static String tilStreng (int[] tabell) {
		String streng = "[";
		for(int i = 0; i < tabell.length; i++) {
			if(i == tabell.length - 1) {
				streng += (i);
			} else {
				streng += (i + ",");
		}
		}
		streng +="]";
		return streng;
	}
	
	
	// c)
	public static int summer (int[] tabell) {
		int sum = 0;
		for(int verdi : tabell) {
			sum += verdi;
		}
		return sum;
	}
	
	
	// d)
	public static boolean finnesTall (int[] tabell, int tall) {
		for(int i = 0; i < tabell.length; i ++) {
			if (tabell[i] == tall)
			return true;
		}
		return false;
	}
	
	
	// e)
	public static int posisjonTall (int[] tabell, int tall) {
		int index, storst;
		index = 0;
		storst = tabell[0];
		for(int i = 1; i < tabell.length; i++) {
			if(tabell[i] > storst) {
				storst = tabell[i];
				index = 1;
			}
		}
		return index;
	}
	
	
	// f)
	public static int[] reverser (int[] tabell) {
		int sistePos = tabell.length - 1;
		for(int i = 0; i <= sistePos/2; i++) {
			int proTem = tabell[i];
			tabell[i] = tabell[sistePos-i];
			tabell[sistePos-i] = proTem;
		}
		return tabell;
	}
	
	
	// g)
	public static boolean erSortert (int[] tabell) {
		int j = 0;
		boolean sortert = true;
		while (sortert && j < tabell.length - 1) {
			if (tabell[j] > tabell[j+1]) {
				sortert = false;
			}
			j++;
		}
		return sortert;
	}
	
	
	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int nyLengde = tabell1.length + tabell2.length;
		int[] nyTabell = new int[nyLengde];
		for(int i = 0; i < tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}
		for(int j = 0; j < tabell2.length; j++) {
			nyTabell[tabell1.length+j] = tabell2[j];
		}
		return nyTabell;
	}
}
