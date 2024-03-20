/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 0renz
 */
public class Orcamento {
    private Integer id;
    private String observacoes;
    private Calendar data;
    private Collection<MaoObra> maoObras;
    private Veiculo veiculo;
    private Collection<Peca> pecas;
    private Cliente cliente;
    private Funcionario funcionario;

    public Orcamento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getData() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data.getTime());
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Collection<MaoObra> getMaoObras() {
        return maoObras;
    }
    
    public void setMaoObra(MaoObra maoObra) {
        if (this.maoObras == null)
        {
            this.maoObras = new ArrayList<>();
        }
        this.maoObras.add(maoObra);
    }

    public void setMaoObras(Collection<MaoObra> maoObras) {
        this.maoObras = maoObras;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Collection<Peca> getPecas() {
        return pecas;
    }
    
    public void setPeca(Peca peca) {
        if (this.pecas == null)
        {
            this.pecas = new ArrayList<>();
        }
        this.pecas.add(peca);
    }

    public void setPecas(Collection<Peca> pecas) {
        this.pecas = pecas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
}
