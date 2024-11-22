package estudo.interfaces.exemplo1;

public class Quadrado implements FiguraGeometrica{
	//Atributos
	private int lado;
	
	//Construtores
	
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	//Metodos especificos
	
	public double calcularArea() {
		return Math.pow(lado, 2);
	}
	
	//Getters and setters
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
}
