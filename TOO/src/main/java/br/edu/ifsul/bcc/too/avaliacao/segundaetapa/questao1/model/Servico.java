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
public class Servico {
    private Integer id;
    private Float valor;
    private Calendar data_inicio;
    private Calendar data_fim;
    private StatusServico statusServico;
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

    public String getData_inicio() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data_inicio.getTime());
    }

    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_fim() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data_fim.getTime());
    }

    public void setData_fim(Calendar data_fim) {
        this.data_fim = data_fim;
    }

    public StatusServico getStatusServico() {
        return statusServico;
    }

    public void setStatusServico(StatusServico statusServico) {
        this.statusServico = statusServico;
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
    
    public void setPagamento(Pagamento pagamento) {
        if (this.pagamentos == null) {
            this.pagamentos = new ArrayList<>();
        }
        this.pagamentos.add(pagamento);
    }

    public void setPagamentos(Collection<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }
}
