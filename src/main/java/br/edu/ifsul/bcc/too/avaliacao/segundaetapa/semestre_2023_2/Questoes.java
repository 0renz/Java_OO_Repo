package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.semestre_2023_2;

import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.semestre_2023_2.modelo.Bovino;
import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.semestre_2023_2.modelo.Pesagem;
import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.semestre_2023_2.modelo.Raca;
import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.semestre_2023_2.modelo.Situacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Questoes {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Questoes() {
        imprimeListaBovinos(inicializaListaBovinos());
    }

    public Collection<Bovino> inicializaListaBovinos() {
        try {
            Collection<Bovino> listaBovinos = new ArrayList<>();
            Calendar data = Calendar.getInstance();
            
            // ---------------------------------------------------- B1
            Bovino b1 = new Bovino();
            b1.setId(1);
            data.setTime(sdf.parse("01/03/2022"));
            b1.setData_inicio((Calendar) data.clone());
            data.setTime(sdf.parse("01/10/2022"));
            b1.setData_inicio((Calendar) data.clone());
            b1.setSituacao(Situacao.VIVO);
            b1.setPeso_chegada(150.10f);
            b1.setValor_kg_compra(14.20f);
            b1.setValor_kg_venda(9.10f);

            Raca r1 = new Raca();
            r1.setId(1);
            r1.setNome("Devon");

            b1.setRaca(r1);
            b1.setCusto_diario(1.00f);

            Pesagem p1 = new Pesagem();
            p1.setBovino(b1);
            p1.setData(sdf.parse("01/05/2022"));
            p1.setPeso(190.00f);

            Pesagem p2 = new Pesagem();
            p2.setBovino(b1);
            p2.setData(sdf.parse(" 01/10/2022"));
            p2.setPeso(350.00f);

            b1.setPesagem(p1);
            b1.setPesagem(p2);
            b1.setPeso_atual();
            b1.setValor_liquido();

            // ----------------------------------------------- B2
            Bovino b2 = new Bovino();
            b2.setId(2);
            data.setTime(sdf.parse("01/02/2022"));
            b2.setData_inicio((Calendar) data.clone());
            data.setTime(sdf.parse("01/10/2022"));
            b2.setData_inicio((Calendar) data.clone());
            b2.setSituacao(Situacao.VIVO);
            b2.setPeso_chegada(175.10f);
            b2.setValor_kg_compra(10.00f);
            b2.setValor_kg_venda(9.00f);
            b2.setRaca(r1);
            b2.setCusto_diario(0.95f);

            Pesagem p3 = new Pesagem();
            p3.setBovino(b2);
            p3.setData(sdf.parse("01/04/2022"));
            p3.setPeso(200.00f);

            Pesagem p4 = new Pesagem();
            p4.setBovino(b2);
            p4.setData(sdf.parse("01/10/2022"));
            p4.setPeso(345.00f);

            b2.setPesagem(p3);
            b2.setPesagem(p4);
            b2.setPeso_atual();
            b2.setValor_liquido();

            
            // ---------------------------------------------- B3
            Bovino b3 = new Bovino();
            b3.setId(3);
            data.setTime(sdf.parse("01/02/2022"));
            b3.setData_inicio((Calendar) data.clone());
            data.setTime(sdf.parse("01/10/2022"));
            b3.setData_inicio((Calendar) data.clone());
            b3.setSituacao(Situacao.VIVO);
            b3.setPeso_chegada(150.00f);
            b3.setValor_kg_compra(10.00f);
            b3.setValor_kg_venda(9.00f);
            b3.setRaca(r1);
            b3.setCusto_diario(0.90f);

            Pesagem p5 = new Pesagem();
            p5.setBovino(b3);
            p5.setData(sdf.parse("01/03/2022"));
            p5.setPeso(170.00f);

            Pesagem p6 = new Pesagem();
            p6.setBovino(b3);
            p6.setData(sdf.parse("01/10/2022"));
            p6.setPeso(370.50f);

            b3.setPesagem(p5);
            b3.setPesagem(p6);
            b3.setPeso_atual();
            b3.setValor_liquido();
            
            // ------------------ add
            listaBovinos.add(b1);
            listaBovinos.add(b2);
            listaBovinos.add(b3);
            
            return listaBovinos;

        } catch (ParseException ex) {
            Logger.getLogger(Questoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void imprimeListaBovinos(Collection<Bovino> listaBovinos) {
        for (Bovino b : listaBovinos) {
            System.out.println("ID: " + b.getId());
            System.out.println("Valor líquido: " + b.getValor_liquido());
            System.out.println("-----------------------");
        }
    }

    public static void main(String args[]) {
        new Questoes();
    }
}
