/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp04;

import javax.swing.JOptionPane;

/**
 *
 * Criar um programa que receba 2 valores e calcule o produto através de um 
 * método que  retorna valores.
 */
public class EX03 {
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Calcula o produto entre dois número");
        String num1 = JOptionPane.showInputDialog(null, 
                "Digite o primeiro número: ");
        String num2 = JOptionPane.showInputDialog(null, 
                "Digite o segundo número: ");
        
        float n1 = Float.parseFloat(num1);
        float n2 = Float.parseFloat(num2);
        
        Produto prod = new Produto(n1, n2);
        
        JOptionPane.showMessageDialog(null, prod.calcProd());
        
    }
    
}