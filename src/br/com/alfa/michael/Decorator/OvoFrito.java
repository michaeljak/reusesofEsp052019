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
public class OvoFrito extends Adcionais{
   
    
    private Prato adcionais;
    public OvoFrito(Adcionais adcionais){
        this.adcionais = adcionais;
    }
    
    public String getNome(){
        return adcionais.getNome()+ ", Ovo Frito";
    }
    
    public double preco(){
        return 1.5 + adcionais.preco();
    }

   
    
}
