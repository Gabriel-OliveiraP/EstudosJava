package estudo.arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileAndScanner {
	public static void main(String[] args) {
		
	File file = new File("c:\\Temp\\in.txt");/*
	criando uma variavel do tipo File do meu arquivo "("c:\\Temp\\in.txt")" end.
	do arquivo(OBS: duas barras significam uma "// == /")
	*/
	Scanner sc = null;
	try {
		sc = new Scanner(file);//instanciando o Scanner com o arquivo(file)
		while (sc.hasNextLine()) {//verificando se ainda tem linhas para serem
			//lidas, e se tiver ele excecuta o while
			System.out.println(sc.nextLine());//para ler a linha e printar
		}
	}
		catch(IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		finally {
			if(sc != null) {//fazer a verificação, pois se fechar o Scanner nulo
				//da ruim
				sc.close();
			}
		}

	}
}
