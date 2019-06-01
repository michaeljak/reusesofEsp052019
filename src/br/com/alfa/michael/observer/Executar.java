
package br.com.alfa.michael.observer;

public class Executar {
    
    public static void main(String[] args){
        ClimaTempo climatempo = new ClimaTempo("Clima Tempo");
        Inmet inmet = new Inmet("InMet");
        CamposUniversitarios faculdade = new CamposUniversitarios("Faculdade");
       
        
        EstacaoMetereologica estacao = new EstacaoMetereologica();
        estacao.adicionarObservador(climatempo);
        estacao.adicionarObservador(inmet);
        estacao.adicionarObservador(faculdade);
        estacao.atualizar();
               
    }
}
