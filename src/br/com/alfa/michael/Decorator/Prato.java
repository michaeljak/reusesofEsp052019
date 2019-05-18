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
public abstract class Prato {
	String Nome = "Prato";

	public String getNome() {
		return Nome;
	}
        
	public abstract double preco();
}
