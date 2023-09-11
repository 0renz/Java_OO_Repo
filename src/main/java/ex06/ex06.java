package ex06;

public class ex06 { //Modificador FINAL e STATIC
    //6) Implemente uma rotina para demonstrar/testar os modificadores static e FINAL.

    public static void main(String[] args) {
        
        Funcionario x = new Funcionario("Paulo", 100.2, 15.5);
        Funcionario y = new Funcionario("João", 15.2, 1875.5);
        
        System.out.println(x.valorPago());
        System.out.println(y.valorPago());
        
        double resultado = CalculadoraDeSalario.valorPago(100.0, 5.0);
        
        System.out.println(resultado);
        
        // Um método estático (ou método de classe, pois pode ser chamado diretamente pelo nome da classe) 
        // não depende do estado particular de cada objeto
        
     
    }
  }


