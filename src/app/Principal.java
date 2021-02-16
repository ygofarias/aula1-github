package app;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;
public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter number account: ");
		int number = sc.nextInt(); //variável temporária
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();//variável temporária		
		System.out.print("Is there a initial balance(y/n)? ");
		char option = sc.next().charAt(0);
		//se sim, utilizar o contrutor de 3 argumentos
		if(option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		//se não, usar de apenas 2
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withDrawValue = sc.nextDouble();
		account.withDraw(withDrawValue );
		
		System.out.print("Updated account data: ");
		System.out.println(account);
		
		
		
		sc.close();
		
		
	}

}