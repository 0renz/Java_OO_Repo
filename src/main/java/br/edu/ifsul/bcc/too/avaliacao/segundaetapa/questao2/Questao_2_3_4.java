package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao2;

import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Questao_2_3_4 {
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Questao_2_3_4() throws ParseException {
        inicializaListaPessoas();
    }

    private List<Pessoa> inicializaListaPessoas() throws ParseException {
        /*
        Funcionario
 cpf = 11111357788
 nome = Zé Chaves
 data_nascimento = 01/05/1983
 cep = 99052250
 complemento = “apartamento 400”
 numero_ctps = “123”
data_admissao = ‘”20/10/1999”
         */
        
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        
        Calendar data = Calendar.getInstance();
        
        Funcionario f1 = new Funcionario();
        f1.setCpf("11111357788");
        f1.setNome("Zé Chaves");
        data.setTime(sdf.parse("01/05/1983"));
        f1.setData_nascimento((Calendar)data.clone());
        f1.setCep("99052250");
        f1.setComplemento("apartamento 400");
        f1.setNumero_ctps("123");
        data.setTime(sdf.parse("20/10/19"));
        f1.setData_admissao((Calendar)data.clone());
        
        Cliente c1 = new Cliente();
        c1.setCpf("11111357788");
        c1.setNome("Zé Chaves");
        data.setTime(sdf.parse("01/05/1983"));
        c1.setData_nascimento((Calendar)data.clone());
        c1.setCep("99052250");
        c1.setComplemento("apartamento 400");
        c1.
        
        return null;
    }

    private List<Orcamento> inicializaListaOrcamentos() {
        return null;
    }

    private void imprimeListaPessoas(List<Pessoa> lista) {
    }

    private void imprimeListaOrcamentos(List<Orcamento> lista) {
    }

    public static void main(String args[]) throws ParseException {
        new Questao_2_3_4();
    }

}
