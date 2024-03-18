/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LP01;

import java.util.Scanner;

/**
 *
 * Faça um programa que leia dois valores e informe a média entre eles. 
 * (use float como tipo de dado).
 */

public class EX03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float valor1, valor2, resultado;
        
        Scanner input = new Scanner(System.in);        
        
        System.out.println("Digite o primeiro valor: ");
        valor1 = input.nextFloat();
        System.out.println("Digite o segundo valor: ");
        valor2 = input.nextFloat();
        
        resultado = (valor1 + valor2) / 2f;        
        
        System.out.print("A média entre os dois valores é: " + resultado);
    }
    
}
