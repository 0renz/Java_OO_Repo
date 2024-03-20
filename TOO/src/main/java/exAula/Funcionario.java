package exAula;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Funcionario extends Pessoa{ //herança
    //numero ctps e data admissao
    private String numeroCTPS;
    private java.util.Date dataAdmissao;
    //N:N = agregação na orientação a objetos (atributo do tipo lista)
    private Collection<CursoAprimoramento> cursos; // implementação da agregação

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

    public Collection<CursoAprimoramento> getCursos() {
        return cursos;
    }

    public void setCursos(Collection<CursoAprimoramento> cursos) {
        this.cursos = cursos;
    }
    
        // passa a foto e já adiciona, ao invés de criar uma coleção e tals
    // metodo adicional para complementar o encapsulamento de fotos
    public void setCurso(CursoAprimoramento curso) {
        if(this.cursos == null)
        {
            this.cursos = new ArrayList();
        }
        this.cursos.add(curso);
    }
    
}
