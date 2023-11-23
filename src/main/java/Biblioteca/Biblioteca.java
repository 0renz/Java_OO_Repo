package Biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author 0renz
 */
public class Biblioteca {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Calendar calCadastro = Calendar.getInstance();
    Calendar calNascimento = Calendar.getInstance();

    public Biblioteca() throws ParseException {
        calCadastro.setTime(sdf.parse("10/07/2003"));
        calNascimento.setTime(sdf.parse("15/02/2019"));
        Aluno a = new Aluno("1", "111.111.111-11", "Joao", "55555555", "praça", "adasdasd", 30, (Calendar) calCadastro.clone(), (Calendar) calNascimento.clone());
        
        calCadastro.setTime(sdf.parse("10/07/2005"));
        calNascimento.setTime(sdf.parse("15/02/2023"));    
        Aluno b = new Aluno("2", "222.222.222-22", "Marselo", "777777", "Casa", "zxccxzc", 10, (Calendar) calCadastro.clone(), (Calendar) calNascimento.clone());  
  
        calCadastro.setTime(sdf.parse("15/03/2000"));
        calNascimento.setTime(sdf.parse("15/02/2029"));
        Funcionario f = new Funcionario("1", "222.222.222-22", "Carlos", "3333333", "rua", "wqeuoqiwe", 1150, (Calendar) calCadastro.clone(), (Calendar) calNascimento.clone());

        PalavraChave palavra1 = new PalavraChave(1, "Fantasia");
        PalavraChave palavra2 = new PalavraChave(2, "Ficção Científica");
        PalavraChave palavra3 = new PalavraChave(3, "Biografia");
        PalavraChave palavra4 = new PalavraChave(4, "Filosofia");
        PalavraChave palavra5 = new PalavraChave(5, "História");

        Livro livro1 = new Livro(1, "Morro dos Ventos Uivantes");
        livro1.setPalavra_Chave(palavra1);
        livro1.setPalavra_Chave(palavra4);
        
        Livro livro2 = new Livro(2, "Senhor dos Anéis");
        livro2.setPalavra_Chave(palavra1);
        livro2.setPalavra_Chave(palavra2);
        livro2.setPalavra_Chave(palavra5);
        
        Exemplar exemplar1 = new Exemplar(1, Boolean.TRUE, livro1);
        Exemplar exemplar2 = new Exemplar(2, Boolean.FALSE, livro2);

        Calendar calAtual = Calendar.getInstance();
        calCadastro.setTime(sdf.parse("15/03/2000"));
        calNascimento.setTime(sdf.parse("15/02/2029"));
        Emprestimo emp1 = new Emprestimo(1, calAtual, (Calendar) calCadastro.clone(), (Calendar) calNascimento.clone(), Boolean.TRUE, f, a, exemplar1);

        calAtual = Calendar.getInstance();
        calCadastro.setTime(sdf.parse("15/03/2003"));
        calNascimento.setTime(sdf.parse("15/02/2024"));
        Emprestimo emp2 = new Emprestimo(2, calAtual, (Calendar) calCadastro.clone(), (Calendar) calNascimento.clone(), Boolean.FALSE, f, b, exemplar2);
        
        ImprimeEmprestimo(emp1);
        ImprimeEmprestimo(emp2);
    }

    public static void ImprimeEmprestimo(Emprestimo emp) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("\nEmprestimo: ");
        System.out.println("ID: " + emp.getId());
        System.out.println("Data atual: " + sdf.format(emp.getData().getTime()));
        System.out.println("Data de devolução: " + sdf.format(emp.getData_devolucao().getTime()));
        System.out.println("Data em que foi devolvido: " + sdf.format(emp.getData_devolvido().getTime()));
        System.out.println("Situação: " + emp.getSituacao());
        System.out.println("Funcionario: " + emp.getCtps().getNome());
        System.out.println("Aluno: " + emp.getAluno().getNome());
        System.out.println("Exemplar: (" + emp.getIdExemplar().getId() + ") " + emp.getIdExemplar().getLivro().getTitulo());

        System.out.println("Palavras chave: " + emp.getIdExemplar().getLivro().getPalavras_Chave());
    }

    public static void main(String[] args) throws ParseException {
        System.out.println("SISTEMA DE BIBLIOTECA");
        new Biblioteca();
    }
}