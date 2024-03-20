package exAula;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Cliente extends Pessoa {
    //data_ultima_compra
    //observacoes

    private java.util.Calendar dataUltimaCompra; //mudar para calendar
    private String Observacoes;

    public Cliente() {
    }

    public Cliente(Calendar dataUltimaCompra, String Observacoes) {
        this.dataUltimaCompra = dataUltimaCompra;
        this.Observacoes = Observacoes;
    }

    public String getDataUltimaCompra() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(this.dataUltimaCompra.getTime());
    }

    public void setDataUltimaCompra(Calendar dataUltimaCompra) {
        this.dataUltimaCompra = dataUltimaCompra;
    }

    public String getObservacoes() {
        return Observacoes;
    }

    public void setObservacoes(String Observacoes) {
        this.Observacoes = Observacoes;
    }
}
