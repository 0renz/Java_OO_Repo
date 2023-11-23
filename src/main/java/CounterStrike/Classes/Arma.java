package CounterStrike.Classes;

import java.util.Collection;

public class Arma extends Artefato{
    private Float comprimento_cano;
    private Tipo tipo;
    private Municao municao;

    public Arma(Float comprimento_cano, Tipo tipo, Municao municao, Integer id, String nome, Float peso, Float valor) {
        super(id, nome, peso, valor);
        this.comprimento_cano = comprimento_cano;
        this.tipo = tipo;
        this.municao = municao;
    }

    public Float getComprimento_cano() {
        return comprimento_cano;
    }

    public void setComprimento_cano(Float comprimento_cano) {
        this.comprimento_cano = comprimento_cano;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Municao getMunicao() {
        return municao;
    }

    public void setMunicao(Municao municao) {
        this.municao = municao;
    }
}
