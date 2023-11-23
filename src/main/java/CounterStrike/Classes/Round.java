package CounterStrike.Classes;

import java.util.Calendar;

public class Round {
    private Integer id;
    private Integer numero;
    private java.util.Calendar inicio;
    private java.util.Calendar fim;
    private Partida partida;
    private Modo modo;
    private Objetivo objetivo;

    public Round(Integer id, Integer numero, Calendar inicio, Calendar fim, Partida partida, Modo modo, Objetivo objetivo) {
        this.id = id;
        this.numero = numero;
        this.inicio = inicio;
        this.fim = fim;
        this.partida = partida;
        this.modo = modo;
        this.objetivo = objetivo;
    }

    public Round() {
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public Modo getModo() {
        return modo;
    }

    public void setModo(Modo modo) {
        this.modo = modo;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }
}


