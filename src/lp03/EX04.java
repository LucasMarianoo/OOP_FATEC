/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp03;

import javax.swing.JOptionPane;

/**
 *
 * @author skynn
 */
public class EX04 {
    public static void main(String[] args) {              
        
        try {
            Media media = new Media();
        
            JOptionPane.showMessageDialog(null, "Cálculo de média FATEC");
            String inputP1 = JOptionPane.showInputDialog(null, "Digite a nota P1");
            String inputP2 = JOptionPane.showInputDialog(null, "Digite a nota P2");
            String inputP3 = JOptionPane.showInputDialog(null, "Digite a nota P3");
            String inputTrab = JOptionPane.showInputDialog(null, "Digite a nota de trabalho");

            float p1, p2, p3, trab;

            p1 = Float.parseFloat(inputP1);
            p2 = Float.parseFloat(inputP2);
            p3 = Float.parseFloat(inputP3);
            trab = Float.parseFloat(inputTrab);

            media.setP1(p1);
            media.setP2(p2);
            media.setP3(p3);
            media.setTrab(trab);


            if (media.calcMedia(media.getP1(), media.getP2(), media.getP3(), media.getTrab()) == 1) {
                JOptionPane.showMessageDialog(null, "Aprovado");
            } else {
                JOptionPane.showMessageDialog(null, "Reprovado");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Você digitou um formato inválido");
        }
        
        
        
    }
    
}
