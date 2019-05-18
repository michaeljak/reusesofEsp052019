/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alfa.michael.Decorator;

/**
 *
 * @author Aluno
 */
public class Executar {
  public static void main(String[] args) {
        // TODO code application logic here
        Prato pedido1 = new PratoA();
        System.out.println("-------------------------------------------------");
        System.out.println("Carro:   "+ pedido1.getNome());
        System.out.println("Preco:  " + pedido1.preco());
        System.out.println("-------------------------------------------------");
        
        pedido1 = new CebolaFrita(pedido1);
        pedido1 = new CebolaFrita(pedido1);
        System.out.println("Carro:   "+ pedido1.getNome());
        System.out.println("Preco:  " + pedido1.preco());
        System.out.println("-------------------------------------------------");
        System.out.println();
           
}
}

