package estudo.polimorfism.product;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyy");
	
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String toString() {
		return "UsedProduct [fmt=" + fmt + ", manufactureDate=" + manufactureDate + ", name=" + name + ", price="
				+ price + "]";
	}


	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " (used) " + String.format("$ %.2f", price));
		sb.append(" (Manufacture date: " + fmt.format(manufactureDate).toString() + ")");
		return sb.toString();
	}

}
