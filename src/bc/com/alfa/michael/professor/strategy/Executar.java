/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bc.com.alfa.michael.professor.strategy;

/**
 *
 * @author Aluno
 */
public class Executar {
    public static void main(String[] args) {
        
        
        //Plano basico
        IPreco preco = new PrecoBasico();
        IContentTransformer qualidade = new Simples();
        InumeroTransmicoes numeroLimete = new TranmicaoUnica();
        
        
        Assinatura planoBasico = new Assinatura(preco, qualidade, numeroLimete);
        
        System.out.println(planoBasico.getPreco());
        
        planoBasico.DisponibilizaConteudo();
        planoBasico.PermiteNumeroTransmicoes();
                
                }
}
