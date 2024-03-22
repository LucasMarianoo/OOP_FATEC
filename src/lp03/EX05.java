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
public class EX05 {
    public static void main(String[] args) {
        
        Incrementar inc = new Incrementar(0,0);
        
        
        try {
            String inputLimite = JOptionPane.showInputDialog(null, "Digite o limite: ");
            String inputIncremento = JOptionPane.showInputDialog(null, "Digite o valor do incremento: ");

            int limite, incremento;

            limite = Integer.parseInt(inputLimite);
            incremento = Integer.parseInt(inputIncremento);

            inc.setLimite(limite);
            inc.setIncremento(incremento);

            inc.funcIncremento(inc.getLimite(), inc.getIncremento());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi inserido um número");
        }
        
        
        
    }
}
