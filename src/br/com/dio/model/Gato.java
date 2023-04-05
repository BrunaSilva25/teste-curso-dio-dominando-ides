package br.com.dio.model;

import java.util.Objects;

public class Gato {
// ctrl+3 cria construtor que pode ser vazio digita constru..
	// ctrl+d apaga linha
	// crtl+3 = atalho gerar coisas )generate get and setters
	// alt seta pra cima muda bloco de codigo selecionado de lugar
	// Refatoracao organizacao e codigo crtl + shift + f
	private String nome;
	private String cor;
	private Integer idade;

	public Gato() {
	}

//crtl 3 generate get setters
	public Gato(String nome, String cor, Integer idade) {
		// super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

//crtl 3 generate equals
	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	// crtl 3 tostring
	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}

	/*
	 * public Gato(String nome, String cor, Integer idade) { this.nome= nome;
	 * this.cor = cor; this.idade = idade;
	 * 
	 * }
	 */

}
