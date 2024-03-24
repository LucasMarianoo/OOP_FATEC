/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp04;

import javax.swing.JOptionPane;

/**
 *
 * Criar um programa que retorne o fatorial de um número, usando um método 
 * que receba um valor e retorne o fatorial desse valor.
 * Fatorial de 5 = 5 x 4 x 3 x 2 x 1 = 120
 */

public class EX07 {
    
    public static void main(String[] args) {
        
        String n = JOptionPane.showInputDialog(null, "Digite o número: ");
        int num = Integer.parseInt(n);
    
        Fatorial fat = new Fatorial(num);
        
        JOptionPane.showMessageDialog(null, "Fatorial de " + 
                num + " é: " + fat.calcFatorial(num) );
    
    }   
}
