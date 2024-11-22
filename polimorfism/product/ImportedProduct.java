package estudo.polimorfism.product;

public class ImportedProduct extends Product {

	private Double customsFee;//imposto

	
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	@Override
	public String toString() {
		return "ImportedProduct [customsFee=" + customsFee + ", name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + String.format(" $%.2f ", totalPrice()));
		sb.append(String.format("(Customs fee: %.2f)", customsFee));
		return sb.toString();
	}
	
	public Double totalPrice() {
		return super.price + customsFee;
	}
	
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	
}
