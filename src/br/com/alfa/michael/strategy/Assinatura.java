/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alfa.michael.strategy;

import static br.com.alfa.michael.strategy.Assinatura.PLANO_PADRAO;

/**
 *
 * @author Aluno
 */
public class Assinatura {
        public static final int PLANO_BASICO = 1;
	public static final int PLANO_PADRAO = 2;
	public static final int PLANO_PREMIUM = 3;
        protected double PRECO;
        protected int plano;
        protected NumeroTransmicoes NTrasmicoes;

    
        
        
        public void Assinatura () {
		this.PRECO = PRECO;
		switch (plano) {
		case PLANO_BASICO:
			NTrasmicoes = new PlanoBasico();
			plano = PLANO_BASICO;
			break;
		case PLANO_PADRAO:
			NTrasmicoes = new PlanoPadrao();
			plano = PLANO_PADRAO;
			break;
		case PLANO_PREMIUM:
			NTrasmicoes = new PlanoPremium();
			plano = PLANO_PREMIUM;
			break;
		default:
			throw new RuntimeException("Plano nao encontrado :/");
		}
	}
       
        public double AmbienteTranmicao() {
		return NTrasmicoes.PreparadorAmbienteTranmicao(this);
	}

	public double getPRECO() {
		return PRECO;
	}
}
