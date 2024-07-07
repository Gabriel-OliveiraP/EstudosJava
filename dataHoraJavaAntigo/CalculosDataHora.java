package estudo.dataHoraJavaAntigo;

import java.time.*;
import java.time.temporal.ChronoUnit;


public class CalculosDataHora {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		//  MINUS SUBTRAY | PLUS ADICIONA
		
		LocalDate d04 = LocalDate.parse("2024-07-10");
		LocalDateTime d05 = LocalDateTime.parse("2024-07-10T01:30:26");
		Instant d06 = Instant.parse("2024-07-10T01:30:26Z");
		
		System.out.println("This week = " + d04);
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		// faz a data do d04 subtraindo 7 dias (d04 - 7dias)
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		// faz a data do d04 adicionando 7 dias (d04 + 7dias)
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		// faz a DataHora do d04 subtraindo 7 dias (d04 - 7dias)
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		// faz a DataHora do d04 adicionando 7 dias (d04 + 7dias)
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		// faz o Instante do d04 subtraindo 7 dias (d04 - 7dias)
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		
		Instant nextWeekInstant = d06.plus(7 , ChronoUnit.DAYS);
		// faz o Instante do d04 adicionando 7 dias (d04 + 7dias)
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		/* vai pegar o tempo entre a variavel pastWeekLocalDate até o da d05
		 * MAS como precisa de hora para a duração precisando usar o
		 * atStartOfDay para determinar a hora
		 */
		System.out.println("Duração = " + t1.toDays());
		
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		// vai pegar o tempo entre a variavel pastWeekLocalDateTime até o da d04
		System.out.println("Duração = " + t2.toDays());
		
		Duration t3 = Duration.between(d05, pastWeekLocalDateTime);
		// vai pegar o tempo entre a variavel d04 até o da pastWeekLocalDateTime
		System.out.println("Duração invertida = " + t3.toDays());
	}

}
