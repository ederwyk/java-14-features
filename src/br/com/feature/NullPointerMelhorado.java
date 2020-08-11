package br.com.feature;

public class NullPointerMelhorado {

	public static void nullPointerMelhorado() {
		String [][] matriz = new String[5][5];
		matriz[1] = new String[5];		
		
		matriz[1][0].toUpperCase().equals("S");
	}
	
}
