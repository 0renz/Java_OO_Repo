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
    private Calendar calendar = Calendar.getInstance();
    private SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");
    private String dadosString = "{codigo:10, data:'2022-01-31'};{codigo:20, data:'1999-10-1'};{codigo:30, data:'1994-06-15'}";

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
                System.out.println(calendar);
                System.out.println("a" + calendar);
                
                mapDados.put(Integer.valueOf(codigo), calendar);

            } catch (Exception e) {
                e.printStackTrace();
            }

            i++;
        }
    }

    private void imprimeMapa() {
        for (Map.Entry<Integer, Calendar> m : mapDados.entrySet()) {
            System.out.println("Codigo: " + m.getKey() + " Data: " + m.getValue());
        }
    }

    public static void main(String args[]) {
        new ex_02();
    }

}
