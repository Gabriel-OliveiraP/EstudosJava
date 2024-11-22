package abstrationStudy.pessoaAbstrationStudy;

public class Individual extends Person{
	
	private double healthExpends;

	public Individual() {
		super();
	}
	public Individual(String name, double anualIncome, double healthExpends) {
		super(name, anualIncome);
		this.healthExpends = healthExpends;
	}
	@Override
	public double taxes() {
	double tax = 0;
		if(getAnualIncome() < 20000) {
			tax = getAnualIncome() * 0.15;
				tax -= healthExpends/2;
		}
		else {
			tax = getAnualIncome() * 0.25;
		}
		if(healthExpends > 0) {
			tax -= healthExpends/2;
		}
		return tax;
	}
	public double getHealthExpends() {
		return healthExpends;
	}

	public void setHealthExpends(double healthExpends) {
		this.healthExpends = healthExpends;
	}
	
	
}
