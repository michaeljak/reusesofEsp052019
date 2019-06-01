
package br.com.alfa.michael.Decorator;


public abstract class Prato {
	String Nome = "Prato";

	public String getNome() {
		return Nome;
	}
        
	public abstract double preco();
}
