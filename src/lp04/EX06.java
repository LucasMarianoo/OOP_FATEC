/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp04;

import javax.swing.JOptionPane;

/**
 *
 * Criar um programa que receba um número que corresponda a um mês do 
 * 1º trimestre e escreva  o  mês  correspondente;  caso  o  usuário  digite  
 * o  número  fora  do  intervalo  deverá aparecer inválido, 
 * mas utilizando um método do tipo void.
 */

public class EX06 {
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, 
                "Verifica um mês do primeiro trimestre");
        String m = JOptionPane.showInputDialog(null, "Digite o número do mês: ");
        
        int mes = Integer.parseInt(m);
        
        Trimestre tri = new Trimestre(mes);
        
        tri.checkTrimestre();
    }
    
}
