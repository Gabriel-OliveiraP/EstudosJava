package estudo.programacaoFuncionalExpressoesLambda.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
    	
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
        
        list.forEach(p -> p.setPrice(p.getPrice() *1.10));
        
        /*
         * 
         *  double factor = 1.10;
         *  Consumer<Product> consumer = p -> p.setPrice(p.getPrice() * factor);
         *	list.forEach(consumer);
         * 
         * list.forEach(Product::nonStaticPriceUpdate);
         * 
         * list.forEach(Product::staticPriceUpdate);
         * 
         * list.forEach(new PriceUpdate()); 
         */
        
        list.forEach(System.out::println);
        
    }
}
