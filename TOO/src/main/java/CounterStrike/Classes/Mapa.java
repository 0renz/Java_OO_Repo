package CounterStrike.Classes;

import java.util.Collection;

public class Mapa {
    private Integer id;
    private String nome;
    private Collection<Local> local;

    public Mapa(Integer id, String nome, Collection<Local> local) {
        this.id = id;
        this.nome = nome;
        this.local = local;
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

    public Collection<Local> getLocal() {
        return local;
    }

    public void setLocal(Collection<Local> local) {
        this.local = local;
    }
}
