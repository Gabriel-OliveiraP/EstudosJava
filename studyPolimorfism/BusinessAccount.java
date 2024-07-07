package studyPolimorfism;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	
	public BusinessAccount() {
		super();
	}
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;			
	}
	@Override
	public void withDraw(double amount) {
		super.withDraw(amount);
		balance -= 2;
	}
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10;
		}
	}
	public Double getLoanLimit() {
		return loanLimit;
	}
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
}