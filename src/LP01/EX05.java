/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LP01;

import java.util.Scanner;

/**
 *
 * Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a 
 * fórmula:
 * VOLUME = 3.14159 * R2 * ALTURA
 */

public class EX05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final float pi = 3.14159f;
        float vol, altura, raio;
        
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a altura em cm: ");
        altura = input.nextFloat();
        
        System.out.println("Digite o raio em cm: ");     
        raio = input.nextFloat();
        
        raio = (float) Math.pow(raio, 2);
        
        vol = pi * raio * altura;
        
        System.out.println("O volume é de: " + vol + "cm³");
                
    }
    
}

