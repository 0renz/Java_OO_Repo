package CounterStrike.Classes;

public abstract class Artefato { //não dá pra fazer new em abstrato
    private Integer id;
    private String nome;
    private Float peso;
    private Float valor;

    public Artefato() {
    }

    public Artefato(Integer id, String nome, Float peso, Float valor) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
