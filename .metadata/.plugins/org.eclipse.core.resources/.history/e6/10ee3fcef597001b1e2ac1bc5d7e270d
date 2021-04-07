package negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import dados.*;

public class SistemaMonitoria {
	private static SistemaMonitoria instance = null; //singleton
	private List<Materia> materias = new ArrayList<Materia>();
	
	public static SistemaMonitoria getInstance() {
		if(instance == null) {
			instance = new SistemaMonitoria();
		}
		return instance;
	}
	
	public void adicionarMateria(Materia materia) {
		this.materias.add(materia);
	}
	
	public void excluirMateria(Materia materia) {
		for (Materia item : materias) {
			if(item.equals(materia)) {
				materias.remove(item);
			}
		}
	}
	
	public void editarMateria(Materia materia) {
		for (Materia item : materias) {
			if(item.equals(materia)) {
				item = materia;
			}
		}
	}
	
	public void adicionarAluno(Materia materia, Aluno aluno) {
		for (Materia item : materias) {
			if(item.equals(materia)) {
				//Se tiver mesmo id -> equals sobrescrito na classe Materia
				item.adicionarAluno(aluno);
			}
		}
	}
	
	public void adicionarMonitor(Materia materia, Monitor monitor) {
		for (Materia item : materias) {
			if(item.equals(materia)) {
				item.adicionarMonitor(monitor);
			}
		}
	}
	
	public void adicionarProfessor(Materia materia, Professor professor) {
		for (Materia item : materias) {
			if(item.equals(materia)) {
				item.adicionarProfessor(professor);
			}
		}
	}
	
	public void adicionarResposta(Materia materia, Resposta resposta) {
		for (Materia item : materias) {
			if(item.equals(materia)) {
				item.adicionarResposta(resposta);
			}
		}
	}
	
	public void adicionarPost(Materia materia, Post post) {
		for (Materia item : materias) {
			if(item.equals(materia)) {
				item.adicionarPost(post);
			}
		}
	}
	/*
	  criarDiscussao(...)
	  editarDiscussão(...)
	  avaliarMonitor(...)
	  adicionarMateria(...) OK
	  excluirMateria(...) OK
	  editarMateria(...) OK
	  adicionarAluno(...) OK
	  adiconarMonitor(...) OK
	  adicionarProfessor(...) OK
	  adicionarPost(...) OK
	  adicionarResposta(...) OK
	  */
	
	
}
