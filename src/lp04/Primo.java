/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp04;

import javax.swing.JOptionPane;

/**
 *
 * @author skynn
 */
public class Primo {
    private int num;

    public Primo(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public void verificaPrimo() {
        
        int countPrimo = 0;
        
        if (num == 0) {
            JOptionPane.showMessageDialog(null, num + " não é divisível");
        } else {
            for (int i = 1; i <= num; i++ ) {                              

                if (num % i == 0) {
                    countPrimo++;
                }
            }
        
            if (countPrimo == 2) {
                JOptionPane.showMessageDialog(null, num + " é primo");
            } else {
                JOptionPane.showMessageDialog(null, num + " não é primo");
            } 
        }      
        
    }
}
