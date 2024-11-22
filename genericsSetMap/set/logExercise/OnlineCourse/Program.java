package estudo.genericsSetMap.set.logExercise.OnlineCourse;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.println("How many Students for course A?");
		int n = input.nextInt();
		for(int i = 0; i < n; i++) {
			a.add(input.nextInt());
		}
		System.out.println("How many Students for course B?");
		n = input.nextInt();
		for(int i = 0; i < n; i++) {
			a.add(input.nextInt());
		}
		System.out.println("How many Students for course C?");
		n = input.nextInt();
		for(int i = 0; i < n; i++) {
			c.add(input.nextInt());
		}
		Set<Integer> list = new HashSet<>(a);
		list.addAll(b);
		list.addAll(c);
		
		System.out.println("Number of students " + list.size());
		
		input.close();
		
		
	}
}
