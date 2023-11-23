package CounterStrike.Classes;

import java.util.Collection;

public class Objetivo {
    private Integer id;
    private String descricao;
    private Integer Pontos;
    private Collection<Local> local;

    public Objetivo(Integer id, String descricao, Integer Pontos, Collection<Local> local) {
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

    public Collection<Local> getLocal() {
        return local;
    }

    public void setLocal(Collection<Local> local) {
        this.local = local;
    }

}
