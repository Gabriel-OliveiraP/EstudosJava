package estudo.interfaces.defaultMethods;

import java.security.InvalidParameterException;

public interface InterestService {

	double getInterestRate();
	
	default double payment(double amount, int months){// usa o e
		if(months < 1) {//programação defensiva para se tiver colocado algo errado
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100, months);
		// faz o valor * ( 1 + interestRatePorcento )elevado a 3
	}
}
