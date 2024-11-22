package estudo.programacaoFuncionalExpressoesLambda.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Application {
	public static void main(String[] args) {
		
		//C:\Temp\cursoJava\src\estudo\programacaoFuncionalExpressoesLambda\exercise\in.txt
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = input.nextLine();
		System.out.print("Enter salary:");
		double minSalary = input.nextDouble();
		
		List<Employee> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String splited[] = line.split(",");
				list.add(new Employee(splited[0], splited[1], Double.parseDouble(splited[2])));
				
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
		List<String> finalList = list.stream().filter(x -> x.getSalary() > minSalary).
				map(e -> e.getEmail()).sorted().collect(Collectors.toList());
		System.out.println("Email of peaple whose salary is more than "+ minSalary);
		finalList.forEach(System.out::println);
		
		double totalSalaryM = list.stream().filter(e -> e.getName().startsWith("M")).map(e -> e.getSalary()).reduce(0.0, (x, y) -> x + y);
		
		System.out.println("Sum of salary of people whose name starts with 'M': " + totalSalaryM);
		input.close();

		
	}
	
}
