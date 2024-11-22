package estudo.programacaoFuncionalExpressoesLambda.exercise;

public class Employee {

	private String name;
	private Double salary;
	private String email;
	public Employee(String name, String email, Double salary) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employeename=" + name + ", salary=" + salary + ", email=" + email + "]";
	}
	
	
	
}
