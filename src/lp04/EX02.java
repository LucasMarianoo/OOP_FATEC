/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp04;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * Criar  um  programa  que  receba  4  notas  e  calcule  a  média  aritmética,
 * através  de  um método.
 */

public class EX02 {
    
    public static void main(String[] args) {
        
        try {
            
            String[] nota = new String[4];
            for (int i = 0; i < nota.length; i++) {
                nota[i] = JOptionPane.showInputDialog(null, "Digite a " + (i+1) + "ª nota: ");   
            }
            
            int[] notas = Arrays.stream(nota).mapToInt(Integer::parseInt).toArray();
            
            Media media = new Media(notas[0], notas[1], notas[2], notas[3]);
            
            media.calcMedia();
            
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato digitado inválido");
        }
    }
    
}
