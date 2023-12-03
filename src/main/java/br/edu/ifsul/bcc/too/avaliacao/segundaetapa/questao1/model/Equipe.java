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
public class Equipe {
    private Integer id;
    private String nome;
    private String especialidades;
    private Collection<Funcionario> funcionarios;

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
        return funcionarios;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        if (this.funcionarios == null)
        {
            this.funcionarios = new ArrayList<>();
        }
        this.funcionarios.add(funcionario);
    }

    public void setFuncionarios(Collection<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    
}
