package ex07;

/**
 * @author 0renz
 */
public class Carro {

    String nome, modelo, fabricante;
    int numChassi;
    double valorMercado;

    public Carro() {
    }

    public Carro(String nome, String modelo, String fabricante, int numChassi, double valorMercado) {
        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.numChassi = numChassi;
        this.valorMercado = valorMercado;
    }
    
    @Override
    public String toString(){
        return "Código: " + numChassi+ " | Modelo: "+modelo;
    }
}
