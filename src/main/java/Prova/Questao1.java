package Prova;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0021
 */
public class Questao1 {

    private Collection<Integer> collection = new ArrayList();

    public Questao1(String param) {
        extracaoInteiros(param);
    }

    public Collection<Integer> extracaoInteiros(String param) {
        int i = 0;
        String d[] = param.split(",");

        while (i < d.length) {
            try {
                String codigo = d[i].substring(d[i].indexOf(" ") + 1,
                        d[i].indexOf("}"));
                
                System.out.println("Codigo: " + codigo);
                collection.add(Integer.valueOf(codigo));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                //nullpointerexception, usar algo que está nulo
            }
            i++;
        }  
        return collection;
    }

    public static void main(String[] args) {
        String json = "[{codigo: 123}, {codigo: 0}, {codigo: 59}]";
        System.out.println(new Questao1(json));
    }
}
