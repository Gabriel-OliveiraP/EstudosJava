package estudo.interfaces.exemplo1;

public class Aplication {
	public static void main(String[] args) {
		
		Circulo circulopequeno = new Circulo(2);
		double area = circulopequeno.calcularArea();
		System.out.println(area);
		Quadrado quadrado = new Quadrado(5);
		System.out.println(quadrado.calcularArea());
		
		CalculadorArea calculador = new CalculadorArea();
		System.out.println(calculador.somarAreas(quadrado, circulopequeno));
	}
}
