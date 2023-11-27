/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.util.Collection;

/**
 *
 * @author 20222PF.CC0021
 */
public class Cliente extends Pessoa {
    private String observacoes;
    private Collection<Veiculo> veiculos;

    public Cliente() {
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Collection<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Collection<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
