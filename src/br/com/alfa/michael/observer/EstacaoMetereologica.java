
package br.com.alfa.michael.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


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
