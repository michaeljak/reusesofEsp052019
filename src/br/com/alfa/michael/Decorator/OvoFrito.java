
package br.com.alfa.michael.Decorator;


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
