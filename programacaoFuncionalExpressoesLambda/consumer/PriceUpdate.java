package estudo.programacaoFuncionalExpressoesLambda.consumer;

import java.util.function.Consumer;

import estudo.programacaoFuncionalExpressoesLambda.predicate.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.10);	
	}

}
