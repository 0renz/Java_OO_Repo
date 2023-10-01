package ex08;

/**
 * @author 0renz
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Compra {

    private Integer codigo;
    private Calendar data_emissao;
    private Date data_saida;

    //construtor público com parâmetros.
    public Compra(Integer codigo, Calendar data_emissao, Date data_saida) {

        this.codigo = codigo;
        this.data_emissao = data_emissao;
        this.data_saida = data_saida;

    }

    public Compra() {

    }

    //@return the data_emissao
    public Calendar getData_emissao() {
        return data_emissao;
    }

    //@return the data_saida
    public Date getData_saida() {
        return data_saida;
    }

    @Override
    public String toString() {

        if (data_emissao != null && data_saida != null) {

            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss SSS");

            return "Codigo: " + getCodigo() + " Emissao: " + f.format(data_emissao.getTime()) + " Saída: " + f.format(data_saida);
        }

        return super.toString();
    }

    // @return the codigo
    public Integer getCodigo() {
        return codigo;
    }

    //@param codigo the codigo to set
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}
