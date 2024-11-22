package estudo.programacaoFuncionalExpressoesLambda.criandoFuncao;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
	
	public static double filteredSum(List<Product> list, Predicate<Product> criteria) {
		//vamos pedir para o user passar um criterio de Predicate para a função
		double sum = 0.0;
		for( Product i : list) {
			if(criteria.test(i)) {
			// se o teste do predicate que o usuario passar for TRUE o programa realiza a soma
				sum += i.getPrice();
			}
		}
		return sum;
	}
	
}
