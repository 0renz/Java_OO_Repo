package Biblioteca;

import java.util.Calendar;

/**
 *
 * @author 0renz
 */
public class Emprestimo {
    Integer id;
    java.util.Calendar data;
    java.util.Calendar data_devolucao;
    java.util.Calendar data_devolvido;
    Boolean situacao;

    public Emprestimo() {
    }

    public Emprestimo(Integer id, Calendar data, Calendar data_devolucao, Calendar data_devolvido, Boolean situacao) {
        this.id = id;
        this.data = data;
        this.data_devolucao = data_devolucao;
        this.data_devolvido = data_devolvido;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Calendar getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(Calendar data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public Calendar getData_devolvido() {
        return data_devolvido;
    }

    public void setData_devolvido(Calendar data_devolvido) {
        this.data_devolvido = data_devolvido;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }
}
