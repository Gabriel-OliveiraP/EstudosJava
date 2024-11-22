package estudo.genericsSetMap.set.logExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//C:\Temp\cursoJava\src\estudo\genericsSetMap\set\logExercise\in.txt
		System.out.println("Enter file full path:");
		String path = input.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Set<LogEntry> set = new HashSet<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] log = line.split(" ");
				String username = log[0];
				Date momment = Date.from(Instant.parse(log[1]));
				
				set.add(new LogEntry(username, momment));
				
				line = br.readLine();
			}
			System.out.println("Total unique users: " + set.size());
			
		}catch(IOException error) {
			System.out.println("Error " + error.getMessage());
		}
		
		
		input.close();
	}
}
