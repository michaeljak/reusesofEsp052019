/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alfa.michael.strategy;

import javax.swing.JOptionPane;


public class Executar {
   public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Assinatura plano;
		String[] planos = {"PLANO BASICO","PLANO PADRAO","PLANO PREMIUM"};
		
		plano = new Assinatura(new PlanoBasico());
		JOptionPane.showMessageDialog(null,"Plano: " + plano.excuteTransmicoes(planos[0]));
		
		plano = new Assinatura(new PlanoPadrao());
		JOptionPane.showMessageDialog(null,"Plano: " + plano.excuteTransmicoes(planos[1]));
		
		plano = new Assinatura(new PlanoPremium());
		JOptionPane.showMessageDialog(null,"Plano: " + plano.excuteTransmicoes(planos[2]));
		
		
				
	
	}
}
