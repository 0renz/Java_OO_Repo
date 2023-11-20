/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exAula;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Calendar;

/**
 *
 * @author 20222PF.CC0021
 */
public class exAula {

    public exAula() throws ParseException {
        imprimePessoa(getPessoas()); // exercício 1
        ex2(); // exercício 2
    }

    public void ex2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();

        Cliente c = generateCliente();
        cal.setTime(sdf.parse(c.getDataUltimaCompra()));
        System.out.println("Data da ultima compra: " + sdf.format(cal.getTime()));
        System.out.println("Observações: " + c.getObservacoes());
        System.out.println("CPF: " + c.getCpf());
        System.out.println("RG: " + c.getRg());
        System.out.println("Nome: " + c.getNome());
        System.out.println("Logradouro: " + c.getLogradouro());
        cal.setTime(sdf.parse(c.getDataNasc()));
        System.out.println("Data de nascimento: " + sdf.format(cal.getTime()));
        System.out.println("Status: " + c.getStatus());

        Produto p = generateProduto();
        generateFoto(p);
        Pedido pd = generatePedido(c, p);
        imprimePedido(pd);

    }

    private Cliente generateCliente() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Cliente c = new Cliente();
        Calendar cal = Calendar.getInstance();

        cal.setTime(sdf.parse(JOptionPane.showInputDialog("Digite a data da compra: ")));
        c.setDataUltimaCompra((Calendar) cal.clone());
        c.setObservacoes(JOptionPane.showInputDialog("Digite as observações: "));

        c.setCpf(JOptionPane.showInputDialog("Digite o CPF: "));
        c.setRg(JOptionPane.showInputDialog("Digite o RG: "));
        c.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        c.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro: "));

        cal.setTime(sdf.parse(JOptionPane.showInputDialog("Digite a data de nascimento: ")));
        c.setDataNasc((Calendar) cal.clone());

        c.setPeso(Float.valueOf(JOptionPane.showInputDialog("Digite o peso: ")));
        c.setStatus(Boolean.valueOf(JOptionPane.showInputDialog("Digite o Status: ")));

        return c;
    }

    private Produto generateProduto() throws ParseException {
        Produto p = new Produto();

        p.setId(Integer.valueOf(JOptionPane.showInputDialog("Digite o ID do produto")));
        p.setNome(JOptionPane.showInputDialog("Digite o nome do produto"));
        p.setValor(Float.valueOf(JOptionPane.showInputDialog("Digite o valor do produto")));
        return p;
    }

    private Foto generateFoto(Produto p) throws ParseException {
        Foto f = new Foto();
        f.setCodigo(Integer.valueOf(JOptionPane.showInputDialog("Digite o codigo da foto")));
        f.setFilename(JOptionPane.showInputDialog("Digite o nome do arquivo"));
        f.setPath(JOptionPane.showInputDialog("Digite o caminho do arquivo"));
        //f.setfile não se como faz
        f.setProduto(p);
        return f;
    }

    private Pedido generatePedido(Cliente c, Produto p) throws ParseException {
        Pedido pd = new Pedido();
        Calendar cal = Calendar.getInstance();
        pd.setCodigo(1);
        pd.setData((Calendar) cal.clone());
        pd.setValorTotal(p.getValor());
        pd.setNomeCliente(c); // que na verdade é o cliente inteiro

        for (Produto pdt : pd.getProdutos()) {
            System.out.println("Produto: " + pdt.getId()); // imprime todos os produtos do pedido
            for (Foto ft : pdt.getFotos()) {
                System.out.println("" + ft.getCodigo()); //imprime todas as fotos de cada produto
            }
        }
        pd.setProduto(p);
        return pd;
    }

    private void imprimePedido(Pedido pd) {
        System.out.println("\nPEDIDO:");
        System.out.println("Código: " + pd.getCodigo());
        System.out.println("Data: " + pd.getData());
        System.out.println("Valor total: " + pd.getValorTotal());
        System.out.println("Nome do cliente: " + pd.getNomeCliente().getNome());
        System.out.println("Produto: " + pd.getProdutos());
    }

    public static ArrayList<Pessoa> getPessoas() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        ArrayList<Pessoa> ListaPessoa = new ArrayList<>();

        Funcionario f1 = new Funcionario();
        Cliente c1, c2;
        Aluno a1, a2;

        Pessoa p1 = new Funcionario();
        try {
            p1 = new Funcionario("sasa", sdf.parse("11/11/2033")); //tem que setar tudo
        } catch (ParseException ex) {
            Logger.getLogger(exAula.class.getName()).log(Level.SEVERE, null, ex);
        }
        Pessoa p2 = new Aluno("1111", 5.5f);

        p1.setCpf("111");
        p1.setRg("222");
        p1.setNome("aaaa");
        p1.setLogradouro("cccc");
        //p1.setDataNasc(sdf.parse("11/11/2034"));
        p1.setPeso(1.6f);
        p1.setStatus(Boolean.TRUE);

        p2.setCpf("112");
        p2.setRg("223");
        p2.setNome("bbbb");
        p2.setLogradouro("dddd");
        //p2.setDataNasc(sdf.parse("12/09/2000"));
        p2.setPeso(2.0f);
        p2.setStatus(Boolean.FALSE);

        //String cpf, String rg, String nome, String logradouro, Integer numero, Date dataNasc, Float peso
        a1 = new Aluno("123", 6.4f);
        a1.setNome("Fabricio");
        a2 = new Aluno("456", 8.8f);
        a2.setNome("Gustavo");

        try {
            //c1 = new Cliente(sdf.parse("10/09/2345"), "sim");
            //c1.setNome("Luan");
            //c2 = new Cliente(sdf.parse("04/01/2345"), "não");
            //c2.setNome("Otavio");
            f1 = new Funcionario("5555", sdf.parse("01/01/2024"));
        } catch (ParseException ex) {
            Logger.getLogger(exAula.class.getName()).log(Level.SEVERE, null, ex);
        }

        ListaPessoa.add(f1);
        ListaPessoa.add(a1);
        ListaPessoa.add(a2);
        // ListaPessoa.add(c1);
        //ListaPessoa.add(c2);

        ListaPessoa.add(p1);
        ListaPessoa.add(p2);

        return ListaPessoa;
    }

    public static void ex02() {
    }

    private void imprimePessoa(ArrayList<Pessoa> pessoas) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (Pessoa p : pessoas) {
            if (p instanceof Funcionario funcionario) {
                System.out.println("(Funcionario) ctps: " + funcionario.getNumeroCTPS()); // jeito diferente e mais simples de fazer
            } else if (p instanceof Aluno) {
                System.out.println("(Aluno) matricula: " + ((Aluno) p).getNumeroMatricula());
            } else if (p instanceof Cliente) {
                System.out.println("(Cliente) ultima compra: " + sdf.format(((Cliente) p).getDataUltimaCompra()));
            }

            if (p instanceof Pessoa) {
                System.out.println("(Pessoa) Nome: " + p.getNome() + " | CPF: " + p.getCpf() + "\n");
            }
        }

    }

    public static void main(String[] args) throws ParseException {
        new exAula();
    }

}
