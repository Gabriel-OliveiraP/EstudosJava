package estudo.genericsSetMap.map.electionExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		// Cria um objeto Scanner para receber a entrada do usuário (nesse caso, o caminho do arquivo)
		Scanner input = new Scanner(System.in);
		// Exemplo de caminho do arquivo para teste
		// C:\Temp\cursoJava\src\estudo\genericsSetMap\map\in.txt
		
		// Declara um mapa para armazenar os candidatos e a quantidade de votos (Map<String, Integer>)
		Map<String, Integer> candidato = new HashMap<>();
		
		// Solicita o caminho do arquivo para o usuário
		System.out.print("Enter the file path: ");
		String path = input.nextLine();
		
		// Usa um bloco try-with-resources para abrir o arquivo e garantir que ele seja fechado automaticamente
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			// Lê a primeira linha do arquivo
			String line = br.readLine();
			
			// Enquanto houver linhas no arquivo, executa o loop
			while (line != null) {
				// Divide a linha atual em partes usando a vírgula como separador
				// Assumimos que a linha contém o nome do candidato e o número de votos separados por vírgula
				String[] fields = line.split(",");
				String nomeCandidato = fields[0]; // O primeiro campo é o nome do candidato
				Integer votos; // Variável para armazenar os votos do candidato
				
				// Verifica se o candidato já existe no mapa
				if (candidato.containsKey(nomeCandidato)) {
					// Se o candidato já estiver no mapa, soma os votos atuais com os novos votos da linha atual
					votos = candidato.get(nomeCandidato) + Integer.parseInt(fields[1]);
				} else {
					// Se o candidato ainda não estiver no mapa, define seus votos iniciais
					votos = Integer.parseInt(fields[1]);
				}
				
				// Atualiza o mapa com o nome do candidato e a nova contagem de votos
				candidato.put(nomeCandidato, votos);
				
				// Lê a próxima linha do arquivo
				line = br.readLine();
			}
			
		} catch (IOException error) {
			// Em caso de erro ao abrir ou ler o arquivo, exibe uma mensagem de erro
			System.err.println("ERROR: " + error.getMessage());
		}
		
		// Itera sobre o mapa para imprimir cada candidato e sua contagem de votos
		for (String key : candidato.keySet()) {
			System.out.println(key + ": " + candidato.get(key));
		}
		
		// Fecha o Scanner
		input.close();
	}
}
