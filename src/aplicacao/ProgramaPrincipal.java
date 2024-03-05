package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Professor;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		List<Professor> professores = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("nº de professores: ");
		int n = entrada.nextInt();
		entrada.nextLine();
		
		for (int i=0; i<n; i++) {
			System.out.println("Dados do professor nº " + (i+1));
			System.out.print("Nome: ");
			String nome = entrada.nextLine();
			System.out.print("Disciplina: ");
			String disciplina = entrada.nextLine();
			System.out.print("Valor da hora: ");
			double valorHora = entrada.nextDouble();
			System.out.print("Horas trabalhadas: ");
			int totalHoras = entrada.nextInt();
			entrada.nextLine();
			System.out.println();
			
			Professor professor = new Professor(nome, disciplina, valorHora, totalHoras);
			
			professores.add(professor);
		}
		
			for (Professor p : professores) {
				System.out.println(p);
			}
		
		
		entrada.close();


	}

}
