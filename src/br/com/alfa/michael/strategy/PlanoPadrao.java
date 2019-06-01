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
public class PlanoPadrao implements NumeroTransmicoes{

    @Override
    public String PreparadorAmbienteTranmicao(String Plano) {
     return Plano;
    }

}
