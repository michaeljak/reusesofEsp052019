
package br.com.alfa.michael.Decorator;


public class Executar {
  public static void main(String[] args) {
        // TODO code application logic here
        Prato pedido1 = new PratoA();
        System.out.println("-------------------------------------------------");
        System.out.println("Prato:   "+ pedido1.getNome());
        System.out.println("Preco:  " + pedido1.preco());
        System.out.println("-------------------------------------------------");
        
        pedido1 = new CebolaFrita(pedido1);
        pedido1 = new CebolaFrita(pedido1);
        System.out.println("Prato:   "+ pedido1.getNome());
        System.out.println("Preco:  " + pedido1.preco());
        System.out.println("-------------------------------------------------");
        System.out.println();
           
}
}

