package estudo.interfaces.exemplo1;

public class CalculadorArea {
	/*
	 * quero um metodo que faça qualquer uma dessa somas
	 *  Quadrado + Circulo
	 *  Quadrado + Quadrado
	 *  Circulo + Quadrado
	 *  Circulo + Circulo
	 */
	public double somarAreas(FiguraGeometrica figuraA, FiguraGeometrica figuraB) {
		return figuraA.calcularArea() + figuraB.calcularArea();
	}
	/* 
	 * Ao invez de eu usar public double somarAreas(Quadrado quadrado, Circulo circulo)
	 * eu pego da interface que eles implementam, então fica
	 * public double somarAreas(FiguraGeometrica figuraA, FiguraGeometrica figuraB) 
	 * assim qualquer classe que implementar da interface Figura geometrica consegue entrar nesse metodo
	 */
}
