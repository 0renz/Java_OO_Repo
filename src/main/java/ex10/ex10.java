package ex10;

import ex10.utils.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 0renz
 */
public class ex10 {
    
    
    /*
        10. Implemente no pacote br.edu.ifsul.bcc.too.base.topico4.exercicios.util o diagrama localizado no diretorio
        src/main/resources/imagens/diagrama_heranca_cliente.jpg. Sendo assim, crie as classes: Cliente, ClientePessoaFisica e ClientePessoaJuridica.
        Na classe Cliente defina os atributos protegidos: endereco, bairro, telefone, ultimaCompra.
        Na classe ClientePessoaFisica defina os atributos privados: cpf, nome e nascimento.
        Por fim, na classe ClientePessoaJuridica defina os atributos privados: cnpj, nomeFantasia e razaoSocial.
    
        10.1 Implemente a herança conforme o diagrama. Portanto, ClientePessoaFisica deverá herdar de Cliente. Ex:
                ...
                    public class ClientePessoaFisica extends Cliente {
                ... 
    
            ClientePessoaJuridica também deverá herdar de Cliente, ex: 
                ...
                    public class ClientePessoaJuridica extends Cliente {
    
        10.2 Encapsule os atributos das classes Cliente, ClientePessoaFisica e ClientePessoaJuridica
    
        10.3 Codifique e execute um método na classe Exercicio10 para criar duas instâncias de ClientePessoaFisica e duas de ClientePessoaJuridica.
        Essas 4 instâncias deverão conter dados e ser adicionadas em uma lista de Cliente. 
        Em seguida imprime-as na saída padrão os seus dados e a indicação do tipo da instância. ex:
                
                - Nome         : Fulano     (Pessoa Fisica)
                - Nome fantasia: Bar do Zé (Pessoa Juridica)
    
    */
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
    
    ex10() throws ParseException{
        ClientePessoaFisica cpf1, cpf2;
        cpf1 = new ClientePessoaFisica("111.111.111-41", "Alastor", sdf.parse("11/11/2003"), "123", "manhattan", 99991345, "Pastel");
        cpf2 = new ClientePessoaFisica("555.111.233-12", "Betoneira", sdf.parse("14/08/1999"), "125", "bronx", 99981949, "Arroz");
        
        ClientePessoaJuridica cpj1, cpj2;
        cpj1 = new ClientePessoaJuridica("12121", "Bar do Moe", "morte e dor", "14", "soares", 99953340, "Uranio");
        cpj2 = new ClientePessoaJuridica("13131", "Bar do Magal", "felicidade", "1", "centro", 99913231, "Plutonio"); 
        
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        
        listaCliente.add(cpf1);
        listaCliente.add(cpf2);
        listaCliente.add(cpj1);
        listaCliente.add(cpj2);
        
        System.out.println(listaCliente);
    }
    
    public static void main(String args[]) throws ParseException{
        new ex10();
    }
            
}
