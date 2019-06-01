
package br.com.alfa.michael.strategy;


public class Assinatura {
       private NumeroTransmicoes plano;
	
	public Assinatura(NumeroTransmicoes plano)
	{
		this.plano = plano;
	}
	
	public String excuteTransmicoes(String Plano)
	{
		return this.plano.PreparadorAmbienteTranmicao(Plano);
	}
	
}
