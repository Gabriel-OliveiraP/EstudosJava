package estudo.interfaces.atividadeContrato.service;

public interface OnlinePaymentService {
	
	
	public double paymentFee(double amount); //paymentFee == taxa
	public double interest(double amount,Integer months);//Interest == juros
	
}
