package app;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double boughtDollar = sc.nextDouble();
		
		//chamada de um método estático sem criar um objeto ou instância de classe
		double result = CurrencyConverter.dollarConverter(boughtDollar, dollarPrice);
		System.out.printf("Amount to be paid in reais: %.2f%n", result);
	}

}
