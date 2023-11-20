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
public class Aluno extends Pessoa{
    String matricula;

    public Aluno() {
    }

    public Aluno(String matricula, String cpf, String nome, String rg, String logradouro, String cep, Integer numero, Calendar data_cadastro, Calendar data_nascimento) {
        super(cpf, nome, rg, logradouro, cep, numero, data_cadastro, data_nascimento);
        this.matricula = matricula;
    }
    
    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
