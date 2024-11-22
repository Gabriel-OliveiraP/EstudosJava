package estudo.interfaces.interfaceComHerança;

public class Circle extends AbstractShape{

	private Double radious;
	
	public Circle() {
		super();
	}

	public Circle(Color color, Double radious) {
		super(color);
		this.radious = radious;
	}
	public Circle(Color color, double d) {
	}

	@Override
	public double area() {
		return Math.PI * radious * radious;
	}

	public Double getRadious() {
		return radious;
	}

	public void setRadious(Double radious) {
		this.radious = radious;
	}
	
	
}
