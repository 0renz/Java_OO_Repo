package CounterStrike.Classes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

public class Jogador {
    private String nickname;
    private String senha;
    private Integer pontos;
    private java.util.Calendar data_cadastro;
    private java.util.Calendar data_ultimo_login;
    private Endereco endereco;
    private Compra Compra; // Composição
    private Collection<Artefato> artefato; // Agregação
    private Collection<Patente> patente; // Composição

    public Jogador() {
    }

    public Jogador(String nickname, String senha, Integer pontos, Calendar data_cadastro, Calendar data_ultimo_login, Endereco endereco, Compra Compra, Collection<Artefato> artefato, Collection<Patente> patente) {
        this.nickname = nickname;
        this.senha = senha;
        this.pontos = pontos;
        this.data_cadastro = data_cadastro;
        this.data_ultimo_login = data_ultimo_login;
        this.endereco = endereco;
        this.Compra = Compra;
        this.artefato = artefato;
        this.patente = patente;
    }

    public Compra getCompra() {
        return Compra;
    }

    public void setCompra(Compra Compra) {
        this.Compra = Compra;
    }

    public Collection<Artefato> getArtefato() {
        return artefato;
    }

    public void setArtefato(Artefato artefato) {
        if (this.artefato == null)
        {
            this.artefato = new ArrayList();
        }
        this.artefato.add(artefato);
    }

    public void setArtefato(Collection<Artefato> artefato) {
        this.artefato = artefato;
    }

    public Collection<Patente> getPatente() {
        return patente;
    }

    public void setPatente(Collection<Patente> patente) {
        this.patente = patente;
    }
    
    public void setPatente(Patente patente) {
        if (this.patente == null)
        {
            this.patente = new ArrayList();
        }
        this.patente.add(patente);
    }

    
    
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public Calendar getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Calendar data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Calendar getData_ultimo_login() {
        return data_ultimo_login;
    }

    public void setData_ultimo_login(Calendar data_ultimo_login) {
        this.data_ultimo_login = data_ultimo_login;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
