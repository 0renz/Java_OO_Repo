/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.util.Date;

/**
 *
 * @author 20222PF.CC0021
 */
public class MaoObra {
    private Integer id;
    private String descricao;
    private Date tempo_estimado_execucao;
    private Float valor;

    public MaoObra() {
    }

    public MaoObra(Integer id, String descricao, Date tempo_estimado_execucao, Float valor) {
        this.id = id;
        this.descricao = descricao;
        this.tempo_estimado_execucao = tempo_estimado_execucao;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getTempo_estimado_execucao() {
        return tempo_estimado_execucao;
    }

    public void setTempo_estimado_execucao(Date tempo_estimado_execucao) {
        this.tempo_estimado_execucao = tempo_estimado_execucao;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
