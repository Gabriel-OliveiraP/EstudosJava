package estudo.tryCatch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		method1();
		System.out.println("End of program");
	}
	public static void method1() {
		System.out.println("***METHOD 1 START***");
		method2();
		System.out.println("***METHOD 1 END***");
	}
	public static void method2() {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		System.out.println("***METHOD 2 START***");
		try {
		String[] vect = input.nextLine().split(" ");
		int position = input.nextInt();
		System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!");
			e.printStackTrace();
			input.next();
		}
		catch(InputMismatchException e) {
			System.out.println("Input error!");
		}
		System.out.println("***METHOD 2 END***");
		
		input.close();
	}
}
