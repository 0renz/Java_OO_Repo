/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exAula;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author 20222PF.CC0021
 */
public class exAula {
    
    public exAula() throws ParseException {
        imprimePessoa(getPessoas());
    }
 
    public static ArrayList<Pessoa> getPessoas() throws ParseException {
        // criar a main --
        // crirar um construtor
        // criar um metodos que retorne uma colecao de pessoa
        //essa colecao devera ter 5 pessoas (1 func, 2 cliente e 2 aluno)
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        ArrayList<Pessoa> ListaPessoa = new ArrayList<>();

        Funcionario f1;
        Cliente c1, c2;
        Aluno a1, a2;

        Pessoa p1 = new Funcionario("sasa", sdf.parse("11/11/2033")); //tem que setar tudo
        Pessoa p2 = new Aluno("1111", 5.5f);

        p1.setCpf("111");
        p1.setRg("222");
        p1.setNome("aaaa");
        p1.setLogradouro("cccc");
        p1.setDataNasc(sdf.parse("11/11/2034"));
        p1.setPeso(1.6f);
        p1.setStatus(Boolean.TRUE);

        p2.setCpf("112");
        p2.setRg("223");
        p2.setNome("bbbb");
        p2.setLogradouro("dddd");
        p2.setDataNasc(sdf.parse("12/09/2000"));
        p2.setPeso(2.0f);
        p2.setStatus(Boolean.FALSE);

        //String cpf, String rg, String nome, String logradouro, Integer numero, Date dataNasc, Float peso
        a1 = new Aluno("123", 6.4f);
        a1.setNome("Fabricio");
        a2 = new Aluno("456", 8.8f);
        a2.setNome("Gustavo");

        c1 = new Cliente(sdf.parse("10/09/2345"), "sim");
        c1.setNome("Luan");
        c2 = new Cliente(sdf.parse("04/01/2345"), "não");
        c2.setNome("Otavio");

        f1 = new Funcionario("5555", sdf.parse("01/01/2024"));

        ListaPessoa.add(f1);
        ListaPessoa.add(a1);
        ListaPessoa.add(a2);
        ListaPessoa.add(c1);
        ListaPessoa.add(c2);
        
        ListaPessoa.add(p1);
        ListaPessoa.add(p2);
        
        return ListaPessoa;
    }

    private void imprimePessoa(ArrayList<Pessoa> pessoas) {
        
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (Pessoa p : pessoas) {
            if (p instanceof Funcionario funcionario) {
                System.out.println("(Funcionario) ctps: " + funcionario.getNumeroCTPS()); // jeito diferente e mais simples de fazer
            }
            else if (p instanceof Aluno) {
                System.out.println("(Aluno) matricula: " + ((Aluno) p).getNumeroMatricula());
            }
            else if (p instanceof Cliente){
                System.out.println("(Cliente) ultima compra: " + sdf.format(((Cliente) p).getDataUltimaCompra()));
            }
            
            if (p instanceof Pessoa){
                System.out.println("(Pessoa) Nome: " + p.getNome() + " | CPF: " + p.getCpf() + "\n");
            }
        }

    }

    public static void main(String[] args) throws ParseException {
        new exAula();
    }

}
