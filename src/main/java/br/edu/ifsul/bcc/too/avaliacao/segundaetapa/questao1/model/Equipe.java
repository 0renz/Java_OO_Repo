
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.util.Collection;


public class Equipe {
    private Integer id;
    private String nome;
    private String especialidades;
    private Collection<Funcionario> Funcionarios;

    public Equipe() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public Collection<Funcionario> getFuncionarios() {
        return Funcionarios;
    }

    public void setFuncionarios(Collection<Funcionario> Funcionarios) {
        this.Funcionarios = Funcionarios;
    }
    
    
}
