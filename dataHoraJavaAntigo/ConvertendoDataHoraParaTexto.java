package estudo.dataHoraJavaAntigo;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ConvertendoDataHoraParaTexto {
		public static void main(String[] args) {
			
			//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
			
			LocalDate d04 = LocalDate.parse("2024-07-02");
			LocalDateTime d05 = LocalDateTime.parse("2024-07-02T01:30:26");
			Instant d06 = Instant.parse("2024-07-02T01:30:26Z");
			
			DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
			//vai transformar a hora e data para a zona do sistema(do pc)
			DateTimeFormatter fmt4 = DateTimeFormatter.ISO_INSTANT;
			//Formatando com as formatações prontas do site
			
			
			System.out.println("Formatando Data = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			System.out.println("Formatando Data = " + fmt1.format(d04));
		/*  ou System.out.println("Formatando = " + d04.format(fmt1));
			formata a d04 para o jeito do fmt01
			
			*/
			
			System.out.println("Formatando DataHora = " + d05.format(fmt2));
			System.out.println("Formatando DataHora c/ fuso = " + fmt3.format(d06));
			System.out.println("Formatando usando o site = "+ fmt4.format(d06));
		}
}
