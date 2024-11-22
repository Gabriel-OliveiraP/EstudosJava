package estudo.programacaoFuncionalExpressoesLambda.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.removeIf( p -> p.getPrice() >= 100.0);
        /*
         * System.out.print("Digite o valor minimo desejado:");
        double min = input.nextDouble();
        Predicate<Product> pred = p -> p.getPrice() >= min;
		list.removeIf(pred);
        	//um metodo Predicate pred que recebe a função lambda com o teste
         
        
        list.removeIf(Product::nonStaticProductPredicate);
        
        list.removeIf(Product::staticProductPredicate);
        
        list.removeIf(new ProductPredicate());
		*/
        for (Product p : list) {
            System.out.println(p);
        }
        input.close();
    }
}
