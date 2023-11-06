package exAula;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Pessoa{
    //data_ultima_compra
    //observacoes
    
    private java.util.Date dataUltimaCompra;
    private String Observacoes;

    public Cliente() {
    }

    public Cliente(Date dataUltimaCompra, String Observacoes) {
        this.dataUltimaCompra = dataUltimaCompra;
        this.Observacoes = Observacoes;
    }

    public Date getDataUltimaCompra() {
        return dataUltimaCompra;
    }

    public void setDataUltimaCompra(Date dataUltimaCompra) {
        this.dataUltimaCompra = dataUltimaCompra;
    }

    public String getObservacoes() {
        return Observacoes;
    }

    public void setObservacoes(String Observacoes) {
        this.Observacoes = Observacoes;
    }  
}
