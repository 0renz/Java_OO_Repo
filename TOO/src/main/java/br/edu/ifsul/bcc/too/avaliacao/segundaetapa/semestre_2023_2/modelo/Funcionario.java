/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.semestre_2023_2.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 20222PF.CC0021
 */
public class Funcionario extends Pessoa{
    private String numero_ctps;
    private Date data_admissao;
    private Date data_demissao;
    

    public Funcionario() {
        super();
    }

    public String getNumero_ctps() {
        return numero_ctps;
    }

    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }

    public String getData_admissao() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data_admissao);
    }

    public void setData_admissao(Date data_admissao) {
        this.data_admissao = data_admissao;
    }

    public String getData_demissao() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data_demissao);
    }

    public void setData_demissao(Date data_demissao) {
        this.data_demissao = data_demissao;
    }
}
