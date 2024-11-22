package estudo.interfaces.atividadeContrato.aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import estudo.interfaces.atividadeContrato.entities.Contract;
import estudo.interfaces.atividadeContrato.entities.Installment;
import estudo.interfaces.atividadeContrato.service.ContractService;
import estudo.interfaces.atividadeContrato.service.PaypalService;

public class Aplication {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyy");
		
		System.out.println("Entre com os dados do contrato!");
		System.out.print("Numero: ");
		int numero = input.nextInt();
		input.nextLine();
		System.out.print("Data: ");
		LocalDate data = LocalDate.parse(input.nextLine(), formatador);
		System.out.print("Valor do contrato: ");
		double valorContrato = input.nextDouble();
		System.out.print("Numero de parcelas: ");
		int numeroParcelas = input.nextInt();
			
		Installment parcela = new Installment(data, valorContrato);
		Contract contrato = new Contract(numero, data, valorContrato);
		
		ContractService processamento = new ContractService(new PaypalService());
		
		processamento.processContract(contrato, numeroParcelas);
		
		for(Installment installment : contrato.getInstallments()) {
			System.out.println(installment);
		}
		
		
		// pegar data já formatando ele e dps o resto 
		// depois tratar as excessoes tbm( importante )
		// tbm testar fncionalidades programa
		//colocar td de estdos no github(plmdsss)
		input.close();
	}

}
