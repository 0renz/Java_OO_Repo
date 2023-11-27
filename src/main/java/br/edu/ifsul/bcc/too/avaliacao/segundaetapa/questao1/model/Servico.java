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
public class Servico {
    private Integer id;
    private Float valor;
    private Calendar data_inicio;
    private Calendar data_fim;
    
    private StatusServico status_servico;
    private Orcamento orcamento;
    private Equipe equipe;
    private Collection<Pagamento> pagamentos;

    public Servico() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Calendar getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Calendar getData_fim() {
        return data_fim;
    }

    public void setData_fim(Calendar data_fim) {
        this.data_fim = data_fim;
    }

    public StatusServico getStatus_servico() {
        return status_servico;
    }

    public void setStatus_servico(StatusServico status_servico) {
        this.status_servico = status_servico;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Collection<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(Collection<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }
            
    
}
