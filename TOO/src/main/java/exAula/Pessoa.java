package exAula;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pessoa {

    private String cpf;
    private String rg;
    private String nome;
    private String logradouro;
    private Integer numero;
    private Calendar dataNasc;
    private Float peso;
    private Boolean status;

    public Pessoa() {
    }

    public Pessoa(String cpf, String rg, String nome, String logradouro, Integer numero, Calendar dataNasc, Float peso) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.dataNasc = dataNasc;
        this.peso = peso;
    }

    public Pessoa(String cpf, String rg, String nome, String logradouro, Integer numero, Calendar dataNasc, Float peso, Boolean status) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.dataNasc = dataNasc;
        this.peso = peso;
        this.status = status;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDataNasc() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return sdf.format(this.dataNasc.getTime());
    }

    public void setDataNasc(Calendar dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        if (dataNasc != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Calendar c = Calendar.getInstance();
            try {
                c.setTimeInMillis(sdf.parse(dataNasc).getTime());
                this.dataNasc = c;
            } catch (ParseException ex) {
               this.dataNasc = null;
            }
        }
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
