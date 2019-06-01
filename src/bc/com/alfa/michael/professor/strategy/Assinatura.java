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
public class Assinatura {
    private IPreco preco;
    private IContentTransformer qualidade;
    private InumeroTransmicoes numeroLimite;
    
    Assinatura (IPreco preco, IContentTransformer qualidade,
    InumeroTransmicoes numeroLimite
            ){
        this.preco = preco;
        this.numeroLimite = numeroLimite;
        this.qualidade = qualidade;
    }
    
   public double getPreco(){
       return preco.getPreco();
       
   }
   public void DisponibilizaConteudo(){
       qualidade.ConverteQualidade();
   } 
   
   public void PermiteNumeroTransmicoes()
   {
    
       System.out.println(numeroLimite.AmbienteTransmicaoSimultanea());
   }
           }
