package estudo.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readers {
	public static void main(String[] args) {

		String path = "c:\\Temp\\in.txt";
		/*
		FileReader fr = null;
		BufferedReader br = null;
		 
		 // Iniciando os 2 readers
		 // OBS: O BufferedReader é tipo o FileReader mas é melhor kkkkkk
		 */
		try( BufferedReader br = new BufferedReader(new FileReader(path))){
				
			// ou BufferedReader br = new BufferedReader(new FileReader(path));
			
			/* OBS: precisamos de falar para o nosso BufferedReader que estamos
			 * lendo um file(arquivo) e para isso passamos o diretorio do arquivo
			 * por um FileReader. E como pode ter excessao usamos o trycatch
			 */
			
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("ERROR " + e.getMessage());
		}
		/* finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}

			} catch (IOException e) {
				e.getStackTrace();
			}
		}*/
	}
}
