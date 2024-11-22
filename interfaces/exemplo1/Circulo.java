package estudo.interfaces.exemplo1;

public class Circulo implements FiguraGeometrica {
	//atributos
	private int raio;
	//construtor
	public Circulo(int raio) {
		this.raio = raio;
	}
	// metodos especificos da classe
	@Override
	public double calcularArea() {
		//area = pi * raio^2
		return Math.PI * Math.pow(raio, 2);
	}	
	//metodos getters and setters
	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
}
