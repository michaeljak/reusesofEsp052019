/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alfa.michael.observer;

/**
 *
 * @author Aluno
 */
public interface Observer {
    public void atualiza(double temperatura, double pressao, double umidade);
}
