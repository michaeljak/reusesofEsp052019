
package br.com.alfa.michael.Decorator;


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