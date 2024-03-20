/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author 0renz
 */
public class Cliente extends Pessoa{
    private String observacoes;
    private Collection<Veiculo> veiculos;

    public Cliente() {
        super();
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
    
    public void setVeiculo(Veiculo veiculo) {
        if (this.veiculos == null)
        {
            this.veiculos = new ArrayList<>();
        }
        this.veiculos.add(veiculo);
    }

    public void setVeiculos(Collection<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    
    
    
}
