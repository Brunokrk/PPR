//Alisson Schmitt, Bruno Marchi Pires, Vin�cius Kreutz
package dados;

public class Professor {
	private String nome;
	private String cpf;
	private String senha;
	
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return  this.nome + ": "+ this.cpf;
	}
	
	
}
