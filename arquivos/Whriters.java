package estudo.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Whriters {

	public static void main(String[] args) {
		
		String[] lines = {"Good morning", "Good afternoon", "Good night"};
		
		String path = "c:\\Temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
		/* Está crindo um arquivo com o BufferedWriter. Se não quiser é só
		 * (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)))
		 * colocar um true no final
		 */
			for(String line : lines) {
			/*
			 * Estrutura de repetição para fazer um for each escrevendo todos
			 * os valores do vetor lines
			 */
				bw.write(line);
				bw.newLine();
				// ou bw.write(line + "\n");
			}
		}
		catch(IOException e ) {
		// o catch para pegar algum erro do try-with-resources
			e.printStackTrace();
		}
		
	}

}
