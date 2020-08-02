package br.com.feature;

public class Switch {

	public static Integer meuEnumerador(Status key) {
		return switch (key) {
			case ATIVO -> 1;
			case INATIVO -> 0;
		};
	}
	
	enum Status {
		ATIVO,
		INATIVO
	}
	
}
