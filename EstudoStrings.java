package estudo;

public class EstudoStrings {

    public static void main(String[] args) {
        // Declara uma string original
        String original = "AbcD efgh IJkL    ";

        // Converte a string original para letras minúsculas
        String low = original.toLowerCase();

        // Converte a string original para letras maiúsculas
        String up = original.toUpperCase();

        // Remove espaços em branco no início e no final da string original
        String tr = original.trim();

        // Extrai uma substring da posição 5 até a posição 8 (o índice final é exclusivo)
        String s04 = original.substring(5, 9);

        // Substitui a primeira ocorrência de "efgh" por "xy" na string original
        String subst = original.replace("efgh", "xy");

        // Encontra a primeira ocorrência da substring "bc" na string original
        int i = original.indexOf("bc");

        // Encontra a última ocorrência da substring "bc" na string original
        int j = original.lastIndexOf("bc");

        // Divide a string original em um array de strings, usando o espaço como delimitador
        String vet[] = original.split(" ");

        // Imprime a string original
        System.out.println("Original - " + original);

        // Imprime a string convertida para maiúsculas
        System.out.println("Up - " + up);

        // Imprime a string convertida para minúsculas
        System.out.println("LowerCase - " + low);

        // Imprime a string original com espaços em branco no início e no final removidos
        System.out.println("Trim - " + tr);

        // Imprime a substring extraída da posição 5 até a posição 8
        System.out.println("SubsTring - " + s04);

        // Imprime a string original com a primeira ocorrência de "efgh" substituída por "xy"
        System.out.println("Replace - " + subst);

        // Imprime a posição da primeira ocorrência da substring "bc"
        System.out.println("Index - " + i);

        // Imprime a posição da última ocorrência da substring "bc"
        System.out.println("LastIndex - " + j);

        // Imprime o primeiro elemento do array resultante da divisão da string original
        System.out.println("Vet 0 - " + vet[0]);

        // Imprime o segundo elemento do array resultante da divisão da string original
        System.out.println("Vet 1 - " + vet[1]);

        // Imprime o terceiro elemento do array resultante da divisão da string original
        System.out.println("Vet 2 - " + vet[2]);
    }
}
