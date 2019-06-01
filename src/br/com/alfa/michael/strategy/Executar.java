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
public class Executar {
    public static void main(String[] args) {
		Assinatura basico = new Assinatura(Assinatura.PLANO_BASICO,29);
                
		System.out.println(basico.AmbienteTranmicao());
		
		Assinatura padrao = new Assinatura(Assinatura.PLANO_PADRAO,
				1700);
		System.out.println(padrao.AmbienteTranmicao());
	}
}
