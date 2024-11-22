package estudo.genericsSetMap.generics.curingaDelimitado;

import java.util.ArrayList;
import java.util.List;

public class Aplication {
	public static void main(String[] args) {
			
			List<Shape> myShapes = new ArrayList<>();
			myShapes.add(new Rectangle(3.0, 2.0));
			myShapes.add(new Circle(2.0));

			List<Circle> myCircles = new ArrayList<>();
			myCircles.add(new Circle(2.0));
			myCircles.add(new Circle(3.0));
			
			System.out.println("Total area: " + String.format("%.2f", totalArea(myCircles)));
		}
		
		public static double totalArea(List<? extends Shape> list) {
			// pois assim aceitamos uma lista que tenha qlqr tipo q seja subtipo de shape(ou o msm)
			double sum = 0.0;
			for (Shape s : list) {
				sum += s.area();
			}
			return sum;
		}
}
