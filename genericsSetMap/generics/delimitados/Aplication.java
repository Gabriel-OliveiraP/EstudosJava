package estudo.genericsSetMap.generics.delimitados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Aplication {

	public static void main(String[] args) {

		String path = "C:\\Temp\\cursoJava\\src\\estudo\\genericsSetMap\\generics\\delimitados\\in.txt";
		List<Product> products = new ArrayList<>();

		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] list = line.split(",");
				products.add(new Product(list[0], Double.parseDouble(list[1])));
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		Product x = CalculationService.max(products);
		System.out.println("Max " + x);
		
	}

}
