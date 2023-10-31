/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10.utils;

import java.text.SimpleDateFormat;

/**
 *
 * @author loren
 */
public class ClientePessoaJuridica extends Cliente {

    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;

    public ClientePessoaJuridica(String cnpj, String nomeFantasia, String razaoSocial, String endereco, String bairro, Integer telefone, String ultimaCompra) {
        super(endereco, bairro, telefone, ultimaCompra);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");

        return "\n - Nome fantasia: " + nomeFantasia + " (pessoa jurídica) - CPNJ: " + cnpj;
    }
}
