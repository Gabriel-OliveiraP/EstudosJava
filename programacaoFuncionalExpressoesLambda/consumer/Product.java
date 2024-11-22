package estudo.programacaoFuncionalExpressoesLambda.consumer;

import java.util.Objects;

public class Product {
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.10);
	}
	
	public void nonStaticPriceUpdate() {
		setPrice(getPrice() *1.10);
	}
	
	@Override
	public String toString() {
		return "Product name: " + name + ", price: " + price + "";
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}
	
}