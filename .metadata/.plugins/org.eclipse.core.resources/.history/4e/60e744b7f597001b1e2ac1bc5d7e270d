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
	
	private static void imprimeMenuGeral() {
		System.out.println("Escolha uma Operação");
		System.out.println("0 - Fechar");
		System.out.println("1 - Cadastrar Matéria");
		System.out.println("2 - Editar Matéria");
		System.out.println("3 - Excluir Matéria");
		System.out.println("4 - Adicionar Aluno");
		System.out.println("5 - Adicionar Professor");
		System.out.println("6 - Adicionar Monitor");
		System.out.println("7 - Adicionar Post");
		System.out.println("8 - Adicionar Resposta");
		//...
		
	}
	private static void menu() {
		int opcao = -1;
		while(opcao!=0) {
			imprimeMenuGeral();
			System.out.print("Informe a opção::::");
			opcao = Integer.parseInt(s.nextLine());
			switch(opcao) {
				case 0:
					break;
				case 1:
					Materia novaMat = novaMateria();
					sistema.adicionarMateria(novaMat);
					System.out.println(novaMat.getId()+" : "+ novaMat.getNome()+" INSERIDA");
				case 2:
					//
				case 3:
					//
				case 4:
					//
				case 5:
					//
				case 6:
					//
				case 7:
					//
				case 8:
					//
				default:
					System.out.println("Opção Inválida");
			}
		}
	}
	
	private static Materia novaMateria() {
		Materia materia = new Materia();
		System.out.println("Informe o id da Materia:");
		materia.setId(Integer.parseInt(s.nextLine()));
		System.out.println("Informe o nome da Materia:");
		materia.setNome(s.nextLine());
		return materia;
	}
	
}
