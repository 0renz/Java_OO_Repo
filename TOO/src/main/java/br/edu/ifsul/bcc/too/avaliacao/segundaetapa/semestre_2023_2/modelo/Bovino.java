/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.semestre_2023_2.modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0021
 */
public class Bovino {

    private Integer id;
    private Calendar data_inicio;
    private Calendar data_fim;
    private Float peso_chegada;
    private Float peso_atual;
    private Float valor_kg_compra;
    private Float valor_kg_venda;
    private Float custo_diario;
    private Float valor_liquido;
    private Collection<Pesagem> pesagens;
    private Raca raca;
    private Situacao situacao;

    public Bovino() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Float getPeso_chegada() {
        return peso_chegada;
    }

    public void setPeso_chegada(Float peso_chegada) {
        this.peso_chegada = peso_chegada;
    }

    public Float getPeso_atual() {
        return peso_atual;
    }

    public Float getValor_kg_compra() {
        return valor_kg_compra;
    }

    public void setValor_kg_compra(Float valor_kg_compra) {
        this.valor_kg_compra = valor_kg_compra;
    }

    public Float getValor_kd_venda() {
        return valor_kg_venda;
    }

    public void setValor_kg_venda(Float valor_kd_venda) {
        this.valor_kg_venda = valor_kd_venda;
    }

    public Float getCusto_diario() {
        return custo_diario;
    }

    public void setCusto_diario(Float custo_diario) {
        this.custo_diario = custo_diario;
    }

    public Float getValor_liquido() {
        return valor_liquido;
    }

    public Collection<Pesagem> getPesagens() {
        return pesagens;
    }

    public void setPesagem(Pesagem pesagem) {
        if (this.pesagens == null) {
            this.pesagens = new ArrayList<>();
        }
        this.pesagens.add(pesagem);
    }

    public void setPesagens(Collection<Pesagem> pesagens) {
        this.pesagens = pesagens;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public void setPeso_atual() {
        for (Pesagem p : this.pesagens)
        {
           this.peso_atual = p.getPeso();  
        }     
    }

    public void setValor_liquido() {      
       valor_liquido = ((peso_atual * valor_kg_venda) - 
       ((data_fim.DAY_OF_YEAR - data_inicio.DAY_OF_YEAR) *
       custo_diario + (peso_chegada * valor_kg_compra)));
    }
    
    /*
    (peso_atual * valor_kilo_venda) -
        (
        ((data_fim - data_inicio) * custo_diario) +
        (peso_chegada * valor_kilo_compra)
        )
    */
}
