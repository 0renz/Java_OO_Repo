package CounterStrike;

import CounterStrike.Classes.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CounterStrike {

    Calendar cal = Calendar.getInstance();
    Calendar cal2 = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public CounterStrike() {
        try {
            imprimeListJogadores(inicializaListJogadores());
        } catch (ParseException ex) {
            Logger.getLogger(CounterStrike.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*
    11.1 Codificar no pacote br.edu.ifsul.bcc.too.base.topico5.exercicios.cc 
    o diagrama de classe sobre o estudo de caso: Counter Strike
    
    11.1.1 Criar uma rotina para adicionar objetos (dois) do tipo Jogador em uma 
    lista. Cada jogador deverá ter uma lista (2 objetos) de Arma e Municao e  
    dua patentes. Em seguida, imprima na saída padrão, os jogadores
    com seus respectivos artefatos e patentes.
     */
    private List<Jogador> inicializaListJogadores() throws ParseException {
        List<Jogador> listaJogadores = new ArrayList();

        Endereco end1 = new Endereco(1, "96521423", "casa");
        Endereco end2 = new Endereco(2, "7777777", "apartamento");

        Municao municao_1 = new Municao(Boolean.FALSE, Calibre.C03, 1, "Smoke", 9.3f, 99.0f);
        Arma arma_1 = new Arma(1.27f, Tipo.FOGO, municao_1, 2, "Submetralhadora", 90.1f, 999.0f);

        ItensCompra itemcompra1 = new ItensCompra(1, "10", 500.4f, municao_1);
        ItensCompra itemcompra2 = new ItensCompra(2, "1", 1500.4f, arma_1);

        cal.setTime(sdf.parse("20/11/2020"));
        Compra c1 = new Compra(1, (Calendar) cal.clone(), 99.9f, itemcompra1);
        cal.setTime(sdf.parse("21/11/2020"));
        Compra c2 = new Compra(2, (Calendar) cal.clone(), 109.9f, itemcompra2);

        cal.setTime(sdf.parse("22/11/2020"));
        Compra c3 = new Compra(3, (Calendar) cal.clone(), 99.9f, itemcompra1);
        cal.setTime(sdf.parse("23/11/2020"));
        Compra c4 = new Compra(4, (Calendar) cal.clone(), 109.9f, itemcompra2);

        Patente patente_1 = new Patente(1, "Prata", "Prata");
        Patente patente_2 = new Patente(2, "Ouro", "Dourado");
        Patente patente_3 = new Patente(3, "Ak", "Dourado");

        /*
        this.nickname = nickname;
        this.senha = senha;
        this.pontos = pontos;
        this.data_cadastro = data_cadastro;
        this.data_ultimo_login = data_ultimo_login;
        this.endereco = endereco;
        this.Compra = Compra;
        this.artefato = artefato;
        this.patente = patente;
         */
        cal.setTime(sdf.parse("19/11/2020"));
        cal2.setTime(sdf.parse("20/11/2023"));

        Jogador j1 = new Jogador();
        j1.setNickname("Lorenzinho123");
        j1.setArtefato(arma_1);
        j1.setArtefato(municao_1);
        j1.setPatente(patente_3);
        j1.setPatente(patente_1);
        listaJogadores.add(j1);

        Jogador j2 = new Jogador();
        j2.setNickname("Vinicinho89i2");
        j2.setArtefato(arma_1);
        j2.setArtefato(arma_1);
        j2.setPatente(patente_2);
        j2.setPatente(patente_2);
        listaJogadores.add(j2);

        return listaJogadores;
    }

    /*  
    Em seguida, imprima na saída padrão, os jogadores
    com seus respectivos artefatos e patentes.
     */
    private void imprimeListJogadores(List<Jogador> lista) {
        for (Jogador j : lista) {
            System.out.println("Jogador: " + j.getNickname());
            System.out.print("Patentes: ");
            
            for (Patente pat: j.getPatente()) {
                System.out.print(pat.getNome() + ", ");
            }
            
            System.out.print("\nArtefatos: ");
            for (Artefato art : j.getArtefato()) {
                  System.out.print(art.getNome()  + ", ");
            }
            System.out.println("\n-----------------------");
        }
    }

    public static void main(String args[]) {
        new CounterStrike();
    }
}
