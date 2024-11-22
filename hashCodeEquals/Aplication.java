package estudo.hashCodeEquals;

public class Aplication {
		public static void main(String[] args) {
			
			Client c1 = new Client("Maria", "maria@gmail.com");
			Client c2 = new Client("Maria", "maria@gmail.com");
			
			System.out.println(c1.hashCode());
			System.out.println(c2.hashCode());
			System.out.println(c1.equals(c2));
			System.out.println(c1.hashCode() == c2.hashCode());
		}
}
