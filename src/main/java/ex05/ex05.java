package ex05;

public class ex05 {

    static String strDados = "Teste";

    /*
        5) Crie um construtor público para essa classe. Defina o método main e codifique uma 
           rotina para utilizar os métodos da classe java.lang.String utilizando a 
           variável estática strDados:
           
           concat, String.valueOf, startsWith endsWith, indexOf, substring, replace, trim, compareto.
     */
    
    public void manipulaString(String f) {
        String concatenada = strDados.concat(f);
        System.out.println(concatenada);

        System.out.println(String.valueOf(strDados));

        if (strDados.startsWith("T")) {
            System.out.println("A variável começa com T");
        }
        else
            System.out.println("A variável não começa com T");
        
        System.out.println(strDados.indexOf("t"));
        
        System.out.println(strDados.substring(2,4));

    }

    public static void main(String args[]) {
        ex05 e5 = new ex05();
        String f = "fabricio";
        e5.manipulaString(f);
    }
}