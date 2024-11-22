package estudo.interfaces.vehicle.aplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import estudo.interfaces.vehicle.entities.CarRental;
import estudo.interfaces.vehicle.entities.RentalService;
import estudo.interfaces.vehicle.entities.Vehicle;
import estudo.interfaces.vehicle.services.BrazilTaxService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do carro:");
		System.out.print("Modelo do carro: ");
		String carModel = input.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(input.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(input.nextLine(), fmt);
		//já criamos uma variavel localdatetime passando o nosso input no formato "fmt"
		
		CarRental car = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = input.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = input.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		//criando um rental service
		
		rentalService.processInvoice(car);
		
		System.out.println("FATURA");
		System.out.println("Pagamento basico: " + car.getInvoice().getBasicPayment());// no objeto carRental
		// eu acesso o objeto invoice e do invoice eu pego o metodo getBasicPayment
		System.out.println("Imposto: " + car.getInvoice().getTax());
		System.out.println("Pagamento total: " + car.getInvoice().getTotalPayment());
		
		input.close();
	}

}
