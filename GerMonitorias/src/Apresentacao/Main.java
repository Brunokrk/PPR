//Alisson Schmitt, Bruno Marchi Pires, Vin?cius Kreutz
package Apresentacao;

import java.util.Scanner;
import dados.*;
import negocio.SistemaMonitoria;

public class Main {
	
	private static Scanner s = new Scanner(System.in);
	private static SistemaMonitoria sistema = SistemaMonitoria.getInstance();
	
	public static void main(String[] args) {
		menu();

	}
	
	private static void imprimeMenuGeral() {
		System.out.println("Escolha uma Opera??o");
		System.out.println("0 - Fechar");
		System.out.println("1 - Cadastrar Mat?ria");
		System.out.println("2 - Editar Mat?ria");
		System.out.println("3 - Excluir Mat?ria");
		System.out.println("4 - Adicionar Aluno");
		System.out.println("5 - Adicionar Professor");
		System.out.println("6 - Adicionar Monitor");
		System.out.println("7 - Adicionar Post");
		System.out.println("8 - Adicionar Resposta");
		System.out.println("9 - Mostrar Discuss?o");
		System.out.println("10 - Avaliar Monitor");
		//...
	}
	private static void menu() {
		int opcao = -1;
		while(opcao!=0) {
			imprimeMenuGeral();
			System.out.print("Informe a op??o::::");
			opcao = Integer.parseInt(s.nextLine());
			switch(opcao) {
				case 0:
					break;
				case 1:
					Materia novaMat = novaMateria();
					sistema.adicionarMateria(novaMat);
					printMaterias();
					break;
				case 2:
					Materia nova = editarMateria();
					if(nova!=null) {
						sistema.editarMateria(nova);
						printMaterias();
					}else {
						System.out.println("Mat?ria que deseja editar n?o existe");
					}
					break;
				case 3:
					int id = excluirMateria();
					sistema.excluirMateria(id);
					printMaterias();
					break;
				case 4:
					System.out.println("Informe o id da Materia que deseja cadastrar um Aluno");
					Materia materia = sistema.getMateriaById(getIdMateriaEscolhida());
					Aluno novoAluno = novoAluno();
					sistema.adicionarAluno(materia, novoAluno);
					mostrarAlunos();
					break;
				case 5:
					System.out.println("Informe o id da Materia que deseja cadastrar um Professor");
					Materia materia_ = sistema.getMateriaById(getIdMateriaEscolhida());
					if(materia_ != null) {
						Professor professor = novoProfessor();
						sistema.adicionarProfessor(materia_, professor);
						mostrarProfessores();
					}
					break;
				case 6:
					System.out.println("Informe o id da Materia que deseja cadastrar um Monitor");
					Materia m = sistema.getMateriaById(getIdMateriaEscolhida());
					if(m!= null) {
						Monitor monitor = novoMonitor();
						sistema.adicionarMonitor(m, monitor);
						mostrarMonitores();
					}
					break;
				case 7:
					System.out.println("Informe o id da Materia que deseja cadastrar um post");
					Materia M = sistema.getMateriaById(getIdMateriaEscolhida());
					if(M != null) {
						Post post = novoPost();
						sistema.adicionarPost(M, post);	
					}
					break;
				case 8:
					System.out.println("Informe o id da Materia que deseja cadastrar uma resposta");
					Materia Mat = sistema.getMateriaById(getIdMateriaEscolhida());
					if(Mat != null) {
						Resposta resposta = novaResposta();
						sistema.adicionarResposta(Mat, resposta);
					}
						
					break;
				case 9:
					System.out.println("Informe o id da Materia que deseja ver uma discuss?o:");
					int idselec = Integer.parseInt(s.nextLine());
					mostraDiscById(idselec);
					break;
				case 10:
					avaliaMonitor();
					break;
				default:
					System.out.println("Op??o Inv?lida");
			}
		}
	}
	
	private static void avaliaMonitor() {
		System.out.println("Informe o id da Materia em que o monitor trabalha");
		int idmat = Integer.parseInt(s.nextLine());
		Materia materia = sistema.getMateriaById(idmat);
		
		System.out.println("Informe o nome do Monitor:");
		String nome = s.nextLine();
		Monitor monitor = materia.getMonitorByNome(nome);
		if(monitor != null) {
			//realiza avalia??o
			Avaliacao avaliacao = new Avaliacao();
			System.out.println("Informe o id da avaliacao:");
			avaliacao.setId(Integer.parseInt(s.nextLine()));
			System.out.println("Justificativa da avalia??o:");
			avaliacao.setDescricao(s.nextLine());
			System.out.println("Informe a nota:");
			avaliacao.setRanking(Double.parseDouble(s.nextLine()));
			sistema.avaliarMonitor(materia, monitor, avaliacao);
		}else {
			System.out.println("Monitor Informado n?o existe");
		}
		
	}
	
	private static void mostraDiscById(int idMateria) {
		Materia materia = sistema.getMateriaById(idMateria);
		if( materia != null) {
			System.out.println("Informe o id da discuss?o:");
			int id = Integer.parseInt(s.nextLine());
			System.out.println("**************************************************");
			for(Post p : materia.getPosts()) {
				if(p.getId() == id) {
					System.out.println("Conte?do: "+p.getConteudo()+"\nPergunta: "+ p.getPergunta());
				}else {
					System.out.println("N?o existe post com este Id");
				}
			}
			System.out.println("-----RESPOSTAS:");
			for(Resposta r : materia.getRespostas()) {
				if(r.getId() == id) {
					System.out.println("T?tulo: "+r.getTitulo()+"\nResposta: "+ r.getResposta());
				}else {
					System.out.println("N?o existem respostas para o Post");
				}
			}
			System.out.println("**************************************************");
		}
		
	}
	
	private static Resposta novaResposta() {
		Resposta resposta = new Resposta();
		System.out.println("Informe o ID do Post que deseja responder");
		resposta.setId(Integer.parseInt(s.nextLine()));
		System.out.println("Informe o T?tulo da sua resposta");
		resposta.setTitulo(s.nextLine());
		System.out.println("Inforeme o Conteudo da sua resposta");
		resposta.setConteudo(s.nextLine());
		System.out.println("Informe a resposta");
		resposta.setResposta(s.nextLine());
		return resposta;
	}
	
	private static Post novoPost() {
		Post post = new Post();
		System.out.println("Informe o ID do novo Post:");
		post.setId(Integer.parseInt(s.nextLine()));
		System.out.println("Informe o t?tulo do post");
		post.setTitulo(s.nextLine());
		System.out.println("Informe o conte?do do post");
		post.setConteudo(s.nextLine());
		System.out.println("Informe a pergunta do post");
		post.setPergunta(s.nextLine());
		return post;
	}
	
	private static void mostrarMonitores() {
		for(Materia item : sistema.getMaterias()) {
			System.out.println(item.toString());
			System.out.println("---Monitores---");
			for(Monitor monitor : item.getMonitores()) {
				System.out.println(monitor.toString());
				
			}
				
		}
	}
	
	private static Monitor novoMonitor() {
		Monitor monitor = new Monitor();
		System.out.println("Informe o nome do novo Monitor");
		monitor.setNome(s.nextLine());
		System.out.println("Informe o cpf do novo Monitor");
		monitor.setCpf(s.nextLine());
		return monitor;
	}
	
	private static int getIdMateriaEscolhida() {
		int aux = Integer.parseInt(s.nextLine());
		return aux;
	}
	
	private static void mostrarProfessores() {
		for(Materia item : sistema.getMaterias()) {
			System.out.println(item.toString());
			System.out.println("---Professores---");
			for(Professor prof : item.getProfessores()) {
				System.out.println(prof.toString());
				
			}
				
		}
	}
	private static Professor novoProfessor() {
		Professor professor = new Professor();
		System.out.println("Informe o nome do novo Professor:");
		professor.setNome(s.nextLine());
		System.out.println("Informe o cpf do novo Professor");
		professor.setCpf(s.nextLine());
		return professor;
	}
	
	private static void mostrarAlunos() {
		for(Materia item : sistema.getMaterias()) {
			System.out.println(item.toString());
			System.out.println("---Alunos---");
			for(Aluno alu : item.getAlunos()) {
				System.out.println(alu.toString());
				
			}
				
		}
	}
	
	private static Aluno novoAluno() {
		Aluno aluno = new Aluno();
		System.out.println("Informe o nome do novo aluno:");
		aluno.setNome(s.nextLine());
		System.out.println("Informe o cpf do novo aluno:");
		aluno.setCpf(s.nextLine());
		return aluno;
	
	}
	
	private static void printMaterias() {
		System.out.println("------MAT?RIAS------");
		for (Materia item : sistema.getMaterias()) {
			System.out.println(item.toString());
		}
	}
	
	private static Materia novaMateria() {
		Materia materia = new Materia();
		System.out.println("Informe o id da nova Materia:");
		materia.setId(Integer.parseInt(s.nextLine()));
		System.out.println("Informe o nome da nova Materia:");
		materia.setNome(s.nextLine());
		return materia;
	}
	
	private static int excluirMateria() {
		System.out.println("Informe o id da Materia que deseja exluir:");
		int id = Integer.parseInt(s.nextLine());
		return id;
	}
	
	private static Materia editarMateria() {
		System.out.println("Informe o id da Materia que deseja editar");
		int id = Integer.parseInt(s.nextLine());
		
		Materia atual = sistema.getMateriaById(id);
		if(atual != null) {
			Materia nova = new Materia();
			System.out.println("Informe o novo nome da Mat?ria");
			nova.setId(id);
			nova.setNome(s.nextLine());
			return nova;
		}
		return null;
	}
	
}
