package estudo.pessoaAbstrationStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner input = new Scanner(System.in);
	
	List<Person> list = new ArrayList<>();
	
	System.out.print("Enter the number of tax payers:");
	int n = input.nextInt();
	input.nextLine();
	
	for(int i = 0; i < n; i++) {
		System.out.println("Tax payer #" + (i+1) + " data:");
		System.out.print("Individual or company (i/c)?");
		char type = input.next().charAt(0);
		input.nextLine();
		System.out.print("Name:");
		String name = input.nextLine();
		System.out.print("Anual income:");
		double anualIncome = input.nextDouble();
		if(type == 'i') {
			System.out.print("Health expenditures: ");
			double healthExpends = input.nextDouble();
			list.add(new Individual(name, anualIncome, healthExpends));
		}
		else {
			System.out.print("Number of employees:");
			int employees = input.nextInt();
			list.add(new Company(name, anualIncome, employees));
		}
	}
	System.out.println("TAXES PAID:");
	for(Person x : list) {
		System.out.printf("%s $ %.2f%n", x.getName(), x.taxes());
	}
	double totalTaxes = 0;
	for(Person x : list) {
		totalTaxes += x.taxes();
	}
	System.out.printf("TOTAL TAXES: $%.2f%n", totalTaxes);
	input.close();
	}
}
