package exAula;

import java.util.Date;

public class Aluno extends Pessoa{
    private String numeroMatricula;
    private Float coeficienteRendimento;

    public Aluno() {
    }
    
    public Aluno(String numeroMatricula, Float coeficienteRendimento) {
        //super(cpf, rg, nome, logradouro, numero, dataNasc, peso, status);
        this.numeroMatricula = numeroMatricula;
        this.coeficienteRendimento = coeficienteRendimento;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Float getCoeficienteRendimento() {
        return coeficienteRendimento;
    }

    public void setCoeficienteRendimento(Float coeficienteRendimento) {
        this.coeficienteRendimento = coeficienteRendimento;
    }

}
