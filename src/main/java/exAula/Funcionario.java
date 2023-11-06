package exAula;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario extends Pessoa{
    //numero ctps e data admissao
    private String numeroCTPS;
    private java.util.Date dataAdmissao;

    public Funcionario() {
    }

    public Funcionario(String numeroCTPS, Date dataAdmissao) {
        this.numeroCTPS = numeroCTPS;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNumeroCTPS() {
        return numeroCTPS;
    }

    public void setNumeroCTPS(String numeroCTPS) {
        this.numeroCTPS = numeroCTPS;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
