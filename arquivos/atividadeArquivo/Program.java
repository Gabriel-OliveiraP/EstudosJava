package estudo.arquivos.atividadeArquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		//C:\Temp\itens.csv
		 System.out.print("Digite o caminho do arquivo:");
		 String path = input.nextLine();
		 	
		 List<String> name = new ArrayList<>();
		 List<Float> price = new ArrayList<>();
		 List<Integer> unit = new ArrayList<>();
		 String line;
		 try(BufferedReader reader = new BufferedReader(new FileReader(path))){
			 while((line = reader.readLine()) != null) {
				 String[] separateLine = line.split(",");
				 
				 name.add(separateLine[0]);
				 price.add(Float.parseFloat(separateLine[1]));
				 unit.add(Integer.parseInt(separateLine[2]));
				 
			 }
			 System.out.println(name);
			 System.out.println(unit);
			 System.out.println(price);
		 }
		 catch(IOException e){
			 e.printStackTrace();
		 }
		 File pathFile = new File(path);
		 try {
	     Path paths = Paths.get((pathFile.getParent() + ("\\outsummary.csv")));
		 Files.deleteIfExists(paths);
		 } catch (IOException e) {
			e.printStackTrace();
		}
		 finally {
		 try(BufferedWriter writer = new BufferedWriter
		(new FileWriter((pathFile.getParent() + ("\\outsummary.csv")), true))){

			 for(int i =0; i < name.size(); i++) {
				 writer.write(name.get(i)+ "," + price.get(i) * unit.get(i) + "\n");
			 }
			 
		 }
		 catch(IOException e) {
			 e.printStackTrace();
		 }
		 }
		 input.close();
	}
}
