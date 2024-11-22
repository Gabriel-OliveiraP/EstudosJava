package estudo.genericsSetMap.generics.delimitados;

import java.util.List;

public class CalculationService<T> {
	
	public static <T extends Comparable<T>> T max(List<T> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("A lista está vazia");
		}
		T max = list.get(0);
		for(T i : list) {
			if(i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}
}
