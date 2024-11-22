package estudo.programacaoFuncionalExpressoesLambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
		public static void main(String[] args) {
			
			List<Integer> list = Arrays.asList(3, 4, 5, 10 ,7);
			
			Stream<Integer> st1 = list.stream().map(x -> x*10);
			//Criando uma Stream a partir de uma coleção
			System.out.println(Arrays.toString(st1.toArray()));
			
			Stream<String> st2 = Stream.of("João", "Gabriel", "Maria");
			//Criando uma Stream a partir do Stream.of
			System.out.println(Arrays.toString(st2.toArray()));
			
			Stream<Integer> st3 = Stream.iterate(0, x -> x +2);
			/*Criando uma Stream a partir do iterate
			 * nosso comando diz que o 1o elemento da stream é 0
			 * e aí os próximos vai ser o ultimo +2*/
			System.out.println(Arrays.toString(st3.limit(10).toArray()));
			//como gerou uma stream infinita, temos que limita-la para imprimir
			
			Stream<Integer> st4 = Stream.iterate(new Integer[] { 0, 1 }, x -> new Integer[] {x[1], x[0]+x[1]})
					.map(p -> p[0]);
			/* Fazendo a sequencia de Fibonacci, vai pegar o 1o elemento e somar com o segundo e assim
			 *  formando um terceiro que vai ser atribuido ao proximo integer do array e assim vai indo
			 *  OBS: e como vai retornar um par(array), a gnt vai usar o map com uma função lambda
			 *  que vai pegar o elemento(no casso o arrayzin) e vai retornar apenas o indice 0 dele
			 *  onde vai estar a soma dos 2
			 */
			System.out.println(Arrays.toString(st4.limit(10).toArray()));
		
		
		}
}
