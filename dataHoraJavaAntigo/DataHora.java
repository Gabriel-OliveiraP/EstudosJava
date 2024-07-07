package estudo.dataHoraJavaAntigo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
		public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
			
		LocalDate d01 = LocalDate.now();// vai pegar a data local de hoje
		System.out.println("Data Local: " + d01);
		
		LocalDateTime d02 = LocalDateTime.now();// pega a data e hoje local de hoje
		System.out.println("DataHora Local : " + d02);

		Instant d03 = Instant.now();//pega a data||hr global(de londres)
		System.out.println("DataHora Global : " + d03);
		
		System.out.println("---------------------------------------------------");
		
		LocalDate d04 = LocalDate.parse("2024-07-02");
		/* O .parse vai pegar a variavel d04 e transformar ela em LocalDate
		 usando as informações passadas no ("")*/
		System.out.print("Formatado LocalDate: " + d04);
		System.out.print(" | Classe: " + d04.getClass() + "\n");
		
		LocalDateTime d05 = LocalDateTime.parse("2024-07-02T01:30:26");
		System.out.println("Formatado LocalDateTime: " + d05);
		
		Instant d06 = Instant.parse("2024-07-02T01:30:26Z");
		System.out.println("Formatado Instant: " + d06);
		
		Instant d07 = Instant.parse("2024-07-02T01:30:26-03:00");/*  
		O .parse vai pegar a variavel d04 e transformar ela em instante
		e vai pegar esse instante e addicionar 3 horas. 
		E para fazer menos 3 horas é +03:00*/
		System.out.println("Formatado e somado Instant : " + d07);
		
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("02/07/2024", fmt01);
		/* Criei um novo formato de data e instanciei uma data nele */
		System.out.println("Formatado de um jeito personalizado: " + d08);
		
		LocalDate d09 = LocalDate.parse("02/07/2024 01:30", DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm"));
		/* Criei um novo formato de data já no proprio argumento */
		System.out.println("Formatado de um jeito personalizado: " + d09);
		
		LocalDate d10 = LocalDate.of(2024, 07, 02);
		System.out.println("Formatando separadamente data: " + d10);
		
		LocalDateTime d11 = LocalDateTime.of( 2024, 07, 20, 1, 30);
		System.out.println("Formatando separadamente data com hora: "+ d11);
		//instanciando o ano, mes, dia e hora separadamente//
		
		
		
		}
		
}
