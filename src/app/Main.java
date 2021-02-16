package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Main { 

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//pode-se utilizar vetor.lenght em vez da variável
		int n = sc.nextInt();
		//criando um vetor
		Produto[] vetor = new Produto[n];
		
		for(int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			//instanciando um vetor ou criando um objeto vetor
			vetor[i]  = new Produto(name, price);
		}
		double soma = 0.0;
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPrice();
		}
		double avg = soma/ vetor.length;
		System.out.printf("Average price = %.2f%n ", avg);
		
		sc.close();
	}

}
