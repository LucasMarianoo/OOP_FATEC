/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp03;

import javax.swing.JOptionPane;

/**
 *
 * Um  programa  que  imprima  até  o  “n”  termo  a  seqüência  de  Fibonacci. 
 * Série: 1, 1, 2, 3, 5, 8, 13, 21...
 * Por exemplo, imprimir até o 6º termo:  1, 1, 2, 3, 5, 8
 */

public class EX02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int i = 0;      
        int num1 = 1, num2 = 0;
        int soma = 0;
        
        try {
            JOptionPane.showMessageDialog(null, 
                    "Imprime a sequência de Fibonacci");
            String input = JOptionPane.showInputDialog(null, 
                    "Digite um número inteiro: ");
            int usuNum = Integer.parseInt(input);
            
            while (soma < usuNum) {
            soma = num1 + num2;
            num1 = num2;
            num2 = soma;
            i++;
            System.out.println(soma);
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                    "Você não digitou um formáto válido", 
                    "ERRO", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    
}
