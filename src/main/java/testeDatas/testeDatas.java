package testeDatas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class testeDatas {
    
    private Calendar dataCalendar;
    private Date dataDate; // ctrl + espaço = importar
    private SimpleDateFormat formatador;
    
    public testeDatas(){
        
        formatador = new SimpleDateFormat("dd/MM/yyyy");
        
        dataCalendar = Calendar.getInstance();
        dataCalendar.set(Calendar.DAY_OF_MONTH, 12);
        dataCalendar.set(Calendar.YEAR, 1983);
        dataCalendar.set(Calendar.MONTH, 0); //janeiro tem índice zero
        
        String dataFormatada = formatador.format(dataCalendar.getTime());
        
        System.out.println(dataFormatada);
        System.out.println("Data em milissegundos: " +dataCalendar.getTimeInMillis());
        
        dataDate = new Date();
        System.out.println(dataDate);
        dataFormatada = formatador.format(dataDate);
        System.out.println("Data fomatada com java util date: " + dataFormatada);
        System.out.println("Data em milis: " + dataDate.getTime());
        
        long miliCalendar = dataCalendar.getTimeInMillis();
        long miliDate = dataDate.getTime();
        
       
        System.out.println("Subtração das duas datas: " + (miliCalendar - miliDate));
        
        long diffDatas = Math.abs(miliCalendar - miliDate); //abs : módulo
        System.out.println("Diferença em dias: " + TimeUnit.DAYS.convert(diffDatas, TimeUnit.MILLISECONDS));
        
        System.out.println("Data maior - retorno 1: " + dataDate.compareTo(dataCalendar.getTime()));
        System.out.println("Datas iguais - retorno 0: " + dataCalendar.compareTo(dataCalendar));
        //System.out.println("Data menor - retorno -1: " + dataCalendar.compareTo(dataDate));
        
        //EX3: Converter a string "25/09/1983" para java.util.calendar
        
        String dataEx3 = "25/09/1983";
        System.out.println("Data formatada EX3: " +  formatador.format(dataCalendar));
        
        //EX4: Converter a string "25/09/1983" para java.util.date
        
        String dataEx4 = "25/09/1983";
        System.out.println("Data formatada EX4: " +  formatador.format(dataEx4));
        
        //System.out.println("Data EX3: " + dataEx4);
    }
    
     public static void main(String[] args){
         new testeDatas();
    }
}