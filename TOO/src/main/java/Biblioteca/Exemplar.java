
package Biblioteca;

/**
 *
 * @author 20222PF.CC0021
 */
public class Exemplar {
   private Integer id;
   private Boolean situacao;
   private Livro livro;

    public Exemplar() {
    }

    public Exemplar(Integer id, Boolean situacao, Livro livro) {
        this.id = id;
        this.situacao = situacao;
        this.livro = livro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
