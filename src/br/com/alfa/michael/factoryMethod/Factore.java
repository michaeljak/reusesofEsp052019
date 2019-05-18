/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alfa.michael.factoryMethod;

/**
 *
 * @author Aluno
 */
public class Factore implements IFactory{

   

    @Override
    public ICarro create(int passageiros, String clima, String abastecimento) {
     
        
        
        if((passageiros <= 2 )||(abastecimento == "S")){
          return new Carro_Tesla();
      
      }
      
        if ((passageiros <= 5 )&& (clima.equals("SOL"))) {
            return new Carro_Escort();
           
            
        }
        
        if ((passageiros <= 5 ) && (clima.equals("CHUVA"))) {
           return new Carro_Opala();
        }
        if (passageiros > 5 && passageiros<=20 ) {
           return new Carro_Besta();
        }
        
        
        return null;
      
    }
    
}
