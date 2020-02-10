package application;

import java.util.Scanner;
import entities.Account;
import exceptions.DomainException;

public class SaqueEmContaTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		System.out.println(account);
		try {
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.println(account);
		}catch (DomainException e) {
			System.out.println(e.getMessage());
		}catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		sc.close();
	}
	

}
