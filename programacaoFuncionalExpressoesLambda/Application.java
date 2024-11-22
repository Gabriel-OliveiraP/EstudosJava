package estudo.programacaoFuncionalExpressoesLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Map<Product, Double> stock = new HashMap<>();
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 400.0));
		Comparator<Product> comparator = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};	
		list.sort(comparator);
		
		/* 	OU USANDO DA CLASSE QUE CRIAMOS "MYCOMPARATOR"
		 * 	list.sort(new MyComparator());
		 */

		
		for(Product p : list) {
			System.out.println(p);
		}
		
		input.close();	
	}
}
