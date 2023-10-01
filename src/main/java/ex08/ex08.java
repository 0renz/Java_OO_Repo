package ex08;

/**
 * @author 0renz
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Collection;

/*
     8. Codifique um método na classe Exercicio8 para criar e inicializar cinco 
        objetos do tipo Compra com as seguintes informações.
    
        Código 1, emissão:  15/10/2020 15:39:00 100, saída 15/10/2020 17:20 300
        Código 2, emissão:  16/10/2019 10:39:00 150, saída 16/10/2020 10:59 160
        Código 3, emissão:  17/10/2020 23:00:00 090, saída 18/10/2020 00:25 100
        Código 4, emissão:  17/10/2020 23:00:00 090, saída 18/10/2020 01:25 100
        Código 5, emissão:  31/12/2020 23:55:00 050, saída 01/01/2021 00:33 100

        Adicionar os objetos em uma coleção. Após, percorrer e analisar a lista
        para localizar os seguintes objetos/informações:
        
            1) Data de emissão de compra mais recente.
            2) Data de saída mais antiga.
            3) Compra com maior tempo em relação a emissão e a saída.
 */
public class ex08 {

    List<Compra> listaCompras = new ArrayList<>();
    Calendar Emissao = Calendar.getInstance();
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss SSS");

    
    public void CriaCompras() {
        
        try {
           Emissao.setTime(formatador.parse("15/10/2020 15:39:00 100"));
            
           listaCompras.add(new Compra(1, Emissao, formatador.parse("15/10/2020 17:20 100")));
           
           Emissao.setTime(formatador.parse("16/10/2019 10:39:00 150"));
           listaCompras.add(new Compra(2, Emissao, formatador.parse("16/10/2020 10:59 160")));
           
           Emissao.setTime(formatador.parse("17/10/2020 23:00:00 090"));
           listaCompras.add(new Compra(3, Emissao, formatador.parse("18/10/2020 00:25 100")));
           
           Emissao.setTime(formatador.parse("17/10/2020 23:00:00 090"));
           listaCompras.add(new Compra(4, Emissao, formatador.parse("18/10/2020 01:25 100")));
           
           Emissao.setTime(formatador.parse("31/12/2020 23:55:00 050"));
           listaCompras.add(new Compra(4, Emissao, formatador.parse("01/01/2021 00:33 100")));
            
        } catch (ParseException ex) {
            System.out.println("Exception: " + ex);
        }
        
        System.out.println(listaCompras);
    }

    public static void main(String[] args) {
        new ex08().CriaCompras();
    }

}
