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
	  editarDiscuss�o(...)
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
		System.out.println("Escolha uma Opera��o");
		System.out.println("0 - Fechar");
		System.out.println("1 - Cadastrar Mat�ria");
		System.out.println("2 - Editar Mat�ria");
		System.out.println("3 - Excluir Mat�ria");
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
			System.out.print("Informe a op��o::::");
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
					//
				case 3:
					int id = excluirMateria();
					sistema.excluirMateria(id);
					printMaterias();
					break;
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
					System.out.println("Op��o Inv�lida");
			}
		}
	}
	
	private static void printMaterias() {
		System.out.println("------MAT�RIAS------");
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
	
}
