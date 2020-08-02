package br.com.feature;

public record CachorroRecord (
		Integer id, 
		String name) {
	
	//Construtor vazio
	public CachorroRecord() {
		this.id = null;
		this.name = "";
	}
	
}
