/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca_2;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author 0renz
 */
public class Livro {
    private Integer id;
    private String titulo;
    private Collection<PalavrasChave> palavrasChave;

    public Livro() {
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

    public Collection<PalavrasChave> getPalavrasChave() {
        return palavrasChave;
    }
    
    public void setPalavraChave(PalavrasChave palavraChave) {
        
        if (this.palavrasChave == null)
        {
            this.palavrasChave = new ArrayList();
        }
        this.palavrasChave.add(palavraChave);
    }

    public void setPalavrasChave(Collection<PalavrasChave> palavrasChave) {
        this.palavrasChave = palavrasChave;
    }
}
