/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alfa.michael.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author João
 */
public class EstacaoMetereologica {
    private double temperatura;
    private double umidade;
    private double pressaoBarometrica;
    
    private List<Observer> observadores = new ArrayList();
    
    public void adicionarObservador(Observer observador){
        observadores.add(observador);
    }
    
    public void removerObservador(Observer observador){
        observadores.remove(observador);
    }
    
    public void atualizarObservadores(){
        for (Observer observador : observadores){
            observador.atualiza(temperatura,umidade,pressaoBarometrica);
        }
    }
    
    public void atualizar(){
        Random random = new Random();
        this.temperatura = random.nextDouble()*50;
        this.umidade = random.nextDouble()*100;
        this.pressaoBarometrica = random.nextDouble()*20;
        atualizarObservadores();        
    }
}
