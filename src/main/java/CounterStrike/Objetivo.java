package CounterStrike;

public class Objetivo {
    private Integer id;
    private String descricao;
    private Integer Pontos;
    private Local local;

    public Objetivo(Integer id, String descricao, Integer Pontos, Local local) {
        this.id = id;
        this.descricao = descricao;
        this.Pontos = Pontos;
        this.local = local;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getPontos() {
        return Pontos;
    }

    public void setPontos(Integer Pontos) {
        this.Pontos = Pontos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
