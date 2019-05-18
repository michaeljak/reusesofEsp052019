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
public class CebolaFrita extends Adcionais{
   
    
    private Prato adcionais;
    public CebolaFrita (Prato adcionais){
        this.adcionais = adcionais;
    }
    
    public String getNome(){
        return adcionais.getNome()+ ", Cebola Frita";
    }
    
    public double preco(){
        return 1.5 + adcionais.preco();
    }
}