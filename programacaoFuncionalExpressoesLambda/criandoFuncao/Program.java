package estudo.programacaoFuncionalExpressoesLambda.criandoFuncao;

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

        ProductService ps = new ProductService();
        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        
        System.out.println("Soma: " + String.format("%.2f", sum));
        

    }
}
