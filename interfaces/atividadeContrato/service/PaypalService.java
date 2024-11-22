package estudo.interfaces.atividadeContrato.service;

public class PaypalService implements OnlinePaymentService {

	private double tax = 0.02;
	private double interest = 0.01;
	
	@Override
	public double paymentFee(double amount) {//paymentFee == taxa
		return (amount * tax) + amount;
	}

	@Override
	public double interest(double amount, Integer months) {//Interest == juros
		return ((amount * interest )* months) + amount;
	}

}
