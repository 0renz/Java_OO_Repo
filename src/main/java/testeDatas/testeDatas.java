package testeDatas;

import java.text.ParseException; //signals that an error has been reached unexpectedly while parsing
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit; // converts time across units (inscrease or descrease granularity)

public class testeDatas {
    // ctrl + space = import

    // private members can't be accessed by other classes
    private Calendar dataCalendar;
    private Date dataDate = new Date();  //     ------> Creates a Date object and captures OS date. java.util.Date is necessary
    private SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataDateTeste; // Date test to be setted using commands;

    public testeDatas() {

        dataCalendar = Calendar.getInstance();
        dataCalendar.set(Calendar.DAY_OF_MONTH, 12);
        dataCalendar.set(Calendar.YEAR, 1983);
        dataCalendar.set(Calendar.MONTH, 0); // january is on index 0

        System.out.println("Data formatada como java.util.calendar: " + formatador.format(dataCalendar.getTime())); // 12/01/1983
        System.out.println("Data em milissegundos: " + dataCalendar.getTimeInMillis()); // 411224815990
        System.out.print("\n");

        System.out.println("Data do tipo date: " + dataDate); // Thu Sep 21 10:06:55 BRT 2023 [created up there]
        // Notice that there are a bunch of more information
        dataDateTeste = new Date(); // same thing as dataDate
        dataDateTeste.setDate(11); //DEPRECATED
        dataDateTeste.setMonth(10); //DEPRECATED
        dataDateTeste.setYear(103); //DEPRECATED
        dataDateTeste.setHours(11); //DEPRECATED
        dataDateTeste.setMinutes(11); //DEPRECATED
        dataDateTeste.setSeconds(11); //DEPRECATED
        System.out.println("Teste de modificação de data atual: " + dataDateTeste + "\n"); // Tue Nov 11 11:11:11 BRST 2003

        String dataFormatada = formatador.format(dataDate);
        System.out.println("Data fomatada com java util date: " + dataFormatada);
        System.out.println("DataDate em milisegundos: " + dataDate.getTime());
        System.out.println("Data calendar em milissegundos: " + dataCalendar.getTimeInMillis() + "\n");

        long miliCalendar = dataCalendar.getTimeInMillis(); //Gets the milliseconds in calendar
        long miliDate = dataDate.getTime(); //Gets the milliseconds in date

        System.out.println("Subtração das duas datas em milissegundos: " + Math.abs(miliCalendar - miliDate));

        long diffDatas = Math.abs(miliCalendar - miliDate); //abs : module
        System.out.println("Diferença em dias: " + TimeUnit.DAYS.convert(diffDatas, TimeUnit.MILLISECONDS));
        // from milliseconds to days

        System.out.println("Data maior - retorno 1: " + dataDate.compareTo(dataCalendar.getTime()));
        System.out.println("Datas iguais - retorno 0: " + dataCalendar.compareTo(dataCalendar));
        System.out.println("Data menor - retorno -1: " + dataCalendar.getTime().compareTo(dataDate));

        //EX3: Convert the string "25/09/1983" to java.util.calendar
        //EX4: Convert the string "25/09/1983" to java.util.date
        try {
            Calendar CalendarTeste = Calendar.getInstance(); // Gets a calendar using the default time zone and locale.
            CalendarTeste.setTime(formatador.parse("25/09/1983"));

            Date dateTeste; // Doesn't need to instantiate as it wont ever be used at the current context
            dateTeste = formatador.parse("25/09/1983");

            System.out.println("Data calendar: " + CalendarTeste);
            System.out.println("Data date: " + dateTeste);
        } catch (ParseException ex) {
            System.out.println("Erro: " + ex.getLocalizedMessage());
        }
    }

    public static void main(String[] args) {
        new testeDatas();
    }
}
