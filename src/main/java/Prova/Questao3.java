package Prova;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.TreeSet;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author 20222PF.CC0021
 */
public class Questao3 {
    
    private java.util.List<Calendar> listCalendar = new java.util.ArrayList();
    private SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss");
    private Calendar calendar = Calendar.getInstance();

    public Questao3() {
        datas();
    }

    public void datas() {
        try {
            calendar.setTime(formatador.parse("17:20:00"));
            listCalendar.add((Calendar)calendar.clone());
            
            calendar.setTime(formatador.parse("18:20:00"));
            listCalendar.add((Calendar)calendar.clone());
            
            calendar.setTime(formatador.parse("19:20:00"));
            listCalendar.add((Calendar)calendar.clone());
            
            calendar.setTime(formatador.parse("06:00:00"));
           listCalendar.add((Calendar)calendar.clone());
            
            calendar.setTime(formatador.parse("02:59:00"));
            listCalendar.add((Calendar)calendar.clone());
        } catch (ParseException ex) {
            System.out.println("Erro: " + ex.getLocalizedMessage());
        }
        
        for (int i = 0; i < 5; i++)
            System.out.println(formatador.format(listCalendar.get(i).getTime()));
        
        Calendar calendarMaior = Calendar.getInstance();
        Calendar aux = Calendar.getInstance();
        
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if(i == 0)
                {
                    calendarMaior.setTime(listCalendar.get(i).getTime());
                }
                
                aux.setTime(listCalendar.get(i).getTime());
                if (calendarMaior.getTimeInMillis() < aux.getTimeInMillis())
                {
                    calendarMaior.setTime(aux.getTime());
                }
            }
        }
        
       listCalendar.get(0).getTimeInMillis();
       System.out.println("Maior valor: " + formatador.format(calendarMaior.getTime()));
    }

    public static void main(String args[]) {
        new Questao3();
    }
}
