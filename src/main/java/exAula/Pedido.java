package exAula;

import java.util.Collection;
import java.util.Date;

public class Pedido {

    //codigo, data, valor total, cliente.
    // um pedido referencia um cliente
    // um funcionário tem uma coleção de cursos
    //pedido é uma ASSOCIAÇÃO (aponta pra cliente) ou seja, um relação 1:N
    private Integer codigo;
    private java.util.Date data;
    private Float valorTotal;
    private Cliente nomeCliente;
    private Collection<Produto> produtos; // (Um pedido pode ter um ou vários produtos)

    public Pedido() {
    }

    public Pedido(Integer codigo, Date data, Float valorTotal, Cliente nomeCliente, Collection<Produto> produtos) {
        this.codigo = codigo;
        this.data = data;
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
        this.produtos = produtos;
    }

   
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(Cliente nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Collection<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Collection<Produto> produtos) {
        this.produtos = produtos;
    }
    
    

    
}
