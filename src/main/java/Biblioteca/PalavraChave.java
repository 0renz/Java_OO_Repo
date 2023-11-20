package Biblioteca;

/**
 *
 * @author 20222PF.CC0021
 */
public class PalavraChave {
    private Integer id;
    private String nome;

    public PalavraChave() {
    }

    public PalavraChave(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
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
}
