/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp04;

import javax.swing.JOptionPane;

/**
 *
 * Criar  um  programa  que  receba  um  grau  e  o  converta  para  radianos  
 * através  de  um método.
 * Fórmula:  radiano = grau * pi / 180
 */

public class EX04 {
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Converte graus em radianos");
        
        String userInput = JOptionPane.showInputDialog(null, 
                "Digite o grau a converter: ");
        
        float grau = Float.parseFloat(userInput);
        
        Radianos rad = new Radianos(grau);
        
        JOptionPane.showMessageDialog(null, 
                userInput + "º convertido em radianos é: " + rad.calcRadiano());
        
    }
}
