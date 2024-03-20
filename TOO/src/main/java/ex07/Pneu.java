package ex07;

/**
 *
 * @author 0renz
 */
public class Pneu implements Comparable<Pneu> {

    int codigo;
    String modelo;
    int posicao, medida;
    String fabricante;
    double valor;

    public Pneu(int codigo, String modelo, int posicao, int medida, String fabricante, double valor) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.posicao = posicao;
        this.medida = medida;
        this.fabricante = fabricante;
        this.valor = valor;
    }
    
    @Override
    public int compareTo(Pneu p) {
        return p.modelo.compareTo(this.modelo);
    }

    @Override
    public String toString(){
        return "Código: " + codigo+ " | Modelo: "+modelo;
    }

}
