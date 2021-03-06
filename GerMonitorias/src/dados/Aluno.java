package dados;

public class Aluno {
	private String nome;
	private String senha;
	private String cpf;
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Aluno) {
			Aluno aux = (Aluno)obj;
			if(this.cpf == aux.getCpf()) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
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
	
	public String toString() {
		return this.nome + ": "+this.cpf;
	}
}
