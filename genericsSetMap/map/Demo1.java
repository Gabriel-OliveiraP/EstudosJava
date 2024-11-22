package estudo.genericsSetMap.map;

import java.util.Map;
import java.util.TreeMap;

public class Demo1 {
	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("fone", "99711122");

		cookies.remove("email");
		cookies.put("fone", "99771133");

		System.out.println("Contains 'abc' key: " + cookies.containsKey("fone"));
		System.out.println("Fone number " + cookies.get("fone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());

		System.out.println("All Cookies");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

		/* Percorrendo Um MAP
		 * Usando keySet()
		 * for (String key : map.keySet()) {
    		System.out.println("Key: " + key + ", Value: " + map.get(key));
    		}
		 * 
		 * COM FOREACH
		 * map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
		 */
	}
}
