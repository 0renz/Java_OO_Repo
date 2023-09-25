package ex07;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Collections;
import javaCollections.javaCollections;

/**
 * @author 0renz
 */

/*
        7.1) Codifique uma classe chamada: Carro. Essa classe deve ter os seguintes atributos: nome, modelo, fabricante, numero do chassi  e valor de mercado. 
           O construtor (público) deverá receber dados para inicializar todos esses atributos. Sobrescreva o método toString para retornar o codigo e modelo.
           Na classe Exercicio7 crie um novo método para realizar os seguintes
             procedimentos: criar e inicializar cinco objetos da 
            classe Carro. 
           Adicione-os em uma lista da interface Map ordenada. Ao adicionar defina uma chave sequencial. Imprima na tela a listagem de carros.
       
        7.2) Codifique uma classe chamada: Pneu. Essa classe deve ter os seguintes atributos: codigo, modelo, posição, medida, fabricante e valor. 
           O construtor (público) deverá receber dados para inicializar todos esses atributos. Sobrescreva o método toString para retornar o codigo e modelo.
           Na classe Exercicio7 crie um novo método para realizar os seguintes procedimentos: criar e inicializar quatro objetos da classe Pneu. 
           Adicione-os em uma lista. Implemente um mescanismo para classificar os objetos contidos nessa lista pelo modelo (descendente).
           Imprima na tela os Pneus.

        7.3) Altere a classe Carro incluindo um atributo para armazenar uma lista de Pneus. Na classe Exercicio7 crie um novo método para realizar os seguintes procedimentos:
             criar e inicializar três objetos do tipo Carro. Para cada objeto do tipo Carro, adicione outros 4 objetos do tipo Pneu. Imprima na tela a lista de Carros e os seus respectivos Pneus.        
 */
public class ex07 {

    private Map<String, Carro> mp;

    public void MetodoCriaCarros() {
        SortedMap<String, Carro> mp = new TreeMap();
        
        mp.put("0", new Carro("Nome 1", "Kwid", "Renault", 111111, 5555.55));
        mp.put("1", new Carro("Nome 2", "Mobi ", "Fiat", 222222, 6666.66));
        mp.put("2", new Carro("Nome 3", "C3 ", "Citroën", 333333, 7777.77));
        mp.put("3", new Carro("Nome 4", "Stepway ", "Renault", 444444, 88888.88));
        mp.put("4", new Carro("Nome 5", "Argo", "Fiat", 555555, 99999.99));
        
        for (Map.Entry<String, Carro> m : mp.entrySet()) {
            System.out.println("Chave: " + m.getKey() + " Carro: " + m.getValue());
        }

    }

    public static void main(String[] args) {
        new ex07().MetodoCriaCarros();
        System.out.println();
    }

}