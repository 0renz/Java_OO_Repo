/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author loren
 */
public class ClientePessoaFisica extends Cliente{
          
    private String cpf;
    private String nome;
    private java.util.Date dataNasc;

    public ClientePessoaFisica(String cpf, String nome, Date dataNasc, String endereco, String bairro, Integer telefone, String ultimaCompra) {
        super(endereco, bairro, telefone, ultimaCompra);
        this.cpf = cpf;
        this.nome = nome;
        this.dataNasc = dataNasc;
    }
    // super para invocar construtor da superclasse

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    
     @Override
    public String toString() {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        
        return "\n - Nome: " + nome + " (pessoa física) - Data de nascimento: " + f.format(dataNasc);
    }
    
}
