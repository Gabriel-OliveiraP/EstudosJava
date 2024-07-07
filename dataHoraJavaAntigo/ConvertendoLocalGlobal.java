package estudo.dataHoraJavaAntigo;

import java.time.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertendoLocalGlobal {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		LocalDate d04 = LocalDate.parse("2024-07-02");
		LocalDateTime d05 = LocalDateTime.parse("2024-07-02T01:30:26");
		Instant d06 = Instant.parse("2024-07-02T01:30:26Z");

		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		//pega a data d06 e formata ela para o fuso do pc
		System.out.println("Formatando Data para o sistema = " + r1);
		
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		//Formata a Data pegando o fuso de portugal
		System.out.println("Formatando Data para o fuso de Portugal = " + r2);
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		//Formata a Data e Hora pegando o fuso de portugal
		System.out.println("Formatando DataHora para o fuso de Portugal = " + r3);

		System.out.println("d04 Dia = " + d04.getDayOfMonth());
		System.out.println("d04 Mês = " + d04.getMonthValue());
		System.out.println("d04 Ano = " + d04.getYear());
		// Pegando dia mes e ano de uma data
		System.out.println("d05 horas " + d05.getHour());
		System.out.println("d05 minutos " + d05.getMinute());
		// Pegando Hora e minutos
		
	}

}
