package ExerciciosProva;

import java.util.List;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author 20222PF.CC0021
 */
public class ex_01 {

    private String raw_data = "123,b,22,f,e,7,1,2,3";
    private java.util.List<Integer> dados = new java.util.ArrayList();
    private Set<Object> st = new TreeSet(); 

    public void converteDados() {

        int i = 0;
        String d[] = raw_data.split(",");

        while (i < d.length) {

            try {
                dados.add(Integer.valueOf(d[i]));
            } catch (NumberFormatException e) {
                dados.add(0);
            }

            i++;
        }
    }

    public void imprimeDados() {
        int i = 0;
        System.out.println(dados);
        Collections.sort(dados);
        
        while (i < dados.size()) {

            try {
                st.add(dados.get(i));
            } catch (NumberFormatException e) {
                continue;
            }
            i++;
        }
        System.out.println(dados);
        System.out.println(st);
    }

    public ex_01() {
        converteDados();
        imprimeDados();
    }

    public static void main(String[] args) {
        new ex_01();
    }

}
