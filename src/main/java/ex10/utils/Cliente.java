package ex10.utils;

import java.text.SimpleDateFormat;

public class Cliente {

    //Na classe Cliente defina os atributos protegidos: endereco, bairro, telefone, ultimaCompra.
    protected String endereco;
    protected String bairro;
    protected Integer telefone;
    protected String ultimaCompra;

    public Cliente(String endereco, String bairro, Integer telefone, String ultimaCompra) {
        this.endereco = endereco;
        this.bairro = bairro;
        this.telefone = telefone;
        this.ultimaCompra = ultimaCompra;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getUltimaCompra() {
        return ultimaCompra;
    }

    public void setUltimaCompra(String ultimaCompra) {
        this.ultimaCompra = ultimaCompra;
    }
}
