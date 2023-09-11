package ex06;

public class CalculadoraDeSalario {
    public static double valorPago(double valorPorHora, double horasTrabalhadas) { //Não precisa de NENHUM estado interno, funciona apenas baseado nos parâmetros
          return valorPorHora * horasTrabalhadas;
    }
}
