package estudo.programacaoFuncionalExpressoesLambda.predicate;

import java.util.function.Predicate;

import estudo.programacaoFuncionalExpressoesLambda.Product;

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
}