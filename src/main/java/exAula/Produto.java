package exAula;

import java.util.ArrayList;
import java.util.Collection;

public class Produto {
    private Integer id;
    private String nome;
    private float valor;
    private Collection<Foto> fotos; //agregacao por composição 
    //(um produto pode ter várias fotos, mas uma foto pertence a apenas um produto)

    public Produto() {
    }

    public Produto(Integer id, String nome, float valor, Collection<Foto> fotos) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.fotos = fotos;
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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Collection<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(Collection<Foto> fotos) {
        this.fotos = fotos;
    }
    // passa a foto e já adiciona, ao invés de criar uma coleção e tals
    // metodo adicional para complementar o encapsulamento de fotos
    public void setFotos(Foto foto) {
        if(this.fotos == null)
        {
            this.fotos = new ArrayList();
        }
        this.fotos.add(foto);
    }
    
    
}
