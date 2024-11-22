package estudo.tryCatch.activityBank;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = input.nextInt();
			input.nextLine();
			System.out.print("Holder: ");
			String holder = input.nextLine();
			System.out.print("Initial Balance: ");
			Double initialBalance = input.nextDouble();
			System.out.print("Withdraw Limit: ");
			Double withdrawLimit = input.nextDouble();
			
			Account account = new Account(number, holder, initialBalance, withdrawLimit);

			System.out.println("Enter amount for withdraw: ");
			Double withdraw = input.nextDouble();
			account.withdraw(withdraw);
			System.out.println("New balance: " + account.getBalance());
		}
		
		catch(BankException e) {
			System.out.println(e.getMessage());
		}
		
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		input.close();
	}

}
