package estudo.tryCatch.excecaoPersonalizada;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import estudo.tryCatch.excecaoPersonalizada.exceptions.DomainException;

public class Aplication {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		try {
			System.out.print("Room number:");
			int number = input.nextInt();
			input.nextLine();
			System.out.print("Check-in date (dd/MM/yyy)");
			Date checkIn = sdf.parse(input.nextLine());
			System.out.print("Check-out date (dd/MM/yyy)");
			Date checkOut = sdf.parse(input.nextLine());
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println("--------");
			
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyy)");
			checkIn = sdf.parse(input.nextLine());
			System.out.print("Check-out date (dd/MM/yyy)");
			checkOut = sdf.parse(input.nextLine());
			
			reservation.updateDate(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		}
		catch(ParseException e) {
			// vai pegar o erro ParseException e trata-lo
			System.out.println("Invalid date format!");
		}
		catch(DomainException e) {
		/* Aqui fazemos um catch capturando o erro que inserimos no método.
		 * Então se der algum dos erros no método ele vai soar o DomainException
		   que vai ser capturado e tratado por esse catch  */
			System.out.println("Error in reservation: " + e.getMessage());
			// Aqui vai imprimir o erro usando o getMessage e pegando a msg do metodo
		}
		catch (RuntimeException e) {
			// Aqui vai capturar qlqr tipo de RuntimeException e mandar uma mensagem
			System.out.println("Unexpected error");
		}
		
		
		input.close();
	}
}
