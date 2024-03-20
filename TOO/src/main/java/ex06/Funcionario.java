package ex06;

public class Funcionario {

    public String nome = "Paulo";
    public double valorHora;
    public double horasTrabalhadas;
    //public static final double LIMITE_CARTAO = 1500.00; //permanece sempre a mesma

    public Funcionario(String nome, double valorHora, double horasTrabalhadas) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double valorPago() {
        return valorHora * horasTrabalhadas;
    }
}
