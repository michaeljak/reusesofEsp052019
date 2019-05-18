
package br.com.alfa.michael.factoryMethod;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

/**
 *
 * @author Aluno
 */
public class Excutar {
    
    
    public static void main(String[] args) {
        
        IFactory fabrica = new Factore();               
		ICarro carro = fabrica.create(3, "SOL", "S");
		carro.exibirInfo();
                 System.out.println();
    
}
}
