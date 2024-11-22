package estudo.polimorfism.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		/*Criamos uma lista Employee, mas a instancia de cada
		 *  obj pode ser tanto um Employee quanto outsourcedEmployee
		 *  então cada metodo vai se comportar da maneira que o
		 *  objeto é. Criamos assim na superclasse pois dessa
		 *  maneira conseguimos adicionar nas subclasses sem problema
		 *  */
		
		System.out.print("Enter the number of employee: ");
		int n = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < n ; i ++) {
			System.out.println("Employee #"+ (i+1) + " data:");
			System.out.print("Outsourced?(y/n)");
			char type = input.next().charAt(0);
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Hours:");
			Integer hours = input.nextInt();
			System.out.print("Value per hour:");
			Double valuePerHour = input.nextDouble();
			
			if(type == 'y'){
				System.out.print("Additional charge:");
				Double additionalCharge = input.nextDouble();
				list.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
				/* Aqui usamos o polimorfismo criando uma instancia na lista Employee
				 * do tipo OutsourcedEmployee. E não dá problema pq outsourcedEmployee
				 * é um Employee
				 */
			}
			else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment() ));
		}
		
		input.close();
	}

}
