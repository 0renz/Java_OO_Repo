package Biblioteca;

import java.util.Calendar;

/**
 *
 * @author 0renz
 */
public class Emprestimo {
    
    private Integer id;
    private java.util.Calendar data;
    private java.util.Calendar data_devolucao;
    private java.util.Calendar data_devolvido;
    private Boolean situacao;
    private Aluno aluno;
    private Funcionario ctps;
    private Exemplar idExemplar;
  

    public Emprestimo() {
    }

    public Emprestimo(Integer id, Calendar data, Calendar data_devolucao, Calendar data_devolvido, Boolean situacao, Funcionario ctps, Aluno aluno, Exemplar idExemplar) {
        this.id = id;
        this.data = data;
        this.data_devolucao = data_devolucao;
        this.data_devolvido = data_devolvido;
        this.situacao = situacao;
        this.ctps = ctps;
        this.aluno = aluno;
        this.idExemplar = idExemplar;
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

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Funcionario getCtps() {
        return ctps;
    }

    public void setCtps(Funcionario ctps) {
        this.ctps = ctps;
    }

    public Exemplar getIdExemplar() {
        return idExemplar;
    }

    public void setIdExemplar(Exemplar idExemplar) {
        this.idExemplar = idExemplar;
    }
}
