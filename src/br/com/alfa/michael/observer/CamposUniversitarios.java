/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alfa.michael.observer;

/**
 *
 * @author Aluno
 */
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
