package ex09.utils;

import java.util.Calendar;

public class PessoaEncapsulada {

    //atributos privados e métodos públicos é uma forma de encapsulamento.
    private String cpf;
    private String nome;
    private String corOlhos;
    private String corCabelo;
    private Calendar dataNascimento;
    private Double altura;
    private Integer Idade;

    protected PessoaEncapsulada() {
    }

    public PessoaEncapsulada(String cpf, String nome, String corOlhos, String corCabelo, Calendar dataNascimento, Double altura) {
        this.cpf = cpf;
        this.nome = nome;
        this.corOlhos = corOlhos;
        this.corCabelo = corCabelo;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    //polimorfismo: possibilita a reutilização de codigo fonte, uma vez que um objeto pode assumir várias formas.
    //Existem dois tipos de polimorfismo: sobrecarga (orverload) e sobreposição (override).
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

    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    // setar a idade aqui
    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;

        int ano = dataNascimento.get(Calendar.YEAR);
        Calendar atual = Calendar.getInstance();

        ano -= atual.get(Calendar.YEAR);

        this.Idade = Math.abs(ano);
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int getIdade(Integer Idade) {
        return this.Idade;
    }

    //9.3 Utilizando o conceito de polimorfismo/sobreposicao, reescreva o método toString() na classe br.edu.ifsul.bcc.too.base.topico4.PessoaEncapsulada.
    //Esse método deverá retornar uma string no formato: " CPF: <cpf> - Nome: <nome> Idade: <idade>"; 
    @Override
    public String toString() {
        return "PessoaEncapsulada{" + "CPF: " + cpf + ", Nome: " + nome + ", Idade: " + Idade + '}';
    }

}
