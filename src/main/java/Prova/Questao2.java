package Prova;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author 20222PF.CC0021
 */
public class Questao2 {

     private String[] dados = {"80", "1500", "b", "-2", "c", "-50", "22", "6"};
     

    public Questao2() {
        classificacao();
    }

    private void classificacao() {
        int i = 0;
        Set<Object> st = new TreeSet();

        while (i < dados.length) {
            try {
               st.add(Integer.valueOf(dados[i]));
            } catch (NumberFormatException e) {
                st.add(0);
            }
            i++;
        }
        
        System.out.println(st);
    }

    public static void main(String[] args) {
        new Questao2();
    }
}
