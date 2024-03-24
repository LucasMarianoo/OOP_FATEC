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
public class Trimestre {
    private int mes;

    public Trimestre(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public void checkTrimestre() {
        
        switch (mes) {
            case 1:
               JOptionPane.showMessageDialog(null, "Janeiro");
               break;
            case 2: 
               JOptionPane.showMessageDialog(null, "Fevereiro");
               break;
            case 3:
               JOptionPane.showMessageDialog(null, "Março");
               break;
            default:
               JOptionPane.showMessageDialog(null, "Mês Inválido");
               break;
        }
        
    }
    
}
