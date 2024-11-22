package estudo.programacaoFuncionalExpressoesLambda.mediaExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        // Define o padrão de localização como US, para que os números utilizem o ponto como separador decimal.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // Cria um comparador de Strings que compara ignorando diferenças entre maiúsculas e minúsculas.
        Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
        
        // Lista para armazenar os produtos lidos do arquivo.
        List<Product> list = new ArrayList<>();
        System.out.println("File Path: "); // Solicita o caminho do arquivo ao usuário.
        String path = sc.nextLine();
        
        // Leitura do arquivo usando BufferedReader para eficiência.
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine(); // Lê a primeira linha do arquivo.
            while (line != null) { 
                // Divide a linha em duas partes (nome e preço) usando vírgula como delimitador.
                String splited[] = line.split(",");
                // Adiciona um novo objeto Product à lista, convertendo o preço para Double.
                list.add(new Product(splited[0], Double.parseDouble(splited[1])));
                
                // Lê a próxima linha do arquivo.
                line = br.readLine();
            }
        } catch (IOException e) {
            // Caso ocorra um erro de leitura do arquivo, exibe a mensagem correspondente.
            System.out.println("ERROR: " + e.getMessage());
        } 
        
        // Calcula a média dos preços dos produtos:
        // 1. Converte a lista de produtos para um stream.
        // 2. Usa map para extrair os preços (p.getPrice()).
        // 3. Usa reduce para somar todos os preços. Inicializa a soma em 0.0.
        // 4. Divide o total pela quantidade de produtos na lista (list.size()).
        double avg = list.stream()
                         .map(p -> p.getPrice()) // Transforma cada produto no seu preço.
                         .reduce(0.0, (x, y) -> x + y) // Soma todos os preços.
                         / list.size(); // Divide pelo tamanho da lista.
        System.out.println("Avarage Price: " + String.format("%.2f ", avg)); // Exibe a média formatada.
        
        // Cria uma lista de nomes de produtos com preço abaixo da média:
        // 1. Filtra os produtos cujo preço é menor que a média.
        // 2. Mapeia os produtos filtrados para seus nomes.
        // 3. Ordena os nomes em ordem alfabética reversa usando o comparador.
        // 4. Coleta o resultado como uma lista de Strings.
        List<String> names = list.stream()
                                 .filter(p -> p.getPrice() < avg) // Filtra produtos com preço menor que a média.
                                 .map(p -> p.getName()) // Transforma cada produto no seu nome.
                                 .sorted(comp.reversed()) // Ordena os nomes em ordem alfabética reversa.
                                 .collect(Collectors.toList()); // Coleta o resultado como lista.
        
        // Itera sobre a lista de nomes e os imprime no console.
        names.forEach(System.out::println);
    }
}
