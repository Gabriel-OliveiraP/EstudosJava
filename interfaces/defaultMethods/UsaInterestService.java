package estudo.interfaces.defaultMethods;

public class UsaInterestService implements InterestService {

	private double interestRate;//taxa de juros

	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	@Override
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	

}