//Alisson Schmitt, Bruno Marchi Pires, Vin?cius Kreutz
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
	
	
	public void avaliarMonitor(Materia materia, Monitor monitor, Avaliacao avaliacao){
		for (Materia mat : materias) {
			if(mat.getId() == materia.getId()) {
				for(Monitor moni: mat.getMonitores()) {
					if (moni.getCpf() == monitor.getCpf()) {
						moni.adicionarAvaliacao(avaliacao);
						moni.setScore();
						System.out.println("Score m?dio do monitor:"+ moni.getScore());
					}else {
						System.out.println("Monitor inexistente");
					}
				}	
			}else {
				System.out.println("Materia inexistente");
			}
			
		}
	}
	
	public void adicionarMateria(Materia materia) {
		if (verificaMateria(materia)) {
			System.out.println("Mat?ria j? existe");
		}else {
			this.materias.add(materia);			
		}
	}
	
	public Boolean verificaMateria(Materia materia) {
		for(Materia mat : materias) {
			if (mat.equals(materia)) {
				//materia j? existe
				return true;
			}
		}
		return false;
	}
	
	public void excluirMateria(int id) {
		for(int i=0; i<materias.size(); i++) {
			Materia m = materias.get(i);
			if(m.getId() == id) {
				materias.remove(m);
			}else {
				System.out.println("Mat?ria Inexistente");
			}
		}
	}
	
	public void editarMateria(Materia materia) {
		for (Materia item : materias) {
			if(item.getId() == materia.getId()) {
				System.out.println("Entrou aqui");
				item.setNome(materia.getNome());
			}
		}
	}
	
	public void adicionarAluno(Materia materia, Aluno aluno) {
		for (Materia item : materias) {
			if(item.equals(materia)) {					
				if(item.verificaAluno(aluno)!= true) {
					item.adicionarAluno(aluno);
				}else {
					System.out.println("Aluno j? est? na mat?ria");
				}
				
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

	public Materia getMateriaById(int id) {
		for(Materia item : materias) {
			if(item.getId()== id) {
				return item;
			}else {
				System.out.println("");
			}
		}
		return null;
	}
	
	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}
	
}
