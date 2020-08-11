package br.com.feature;

public class Switch {

	public static Integer meuEnumerador(Status key) {
		return switch (key) {
			case ATIVO -> 1;
			case INATIVO, QUANTICO -> 0;
		};
	}
	
	public static Integer meuEnumerador2(Status key) {
		return switch (key) {
			case ATIVO: 
				yield 1;
			case INATIVO, QUANTICO: 
				yield 0;
		};
	}
	
	enum Status {
		ATIVO,
		INATIVO,
		QUANTICO
	}
	
	
	
}
