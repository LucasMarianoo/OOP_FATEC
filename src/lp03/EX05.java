/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp03;

import javax.swing.JOptionPane;

/**
 *
 * Criar um programa que leia umnúmero que será o limite superior de um 
 * intervalo e o incremento. Exibir todos os números naturais no intervalo 
 * de 0 até esse número.  
 * Suponha que os dois números lidos são maiores que zero. 
 * Exemplo: Limite superior: 20Incremento: 5Saída: 0  5  10  1520
 */

public class EX05 {
    public static void main(String[] args) {
        
        Incrementar inc = new Incrementar(0,0);
        
        
        try {
            String inputLimite = JOptionPane.showInputDialog(null, "Digite o limite: ");
            String inputIncremento = JOptionPane.showInputDialog(null, "Digite o valor do incremento: ");

            int limite, incremento;

            limite = Integer.parseInt(inputLimite);
            incremento = Integer.parseInt(inputIncremento);

            inc.setLimite(limite);
            inc.setIncremento(incremento);

            inc.funcIncremento(inc.getLimite(), inc.getIncremento());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi inserido um número");
        }
        
        
        
    }
}
