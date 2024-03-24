/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp04;

import javax.swing.JOptionPane;

/**
 *
 * Criar  um  programa  que  mostre  qualo  maior  valor  entre  dois  
 * números,  utilizando  um método do tipo void (que não retorna valores). 
 */

public class EX05 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Verifica o maior entre dois valores");
        
        String input1 = JOptionPane.showInputDialog(null, "Digite o primeiro número: ");
        String input2 = JOptionPane.showInputDialog(null, "Digite o segundo número: ");
        
        float n1 = Float.parseFloat(input1);
        float n2 = Float.parseFloat(input2);
        
        Maior m = new Maior(n1, n2);
        
        m.calcMaior();
    }
}
