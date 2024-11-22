package estudo.tryCatch.activityBank;

public class Account {

	int number;
	String holder;//dono da conta
	Double balance;
	Double withdrawLimit;
	
	public Account() {
	}
	public Account(int number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public void withdraw(Double quantity){
		validationWithdraw(quantity);
		balance -= quantity;
	}
	
	private void validationWithdraw (Double quantity){
			if(quantity > getWithdrawLimit()) {
				throw new BankException("Withdraw error: The amount exceeds withdraw limit");
			}
			if(quantity > getBalance()) {
				throw new BankException("Withdraw error: Not enough balance");
		}
	}
	
	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + ", withdrawLimit="
				+ withdrawLimit + "]";
	}
	public void deposit(Double deposit) {
		this.balance += deposit;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
}
