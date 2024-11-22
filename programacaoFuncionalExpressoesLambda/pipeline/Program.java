package estudo.programacaoFuncionalExpressoesLambda.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
	public static void main(String[] args) {
		
	List<Integer> list = Arrays.asList(3,4,5,10,7);
	
	Stream<Integer> st1 = list.stream().map(x -> x *10);
	System.out.println(Arrays.toString(st1.toArray()));
	
	int sum = list.stream().reduce(0, (x, y) -> x + y );
	// reduce vai pegar um elemento inicial(neutro) e dps uma função
	// que recebe dois argumentos e gera um resultado
	//OBS: ele vai somar a lista
	System.out.println("Sum = " + sum);
	
	List<Integer> pares = list.stream().filter(x -> x % 2 == 0).map(x -> x *10).toList();
	System.out.println(Arrays.toString(pares.toArray()));
	// vai pegar os pares e multiplicar por 10, e dps retornar para uma lista de pares
	
	}
}
