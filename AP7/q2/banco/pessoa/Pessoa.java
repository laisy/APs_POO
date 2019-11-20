package banco.pessoa; 

import java.io.Serializable;

public abstract class Pessoa implements Serializable{

	private String nome;	
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public abstract String getCod();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Nome : " + nome;
	}
	
	
}
