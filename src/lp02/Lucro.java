/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp02;


/**
 *
 * @author skynn
 */
public class Lucro {
    
    public static void lucro(float produto) {
        
        float lucro;
        
        if (produto < 20) {
            lucro = produto * 1.45f;
            
            System.out.println("Valor final 45% de lucro: " + lucro);
        } else {
            
            lucro = produto * 1.30f;
            
            System.out.println("Valor final 30% de lucro: " + lucro);
        }        
    }    
}
