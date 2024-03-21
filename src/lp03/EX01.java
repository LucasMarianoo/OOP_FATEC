/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp03;

import javax.swing.JOptionPane;

/**
 *
 * Um  programa  capaz  de  imprimir  todos  os  números  pares  em  um  
 * intervalo de números informador pelo usuário;
 */

public class EX01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Programa para calcular números pares");
        String userNum = JOptionPane.showInputDialog(null, "Digite um número");
        
        int num;
        
        try {
            num = Integer.parseInt(userNum);
        
        
            for (int i = 0; i <= num; i++) {
                if (i % 2 == 0) {                
                    System.out.println(i);
                }
            }        
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, "Formato Inválido" , "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
