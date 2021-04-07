package dados;

import java.util.ArrayList;
import java.util.List;

public class Materia {
	private int id;
	private String nome;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private List<Discussao> discussoes = new ArrayList<Discussao>();
	private List<Monitor> monitores = new ArrayList<Monitor>();
	private List<Professor> professores = new ArrayList<Professor>();
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Materia) {
			Materia aux = (Materia)obj;
			if(this.id == aux.getId()) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public List<Post> getPosts(){
		List<Post> posts = new ArrayList<Post>();
		for(Discussao item : discussoes) {
			if(item instanceof Post) {
				posts.add((Post)item);
			}
		}
		return posts;
	}
	
	public List<Resposta> getRespostas() {
		List<Resposta> respostas = new ArrayList<Resposta>();
		for(Discussao item : discussoes) {
			if(item instanceof Resposta) {
				respostas.add((Resposta)item);
			}
		}
		return respostas;		
	}
	
	public void adicionarResposta(Resposta resposta) {
		discussoes.add(resposta);
	}
	
	public void adicionarPost(Post post) {
		//prevista na modelagem dos projetistas
		discussoes.add(post);
	}
	
	public void adicionarProfessor(Professor professor) {
		//prevista na modelagem dos projetistas
		professores.add(professor);
	}
	
	public void adicionarMonitor(Monitor monitor) {
		//prevista na modelagem dos projetistas
		monitores.add(monitor);
	}
	
	public void adicionarAluno(Aluno aluno) {
		//prevista na modelagem dos projetistas
		alunos.add(aluno);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public List<Discussao> getDiscussoes() {
		return discussoes;
	}
	public void setDiscussoes(List<Discussao> discussoes) {
		this.discussoes = discussoes;
	}
	public List<Monitor> getMonitores() {
		return monitores;
	}
	public void setMonitores(List<Monitor> monitores) {
		this.monitores = monitores;
	}
	public List<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	
	
	
}
