package estudo.interfaces.atividadeContrato.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	//installment = parcela
	
	DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyy");
	
	private LocalDate date;
	private Double amount;
	
	public Installment() {
	}
	
	public Installment(LocalDate date, Double amount) {
		this.date = date;
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return date.format(formatador) + " - " + String.format("%.2f", amount);
	}
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
