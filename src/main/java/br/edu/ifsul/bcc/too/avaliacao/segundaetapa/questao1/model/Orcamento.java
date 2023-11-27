/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0021
 */
public class Orcamento {
    private Integer id;
    private String observacoes;
    private Calendar data;
    private Collection<MaoObra> MaoObras;
    private Collection<Peca> Pecas;
    private Cliente cliente;
    private Veiculo veiculo;
    private Funcionario funcionario;

    public Orcamento() {
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
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

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Collection<MaoObra> getMaoObras() {
        return MaoObras;
    }

    public void setMaoObras(Collection<MaoObra> MaoObras) {
        this.MaoObras = MaoObras;
    }

    public Collection<Peca> getPecas() {
        return Pecas;
    }

    public void setPecas(Collection<Peca> Pecas) {
        this.Pecas = Pecas;
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
