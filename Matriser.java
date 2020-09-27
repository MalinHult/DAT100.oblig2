package Oblig2;

public class Matriser {
	
	// a)
	public static void skrivUt1(int[][] matrise) {
		for(int i= 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++)
				System.out.print(matrise[i][j]);
			System.out.println();
		}
	}
	
	
	// b)
	public static String tilStreng(int[][] matrise) {
		String streng = "";
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				streng += Integer.toString(j) + "";
			}
			streng += "\n";
		}
		return streng;
	}
	
	// c)
	public static int[][] skaler(int tall, int[][] matrise){
		int[][] newMatrise = new int[matrise.length][matrise[0].length];
		for(int y = 0; y < matrise.length; y++)
			for(int k = 0; k < matrise[y].length; k++)
				newMatrise[y][k] = matrise[y][k] * tall;
		return newMatrise;
	}
	
	
	// d)
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		for(int i = 0; i < mat1.length;) {
			for(int j = 0; j < mat1[i].length;) {
		if (mat1[i] == mat2[i])
			return true;		
				}
			}
		return false;
		}
	}
