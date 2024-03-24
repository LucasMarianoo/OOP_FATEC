/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp04;

import javax.swing.JOptionPane;

/**
 *
 * Criar umprograma que verifique se um número é primo ou não, através de um 
 * método. Número primo é divisível somente por 1 e por ele mesmo.
 */

public class EX08 {
    public static void main(String[] args) {
        
        String n = JOptionPane.showInputDialog(null, "Digite um número inteiro: ");
        int num = Integer.parseInt(n);
        
        Primo primo = new Primo(num);
        
        primo.verificaPrimo();
    }
}
