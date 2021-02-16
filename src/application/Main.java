package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;



public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();//objeto da classe
		System.out.println("Name: ");
		student.name = sc.nextLine();
		System.out.println("Digite as notas: ");
	
		student.grades1 = sc.nextDouble();
		student.grades2 = sc.nextDouble();
		student.grades3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrades());
		
		if(student.finalGrades() >= 60.0 ) {
			System.out.println(student.finalGrades() + " PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f%n", student.missinPoints());
		}
			
	}

}
