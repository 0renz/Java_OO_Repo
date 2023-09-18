package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class javaCollections {
    
    //atributo de instância.
    private Set<Object> st;
    ///Set - interface que define uma coleção que não permite elementos duplicados. SortedSet: possibilita a 
    //classificação natural dos elementos, tal como a ordem alfabética;

    //atributo de instância.
    private Collection<Integer> minhaLista;
    //Collection - define as operações básicas para as coleções, como adicionar, remover, esvaziar, etc.;
    
    //atributo de instância.
    private List<Integer> list;
    //List  – define uma coleção ordenada, podendo conter elementos duplicados. 
    //Temos o controle total sobre a posição onde cada elemento é inserido e pode recuperá-los através de seus índices.
        
    private Map<String, String> mp;
    //Map - mapeia chave para valores.
    
    //construtor        
    protected javaCollections(){}
            
    //construtor 
    public javaCollections(Integer tipo){
        
        // é como um array cujo tamanho pode crescer. A busca de um elemento é rápida, mas inserções e exclusões não são.
        list = new ArrayList();
        
        list.add(1);
        list.add(20);
        list.add(0);
        list.add(15);
        list.add(8);
        list.add(3);
        list.add(15);//elemento duplicado.
        
        list.remove(6);  // remocao de elemento por índice.
        
        //System.out.println(lst);

        for(int i=0; i < list.size(); i++){
            System.out.println("Elemento da List: " + list.get(i));//List possibilita a recuperacao pelo indice.
        }                        
        //System.out.println("Contem o elemento com o valor 150: " + lst.contains(150));  
    }
    
    //construtor 
    public javaCollections(String tipo){        
        //Se a necessidade for um conjunto com elementos não duplicados e acesso em ordem natural
        st = new TreeSet();
        
        st.add("Nova Zelandia");
        st.add("França");
        st.add("Brasil");
        st.add("Belgica");
        st.add("Japão");
        st.add("Brasil");               
        
        for(Object o : st){            
            // casting : modelagem de Object para String
            
            System.out.println("Elemento do Set: " + (String)o );
        }
    }
    
    public void metodoHashmap(){
        
        // Escolha esta implementação se a ordenação não for importante e desejar uma estrutura onde seja necessário um ID (identificador). 
        mp = new HashMap();
        
        mp.put("id", "1");
        mp.put("uz", "0000134");
        mp.put("cpf", "0000134");
        mp.put("id", "100000");
        
        
        for (Map.Entry<String, String> m : mp.entrySet()) {        
            System.out.println("Chave "+m.getKey() + " Valor : "+ m.getValue());    
        } 
        
        System.out.println("chave uz: " + mp.get("id")); 
    }
    
    public void metodoClassificacaoMap(){

        //Aplicação semelhante a HashMap, com a diferença que TreeMap perde no quesito desempenho;
        SortedMap<String, Aluno> map = new TreeMap();
        
        
        map.put("0" , new Aluno("456a","junior"));
        map.put("1" , new Aluno("789a","fulano"));
        map.put("0" , new Aluno("789a","abel"));
        map.put("50" , new Aluno("789a","abel"));
        map.put("3" , new Aluno("123a","telmo"));
        
        for (Map.Entry<String, Aluno> m : map.entrySet()) {
            System.out.println("Chave "+m.getKey() + " Valor : "+ m.getValue());    
        }
    }
    
    public void metodoClassificacao(){
        
        java.util.List<Aluno> list = new ArrayList();//criando a variavel list.
        
        Aluno a = new Aluno("pf009","telmo");// criacao do objeto/variavael a do tipo Aluno.
        list.add(a);
        
        Aluno b = new Aluno("pf002","junior");
        list.add(b);
        
        Aluno c = new Aluno("pf003","fulano");
        list.add(c);
        
        Aluno d = new Aluno("pf000","Abel");
        list.add(d);
        
        Aluno e = new Aluno("pf01", "Ciclano");//criando a instancia a partir do construtor sem parâmetros.
        list.add(e);
        
        System.out.println(list);//antes
               
        Collections.sort(list);//classificacao com base na método compareTo                
        
        System.out.println(list);//depois
        
    }
    
    public static void main(String[] args) {
        
        //criacao da instância invoncando o construtor que recebe um integer.
       new javaCollections(0);
        
       //criacao da instância invocando o construtor que recebe uma String.        
       new javaCollections("Sim");
       
       //criacao da instância invocando o construtor sem parâmetros e chama o método metodoHashmap.
       new javaCollections().metodoHashmap(); 
       
       javaCollections c = new javaCollections();
       c.metodoHashmap();
       c.metodoClassificacao();
              
       new javaCollections().metodoClassificacao();        
      
       new javaCollections().metodoClassificacaoMap();
    }
}