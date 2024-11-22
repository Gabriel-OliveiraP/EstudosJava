package estudo.shapeAbstrationStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		System.out.println("Enter the number of shapes:");
		int n = input.nextInt();
		
		for(int i = 0; i < n ; i++) {
			System.out.println("Shape #"+ (i+1) + " data:");
			System.out.print("Rectangle or Circle?(r/c):");
			char shape = input.next().charAt(0);
			System.out.print("Color(BLACK/BLUE/RED): ");
			Color color = Color.valueOf(input.next());
			if(shape == 'r') {
				System.out.print("Width: ");
				double width = input.nextDouble();
				System.out.print("Height: ");
				double height = input.nextDouble();	
				list.add(new Rectangle(color, width, height));
			}
			else {
				System.out.println("Radious: ");
				double radious = input.nextDouble();
				list.add(new Circle(color, radious));
			}
			System.out.println();
			System.out.print("SHAPE AREAS: ");
			for(Shape x : list) {
				System.out.printf("%.2f%n", x.area());
			}
		}
		
		input.close();
	}
}
