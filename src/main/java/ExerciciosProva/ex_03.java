package ExerciciosProva;

/**
 *
 * @author 20222PF.CC0021
 */
public class ex_03 {

    private Integer[] dados = {40, -10, 60, -1, 5, -25, 11, 3};

    public ex_03() {
        metodoClassificaDados();
    }

    public void metodoClassificaDados() {
        int dadosAux;
        
        for (int i = 0; i < dados.length; i++) {
            for (int j = 0; j < dados.length; j++) {
                if (dados[i] < dados[j]) {
                    dadosAux = dados[i];
                    dados[i] = dados[j];
                    dados[j] = dadosAux;
                }
            }
        }
        
        System.out.println("Dados ordenados:");
        for (int i = 0; i < dados.length; i++) {
            System.out.print(dados[i] + " ");
        }
    }

    public static void main(String args[]) {
        new ex_03();
    }
}
