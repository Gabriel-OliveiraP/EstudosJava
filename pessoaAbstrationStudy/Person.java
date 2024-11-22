package estudo.pessoaAbstrationStudy;

public abstract class Person {
	
	private String name;
	private double anualIncome;
	
	public Person() {}
	public Person(String name, double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	public abstract double taxes();
	
	public String getName() {
		return name;
	}
	public void setName(String nome) {
		this.name = nome;
	}
	public double getAnualIncome() {
		return anualIncome;
	}
	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	
}
