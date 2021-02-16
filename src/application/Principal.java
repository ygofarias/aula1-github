package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employe;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employe employe = new Employe();
		System.out.print("Name: ");
		employe.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employe.grossSalary  = sc.nextDouble();
		System.out.print("Tax: ");
		employe.tax = sc.nextDouble();
		
		System.out.println("Employe: " + employe);
		
		System.out.print("which percentage to increase salary? ");
		double percentage = sc.nextDouble(); 
		employe.IncreaseSalary(percentage);
		
		System.out.println("Upadted data: " + employe);
		sc.close();
	}

}
