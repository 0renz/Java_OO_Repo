package CounterStrike.Classes;

public class Endereco {
    private Integer id;
    private String cep;
    private String complemento;

    public Endereco() {
    }

    public Endereco(Integer id, String cep, String complemento) {
        this.id = id;
        this.cep = cep;
        this.complemento = complemento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    } 
}