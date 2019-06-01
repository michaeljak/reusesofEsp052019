/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alfa.michael.strategy;

/**
 *
 * @author Aluno
 */
public class PlanoBasico implements NumeroTransmicoes{

    @Override
    public double PreparadorAmbienteTranmicao(Assinatura Preco) {
        if (Preco.getPRECO()== 29) {
            return Preco.getPRECO();
        }
        return 0;
            
        }
    
    
}
