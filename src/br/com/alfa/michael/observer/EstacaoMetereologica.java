/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alfa.michael.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

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
        this.temperatura = ThreadLocalRandom.current().nextInt(10,25);
        this.umidade = ThreadLocalRandom.current().nextInt(10,25);
        this.pressaoBarometrica = ThreadLocalRandom.current().nextInt(10,25);
        atualizarObservadores();        
    }
}
