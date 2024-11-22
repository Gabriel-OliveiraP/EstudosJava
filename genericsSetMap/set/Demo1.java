package estudo.genericsSetMap.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1 {
	public static void main(String[] args) {
		//Set<String> set = new HashSet<>();
		// instanciou um set usando a implementação HashSet(que nn ordena)
		
		//Set<String> set = new TreeSet<>();
		// instanciou um set usando a implementação TreeSet(que ordena pelo CompareTo do objeto)
		
		Set<String> set = new LinkedHashSet<>();
		//instanciou um set usando a implementação LinkedHashSet(que ordena pela ordem que foi adicionado na lista)
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");

		set.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
