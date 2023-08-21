package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> notas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a nota de 5 alunos: ");
		
		for (int i = 0; i<5; i++) {
			int nota = sc.nextInt();
			notas.add(nota);
		}
		System.out.println("As notas digitadas foram: " + notas);
		
		int soma = 0;
		for (int a : notas) {
			soma += a;
		}
		System.out.println("Soma das notas: " + soma);

		
		int media = 0;
		for (int m: notas) {
			media = m/5;
			
		}
		System.out.println("A média das notas é de: " + media);
		
		
		sc.close();
	}

}
