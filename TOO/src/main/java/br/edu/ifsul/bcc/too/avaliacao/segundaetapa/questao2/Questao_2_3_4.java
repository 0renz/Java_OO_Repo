package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao2;

import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Questao_2_3_4 {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Questao_2_3_4() {
        imprimeListaPessoas(inicializaListaPessoas());
        imprimeListaOrcamentos(inicializaListaOrcamentos(inicializaListaPessoas()));
    }

    private List<Pessoa> inicializaListaPessoas() {
        try {
            List<Pessoa> listaPessoas = new ArrayList<>();
            Calendar data = Calendar.getInstance();

            Funcionario f1 = new Funcionario();
            f1.setCpf("11111357788");
            f1.setNome("Zé Chaves");
            data.setTime(sdf.parse("01/05/1983"));
            f1.setData_nascimento((Calendar) data.clone());
            f1.setCep("99052250");
            f1.setComplemento("apartamento 400");
            f1.setNumero_ctps("123");
            data.setTime(sdf.parse("20/10/1999"));
            f1.setData_admissao((Calendar) data.clone());

            Cliente c1 = new Cliente();
            c1.setCpf("11111357788");
            c1.setNome("Zé Chaves");
            data.setTime(sdf.parse("01/05/1983"));
            c1.setData_nascimento((Calendar) data.clone());
            c1.setCep("99052250");
            c1.setComplemento("apartamento 400");
            c1.setObservacoes("Cliente que paga em dia");

            Veiculo v1 = new Veiculo();
            v1.setPlaca("igd1903");
            v1.setModelo("vectra");
            v1.setAno(1997);
            data.setTime(sdf.parse("01/02/2022"));
            v1.setData_ultimo_servico((Calendar) data.clone());

            c1.setVeiculo(v1);

            listaPessoas.add(f1);
            listaPessoas.add(c1);

            return listaPessoas;

        } catch (ParseException ex) {
            Logger.getLogger(Questao_2_3_4.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private List<Orcamento> inicializaListaOrcamentos(List<Pessoa> lista) {
        try {
            List<Orcamento> listaOrcamento = new ArrayList<>();
            Orcamento o1 = new Orcamento();
            Calendar data = Calendar.getInstance();

            o1.setId(1);
            o1.setObservacoes("carro em péssimas condições");
            data.setTime(sdf.parse("14/12/2022"));
            o1.setData((Calendar) data.clone());
            o1.setCliente((Cliente) lista.get(1));

            Veiculo v1 = new Veiculo();
            v1.setPlaca("igd1903");
            v1.setModelo("vectra");
            v1.setAno(1997);
            data.setTime(sdf.parse("01/02/2022"));
            v1.setData_ultimo_servico((Calendar) data.clone());

            o1.setVeiculo(v1);

            Orcamento o2 = new Orcamento();

            o2.setId(2);
            o2.setObservacoes("carro em péssimas condições");
            data.setTime(sdf.parse("15/12/2022"));
            o2.setData((Calendar) data.clone());

            listaOrcamento.add(o1);
            listaOrcamento.add(o2);

            return listaOrcamento;

        } catch (ParseException ex) {
            Logger.getLogger(Questao_2_3_4.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    private void imprimeListaPessoas(List<Pessoa> lista) {

        for (Pessoa p : lista) {
            if (p instanceof Cliente) {
                System.out.println("Cliente: ");
            }

            if (p instanceof Funcionario) {
                System.out.println("Funcionario: ");
                System.out.println("\t" + ((Funcionario) p).getNumero_ctps());
                System.out.println("\t" + ((Funcionario) p).getData_admissao());
            }

            System.out.println("\t" + p.getCpf());
            System.out.println("\t" + p.getNome());
            System.out.println("\t" + p.getData_nascimento());
            System.out.println("\t" + p.getCep());
            System.out.println("\t" + p.getComplemento());

            if (p instanceof Cliente) {
                System.out.println(((Cliente) p).getObservacoes());
                System.out.println("\tVeiculos: ");
                for (Veiculo v : ((Cliente) p).getVeiculos()) {
                    System.out.println("\t\t" + v.getPlaca());
                    System.out.println("\t\t" + v.getModelo());
                    System.out.println("\t\t" + v.getAno());
                    System.out.println("\t\t" + v.getData_ultimo_servico());
                }
            }

        }
    }

    private void imprimeListaOrcamentos(List<Orcamento> lista) {

        for (Orcamento o : lista) {
            System.out.println("ORCAMENTO " + o.getId());
            System.out.println("\t" + o.getObservacoes());
            System.out.println("\t" + o.getData());

            if (o.getCliente() != null) {
                System.out.println("\tCLIENTE " + o.getId());
                System.out.println("\t\t" + o.getCliente().getCpf());
                System.out.println("\t\t" + o.getCliente().getNome());
                System.out.println("\t\t" + o.getCliente().getData_nascimento());
                System.out.println("\t\t" + o.getCliente().getCep());
                System.out.println("\t\t" + o.getCliente().getComplemento());
                System.out.println("\t\t" + o.getCliente().getObservacoes());
            }

            if (o.getVeiculo() != null) {
                System.out.println("\tVEÍCULO ");
                System.out.println("\t\t" + o.getVeiculo().getPlaca());
                System.out.println("\t\t" + o.getVeiculo().getModelo());
                System.out.println("\t\t" + o.getVeiculo().getAno());
                System.out.println("\t\t" + o.getVeiculo().getData_ultimo_servico());
            }
        }
    }

    public static void main(String args[]) {
        new Questao_2_3_4();
    }
}
