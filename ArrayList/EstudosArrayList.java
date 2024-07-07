package estudo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EstudosArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println("Tamanho da lista: " +  list.size());
		list.add("Maria");//adicionando Strings na nossa Lista
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // adicionar em uma posicao especifica 
		for(String x : list) {// for each para imprimir a lista
			System.out.print(x);
			System.out.print(" | ");
		}
		
		System.out.println("\n----------------------------");
		
		list.remove(1);//remover pela posição(remove o numero 1 da lista)
		list.remove("Anna"); //remover da lista
		list.removeIf(x -> x.charAt(0) == 'M');/* remove todos cujo o 1o caracter
		é o 'M'*/
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.print("Index of Bob = " + list.indexOf("Bob") + " | ");/* colocar a
		posição do Bob*/
		System.out.println("Index of Anna = " + list.indexOf("Anna"));/* Como ela 
		ñ existe na lista, retorna -1*/
		
		list.add("Maria");//Readicionando Strings na nossa Lista
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		List<String> listaFiltro = list.stream().filter(y -> y.charAt(0) == 'A').collect(Collectors.toList());
		/* vai pegar apenas as Strings que começa com A. Ele vai converter para
		 * stream, para assim filtrar, e então vai devolver um stream já filtrado
		 * mas o stream nn é compativel com o List, então vamos converter novamente para
		 * lista ( collect(Collectors.toList());)
		 */
		System.out.println("----------------------------"
				+ "\nLista de nomes que começam com a letra 'A'");
		for(String x : listaFiltro) {
			System.out.println(x);
		}
		System.out.println("----------------------------");	
		String primeiroA = list.stream().filter( x -> x.charAt(0) == 'A').findFirst().orElse("tem não");
		/*Vai filtrar a nossa lista(list) e pegar o primeiro String q começa com 'A' 
		 * E se não tiver, vai retornar "tem não"
		 */
		System.out.println(primeiroA);
		
	
	}

}
