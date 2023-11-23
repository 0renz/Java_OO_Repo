package CounterStrike.Classes;

import java.util.Calendar;

public class Compra {
    private Integer id;
    private java.util.Calendar data;
    private Float total;
    private ItensCompra itens_compra;

    public Compra(Integer id, Calendar data, Float total, ItensCompra itens_compra) {
        this.id = id;
        this.data = data;
        this.total = total;
        this.itens_compra = itens_compra;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public ItensCompra getItens_compra() {
        return itens_compra;
    }

    public void setItens_compra(ItensCompra itens_compra) {
        this.itens_compra = itens_compra;
    }
}
