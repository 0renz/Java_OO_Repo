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
public class Pessoa {
    private String cpf;
    private String nome;
    private String rg; 
    private String logradouro;
    private String ceo;
    private Integer numero;
    private java.util.Calendar data_cadastro;
    private java.util.Calendar data_nascimento;
    private Integer Idade;

    public Pessoa() {
    }

    public Pessoa(String cpf, String nome, String rg, String logradouro, String ceo, Integer numero, Calendar data_cadastro, Calendar data_nascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.logradouro = logradouro;
        this.ceo = ceo;
        this.numero = numero;
        this.data_cadastro = data_cadastro;
        this.data_nascimento = data_nascimento;
    }

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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Calendar getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Calendar data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Calendar getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
        Calendar atual = Calendar.getInstance();
        
        int anoAtual = atual.get(Calendar.YEAR);
        int anoNasc = data_nascimento.get(Calendar.YEAR);
        this.Idade = anoAtual - anoNasc;
    }

    public Integer getIdade() {
        return Idade;
    }   
}
