
package Biblioteca;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0021
 */
public class Livro {
    private Integer id;
    private String titulo;
    private Collection<PalavraChave> Palavras_Chave;

    public Livro() {
    }

    public Livro(Integer id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }
    
    public Livro(Integer id, String titulo, Collection<PalavraChave> Palavras_Chave) {
        this.id = id;
        this.titulo = titulo;
        this.Palavras_Chave = Palavras_Chave;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Collection<PalavraChave> getPalavras_Chave() {
        return Palavras_Chave;
    }

    public void setPalavras_Chave(Collection<PalavraChave> Palavras_Chave) {
        this.Palavras_Chave = Palavras_Chave;
    }
    
    
    public void setPalavra_Chave(PalavraChave PalavraChave) {
        if(this.Palavras_Chave == null)
        {
            this.Palavras_Chave = new ArrayList();
        }
        this.Palavras_Chave.add(PalavraChave);
    }
    
}
