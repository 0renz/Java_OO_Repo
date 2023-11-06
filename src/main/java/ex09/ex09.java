package ex09;

import ex09.utils.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ArrayList;

 /*    
    9. Utilizando o conceito de encapsulamento, crie métodos públicos na classe br.edu.ifsul.bcc.too.topico4.PessoaEncapsulada
       para disponibilizar o acesso aos atributos da instância: corOlhos, corCabelo, dataNascimento, altura.   

    9.1 Utilizando o conceito de encapsulamento, crie um novo atributo de instância na classe br.edu.ifsul.bcc.too.base.topico4.PessoaEncapsulada.
    Esse atributo irá manter a informação da idade. A informação da idade deve ser gerada automaticamente pelo
    método setDataNascimento(). Sendo assim, disponibilize o acesso a esse atributo através do método getIdade(). 
    O método setIdade() não deve ser codificado, já que a idade será gerada automaticamente.
    
    9.2 Utilizando o conceito de polimorfismo/sobrecarga, codifique um novo construtor para a classe br.edu.ifsul.bcc.too.base.topico4.PessoaEncapsulada.
        Esse método deverá ter uma assinatura que possibilite receber por parâmetro dados para os atributos: cpf, nome, corOlhos, corCabelo, dataNascimento, altura;
    
    9.3 Utilizando o conceito de polimorfismo/sobreposicao, reescreva o método toString() na classe br.edu.ifsul.bcc.too.base.topico4.PessoaEncapsulada.
    Esse método deverá retornar uma string no formato: " CPF: <cpf> - Nome: <nome> Idade: <idade>";    

    9.4 Codifique e execute um método na classe Exercicio9 para criar cinco instâncias de PessoaEncapsulada. Em seguida adicione-as em uma lista e imprime-as na saída padrão os dados de cada aluno no formato " CPF: <cpf> - Nome: <nome> Idade: <idade>"
    */

public class ex09 {
    
    ex09() throws ParseException {
        PessoaEncapsulada p1;
        
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        ArrayList <PessoaEncapsulada> ListaPessoas = new ArrayList<>();
        
        c.setTime(sdf.parse("11/11/1999"));
        p1 = new PessoaEncapsulada("1", "a", "b", "c", (Calendar) c.clone(), 1.76);
        
        ListaPessoas.add(p1);
        System.out.println(ListaPessoas);
    
    }
    
    public static void main(String[] args) throws ParseException {
       new ex09(); 
    }
    
}
