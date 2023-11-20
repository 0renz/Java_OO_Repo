package CounterStrike;

import java.util.Calendar;
import java.util.Collection;

public class Partida {
   private Integer id;
   private java.util.Calendar inicio;
   private java.util.Calendar fim;
   private Jogador jogador;
   private Collection<Round> rounds;

    public Partida(Integer id, Calendar inicio, Calendar fim, Jogador jogador, Collection<Round> rounds) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.jogador = jogador;
        this.rounds = rounds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getInicio() {
        return inicio;
    }

    public void setInicio(Calendar inicio) {
        this.inicio = inicio;
    }

    public Calendar getFim() {
        return fim;
    }

    public void setFim(Calendar fim) {
        this.fim = fim;
    }

    public Jogador getJogador() {
        return jogador;
    }
    
    public void setJogadores(Jogador jogador) {
        this.jogador = jogador;
    }

    public Collection<Round> getRounds() {
        return rounds;
    }

    public void setRounds(Collection<Round> rounds) {
        this.rounds = rounds;
    }
}




