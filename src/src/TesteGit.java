package src;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		int media = 0;
		for (int a : notas) {
			soma += a;
			media = soma/5;		
		}
		System.out.println("Soma das notas: " + soma);
		System.out.println("A média das notas é de: " + media);
		
		Collections.sort(notas);
		int alta = notas.get(notas.size()-1);
		System.out.println("A nota mais alta é: " + alta);
		int baixa = notas.get(0);
		System.out.println("A nota mais alta é: " + baixa);
		
		sc.close();
	}

}
