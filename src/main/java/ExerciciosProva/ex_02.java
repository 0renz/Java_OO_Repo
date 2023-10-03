package ExerciciosProva;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Calendar;

/**
 *
 * @author 20222PF.CC0021
 */
public class ex_02 {

    private Map<Integer, java.util.Calendar> mapDados = new HashMap();
    private SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");
    private String dadosString = "{codigo:10, data:'2022-01-31'};{codigo:20, data:'1999-10-1'};{codigo:30, data:'1994-06-15'}";
    private Calendar calendar = Calendar.getInstance();

    public ex_02() {
        manipulacaoStrings();
        imprimeMapa();
    }

    private void manipulacaoStrings() {
        
        String d[] = dadosString.split(";");
        int i = 0;
        
        while (i < d.length) {

            try {
                String codigo = d[i].substring(d[i].indexOf(":") + 1,
                        d[i].indexOf(","));
                String data = d[i].substring(d[i].indexOf(":",
                        d[i].indexOf(",")) + 2, d[i].indexOf("'}"));
                
                calendar.setTime(formatador.parse(data)); 
                // é preciso clonar o calendário, pois o mapa armazena referências dos objetos
                // e não cópias, assim, todas as entradas no mapa estão se referindo à mesma instância
                mapDados.put(Integer.valueOf(codigo), (Calendar)calendar.clone());

            } catch (Exception e) {
                e.printStackTrace();
            }

            i++;
        }
        // formatador.parse = pega uma (string de data) e converte pra (date)
        // formatador.format = pegar um (date) e converte pra (string de data)
    }

    private void imprimeMapa() {
        SimpleDateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy");
        for (Map.Entry<Integer, Calendar> m : mapDados.entrySet()) {
            System.out.println("Codigo: " + m.getKey() + " Data: " + formatador2.format(m.getValue().getTime()));
        }
    }

    public static void main(String args[]) {
        new ex_02();
    }

}
