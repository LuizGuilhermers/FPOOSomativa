package Desafio04;

public class Pessoa {
	
	private String nome;
	private int idade;
	//private limita o acesso dos atributos 
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome; //this é uma maneira utilizada para renomear um atributo
		//o nome nome será de utilização específica dentro da classe
		//diferenciando assim, de seu nome nas outras classes do pacote
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
