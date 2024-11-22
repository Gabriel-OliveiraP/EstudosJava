package estudo.polimorfism.product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyy");
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int num = input.nextInt();
		for(int i = 0; i < num; i++) {
			System.out.println("Product #" + (i+1) + " data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char type = input.next().charAt(0);
			input.nextLine();
			System.out.print("Name:");
			String name = input.nextLine();
			System.out.print("Price:");
			Double price = input.nextDouble();
			if(type == 'c') {
				list.add(new Product(name, price));
			}
			else if(type == 'i') {
				System.out.print("Customs fee:");
				Double customsFee = input.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			else {
				input.nextLine();
				System.out.print("Manufacture date (DD/MM/YYYY):");
				Date date = fmt.parse(input.nextLine());
				list.add(new UsedProduct(name, price, date));
			}
		}
		for(Product x : list) {
			System.out.println(x.priceTag());
		}
		input.close();
		
	}

}
