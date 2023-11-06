package ExerciciosProva;

import java.util.Set;
import java.util.TreeSet;


/**
 *
 * @author 20222PF.CC0021
 */
public class ex_03 {

    private Integer[] dados = {40, -10, 60, -1, 5, -25, 11, 3};
    private Set ordenado = new TreeSet();

    public ex_03() {
        metodoClassificaDados();
    }

    public void metodoClassificaDados() {
        
            int aux, i = 0;
            
            for (Object o : dados)
            {
                ordenado.add(dados[i]);
                i++;
            }
            System.out.println(ordenado);
   
    }

    public static void main(String args[]) {
        new ex_03();
    }
}
