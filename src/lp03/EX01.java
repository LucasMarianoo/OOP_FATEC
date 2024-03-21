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
        
        try {
            JOptionPane.showMessageDialog(null, "Programa para calcular números pares");
            String range1 = JOptionPane.showInputDialog(null, "Digite o intervalo inicial: \n");
            String range2 = JOptionPane.showInputDialog(null, "Digite o intervalo final: \n");
            
            int num1, num2;
            
            num1 = Integer.parseInt(range1);
            num2 = Integer.parseInt(range2);
        
            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 0) {                
                    System.out.println(i);
                }
            }        
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, "Formato Inválido" , "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
