//Alisson Schmitt, Bruno Marchi Pires, Vin?cius Kreutz
package dados;

import java.util.ArrayList;
import java.util.List;

public class Monitor {
	private String cpf;
	private String senha;
	private String nome;
	private Double score=0.0;
	private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
	
	
	public void adicionarAvaliacao(Avaliacao avaliacao) {
		avaliacoes.add(avaliacao);
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getScore() {
		return score;
	}
	public void setScore() {
		this.score = 0.0;
		for (Avaliacao av : avaliacoes) {
			this.score = this.score + av.getRanking();
		}
		this.score = this.score / this.avaliacoes.size();
	}
	
	public String toString() {
		return this.nome +": "+ this.cpf;
	}
	
}
