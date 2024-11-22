package estudo.pessoaAbstrationStudy;

public class Company extends Person{
	
	private int employees;
	
	public Company() {
		super();
	}
	public Company(String name, double anualIncome, int employees) {
		super(name, anualIncome);
		this.employees = employees;
	}
	@Override
	public double taxes() {
		double tax = 0;
		if(employees >= 10) {
			tax = getAnualIncome() * 0.14;
		}
		else {
			tax = getAnualIncome() * 0.16;
		}
		return tax;
	}
	public int getEmployees() {
		return employees;
	}
	public void setEmployees(int employees) {
		this.employees = employees;
	}
	

}
