package com.mycompany.java_maven_too_20232;

public class ex05 {

    static String strDados = "Teste";

    /*
        5) Crie um construtor público para essa classe. Defina o método main e codifique uma 
           rotina para utilizar os métodos da classe java.lang.String utilizando a 
           variável estática strDados:
           
           concat, String.valueOf, startsWith endsWith, indexOf, substring, replace, trim, compareto.
    
     */
    //constutor da classe.
    public void manipulaString(String f) {//metodo da classe
        String concatenada = strDados.concat(f);
        System.out.println(concatenada);

        System.out.println(String.valueOf(strDados));

        if (strDados.startsWith("T")) {
            System.out.println("A variável começa com T");
        }
        else
            System.out.println("A variável não começa com T");

    }

    public static void main(String args[]) {//metodo main
        ex05 e5 = new ex05();//objeto da classe
        String f = "fabricio";
        e5.manipulaString(f);//chamada do metodo a partir do objeto.
    }

}
