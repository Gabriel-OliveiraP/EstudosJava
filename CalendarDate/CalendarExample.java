package estudo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar; // Importar a classe Calendar corretamente
import java.util.Date;
import java.util.Scanner;

public class CalendarExample { // Mudei o nome da classe para evitar conflito com java.util.Calendar
    public static void main(String[] args) throws ParseException{

        Scanner input = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(d));
        
        System.out.println("Digite uma data (dd/mm/yyyy)");
        Date dataMaior = sdf1.parse(input.nextLine());
        // vai ler a String q a pessoa digitar e passar
        // para o tipo Data na variavel date
        System.out.println("Data maior " + sdf1.format(dataMaior));
        System.out.println("Digite uma data menor que a outra (dd/mm/yyyy)");
        Date dataMenor = sdf1.parse(input.nextLine());
        System.out.println("Data menor " + sdf1.format(dataMenor));

        if(dataMaior.after(dataMenor)) {
            System.out.println("A 1 data realmente é maior que a outra");
        }
        else{
            System.out.println("A segunda data é maior");
        }
        System.out.println("\n-------------------\n");

        Calendar cal = Calendar.getInstance();
        // cria um calendario
        cal.setTime(d);
        // coloca o dia D no calendario
        cal.get(Calendar.YEAR);
        //pega o ano do calendario
        cal.get((+1) +Calendar.MONTH);
        //pega o mes do calendario e é bom adicionar 1 pq o mês
        //do calendario começa em 0(janeiro == 0)
        
        cal.add(Calendar.HOUR_OF_DAY, 4);
        // acrescenta 4 horas à data
        
        int minutes = cal.get(Calendar.MINUTE);
        // pega os minutos da dataHora
        System.out.println(minutes);
        int month = cal.get(Calendar.MONTH);
        // pega o mês da dataHora
        System.out.println(month + 1);
        /*Como no calendário os meses começam em 0, ele exibe mês 5.
         * Para corrigirmos basta apenas fazer (month + 1)
         */
        input.close();
    }
}
