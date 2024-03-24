/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp04;

import javax.swing.JOptionPane;

/**
 *
 * Criar um programa que permita a entrada de um  número inteiro e retorne o 
 * seu dobro, através de um método.
 */

public class EX01 {
    
    public static void main(String[] args) {
        
        
        
        try {            
            String userNum = JOptionPane.showInputDialog(null, 
                    "Digite um número inteiro para verificar seu dobro");
        
            int num = Integer.parseInt(userNum);
        
            Dobro dobro = new Dobro(num);
        
            JOptionPane.showMessageDialog(null, "O dobro de " + num + " é "
                    + dobro.calcDobro(dobro.getNum()));
            
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, "Formato Inválido" , "ERRO", 
                    JOptionPane.ERROR_MESSAGE);
        }

    }
    
}
