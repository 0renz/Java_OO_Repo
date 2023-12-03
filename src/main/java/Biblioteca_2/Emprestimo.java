/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca_2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 0renz
 */
public class Emprestimo {

    private Integer id;
    private Calendar data;
    private Calendar data_devolucao;
    private Calendar data_devolvido;
    private Boolean situacao;
    private Double valor;
    private Aluno aluno;
    private Funcionario funcionario;
    private Exemplar exemplar;
    private Collection<Parcelamento> parcelamentos;

    public Emprestimo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data.getTime());
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getData_devolucao() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data_devolucao.getTime());
    }

    public void setData_devolucao(Calendar data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public String getData_devolvido() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data_devolvido.getTime());
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public Collection<Parcelamento> getParcelamentos() {
        return parcelamentos;
    }

    public void setParcelamento(Parcelamento parcelamento) {
        if (this.parcelamentos == null) {
            this.parcelamentos = new ArrayList();
        }
        this.parcelamentos.add(parcelamento);
    }
    
    public void setParcelamentos(Collection<Parcelamento> parcelamentos) {
        this.parcelamentos = parcelamentos;
    }
}
