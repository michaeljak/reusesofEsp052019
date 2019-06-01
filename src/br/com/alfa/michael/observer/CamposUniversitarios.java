
package br.com.alfa.michael.observer;

public class CamposUniversitarios implements Observer{

    private String nome;
    
    public CamposUniversitarios(String nome){
        this.nome = nome;
    }
    
    @Override
    public void atualiza(double temperatura, double pressao, double umidade) {
         
        System.out.printf("|------------------------------|");
        System.out.printf("\n| Intereçado                   |\n| -----" +nome+"-----          |");
        System.out.printf("\n| Temperatura Atualizada       |");
        System.out.printf("\n| Temperatura:" + String.valueOf(temperatura)+"|");
        System.out.printf("\n| Umidade:" + String.valueOf(umidade)+"   |");
        System.out.printf("\n|------------------------------|\n");
    }
    
}
