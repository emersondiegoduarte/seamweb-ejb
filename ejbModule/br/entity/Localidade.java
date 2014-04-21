package br.entity;

public enum Localidade {
	
	SAO_PAULO("São Paulo"),
	RIO_DE_JANEIRO("Rio de Janeiro"),
	FORTALEZA("Fortaleza");
	
	private Localidade(String nome) {
		this.nome = nome;
	}
	
	private final String nome;

	public String getNome() {
		return nome;
	}

	
	

}
