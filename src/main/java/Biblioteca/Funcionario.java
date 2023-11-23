/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

import java.util.Calendar;

/**
 *
 * @author 0renz
 */
public class Funcionario extends Pessoa{
    private String numero_ctps;
    
    public Funcionario() {
    }

    public Funcionario(String numero_ctps, String cpf, String nome, String rg, String logradouro, String cep, Integer numero, Calendar data_cadastro, Calendar data_nascimento) {
        super(cpf, nome, rg, logradouro, cep, numero, data_cadastro, data_nascimento);
        this.numero_ctps = numero_ctps;
    }

    public String getNumero_ctps() {
        return numero_ctps;
    }

    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }
}
