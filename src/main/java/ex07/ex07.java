package ex07;

import java.lang.reflect.AccessFlag;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.Collections;

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

        7.3) Altere a classe Carro incluindo um atributo para armazenar uma lista de Pneus. 
             Na classe Exercicio7 crie um novo método para realizar os seguintes procedimentos:
             criar e inicializar três objetos do tipo Carro. Para cada objeto do tipo Carro, 
             adicione outros 4 objetos do tipo Pneu. Imprima na tela a lista de Carros e os seus respectivos Pneus.        
 */
public class ex07 {

    private Map<String, Carro> mp;
    private List<Integer> list;
    private SortedSet<Integer> SS; //  interface que estende Map, e permite classificação ascendente das chaves. não usado no exercicio

    public void MetodoCriaPneus() {

        java.util.List<Pneu> list = new ArrayList();

        Pneu p1 = new Pneu(1, "1", 10, 150, "fab1", 5500.00);
        Pneu p2 = new Pneu(2, "2", 15, 250, "fab2", 3000.00);
        Pneu p3 = new Pneu(3, "3", 20, 350, "fab3", 9000.00);
        Pneu p4 = new Pneu(4, "4", 25, 400, "fab4", 16000.00);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        
        System.out.println("Lista de Pneus: " + list);
        Collections.sort(list);
        System.out.println("Lista de Pneus em ordem decrescente pelo modelo: " + list);
    }
    
    public void MetodoCriaCarros() {
        
        SortedMap<String, Carro> mp = new TreeMap();

        Carro carro1 = new Carro("Nome 1", "Kwid", "Renault", 111111, 55455.55, new ArrayList<Pneu>() {{
            add(new Pneu(1, "1", 10, 150, "fab1", 5500.00));
            add(new Pneu(2, "2", 15, 250, "fab2", 3000.00));
            add(new Pneu(3, "3", 20, 350, "fab3", 9000.00));
            add(new Pneu(4, "4", 25, 400, "fab4", 16000.00));
        }});
        
        Carro carro2 = new Carro("Nome 2", "Kwid2", "Renault2", 222222, 55525.55, new ArrayList<Pneu>() {{
            add(new Pneu(1, "1", 10, 150, "fab1", 5500.00));
            add(new Pneu(2, "2", 15, 250, "fab2", 3000.00));
            add(new Pneu(3, "3", 20, 350, "fab3", 9000.00));
            add(new Pneu(4, "4", 25, 400, "fab4", 16000.00));
        }});
        
        Carro carro3 = new Carro("Nome 3", "Kwid3", "Renault3", 333333, 55155.55, new ArrayList<Pneu>() {{
            add(new Pneu(1, "1", 10, 150, "fab1", 5500.00));
            add(new Pneu(2, "2", 15, 250, "fab2", 3000.00));
            add(new Pneu(3, "3", 20, 350, "fab3", 9000.00));
            add(new Pneu(4, "4", 25, 400, "fab4", 16000.00));
        }});
        
        Carro carro4 = new Carro("Nome 4", "Kwid4", "Renault4", 4444444, 55455.55, new ArrayList<Pneu>() {{
            add(new Pneu(1, "1", 10, 150, "fab1", 5500.00));
            add(new Pneu(2, "2", 15, 250, "fab2", 3000.00));
            add(new Pneu(3, "3", 20, 350, "fab3", 9000.00));
            add(new Pneu(4, "4", 25, 400, "fab4", 16000.00));
        }});
        
        mp.put("0", carro1);
        mp.put("1", carro2);
        mp.put("2", carro3);
        mp.put("3", carro4);

        for (Map.Entry<String, Carro> m : mp.entrySet()) {
            System.out.println("Chave: " + m.getKey() + " [ " + m.getValue() + " ] \n");
        }

    }

    public static void main(String[] args) {

        new ex07().MetodoCriaPneus();
        System.out.println();
        new ex07().MetodoCriaCarros();

    }

}
