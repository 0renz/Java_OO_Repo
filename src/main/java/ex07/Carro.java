package ex07;

import java.util.List;

/**
 * @author 0renz
 */
public class Carro {

    String nome, modelo, fabricante;
    int numChassi;
    double valorMercado;
    public List<Pneu> listaPneus;

    public Carro() {
    }

    public Carro(String nome, String modelo, String fabricante, int numChassi, double valorMercado, List<Pneu> listaPneus) {
        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.numChassi = numChassi;
        this.valorMercado = valorMercado;
        this.listaPneus = listaPneus;
    }

    @Override
    public String toString() {
        return "Nome: " + nome
                + " | Modelo: " + modelo
                + " | Fabricante: " + fabricante
                + " | Número chassi: " + numChassi
                + " | Valor de mercado: " + valorMercado
                + "\n | Lista de peneus: " + listaPneus;
    }
}
