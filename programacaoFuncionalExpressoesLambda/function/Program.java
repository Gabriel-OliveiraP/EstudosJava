package estudo.programacaoFuncionalExpressoesLambda.function;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {

	  public static void main(String[] args) {
	    	Locale.setDefault(Locale.US);
	    	
	        List<Product> list = new ArrayList<>();

	        list.add(new Product("Tv", 900.00));
	        list.add(new Product("Mouse", 50.00));
	        list.add(new Product("Tablet", 350.50));
	        list.add(new Product("HD Case", 80.90));	
	        
	        List<String> namesUp = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
	        namesUp.forEach(System.out::println);
	        	
	        /*
	         * Function<Product, String> function = p -> p.getName().toUpperCase();
	         * 
	         * List<String> namesUp = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
	         * 
	         * List<String> namesUp = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
	         * 
	         * List<String> namesUp = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
	         * 
	         *  para usarmos a função UpperCaseName em todos os objetos da lista usamos o
	         *  método map, e o map só aceita streams então convertemos a lista para um stream
	         *  e depois de rodar a aplicação usamos collect para voltar para lista
	         */
	        
	        
	        

	}

}
