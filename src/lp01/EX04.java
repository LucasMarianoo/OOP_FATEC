/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lp01;

import java.util.Scanner;

/**
 *
 * Faça um programa que leia uma temperatura em graus Centígrados e apresente-a 
 * convertida em graus Fahrenheit. A fórmula de conversão é:
 */

public class EX04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float celsius, fahrenheit;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Celsius: ");
        celsius = input.nextFloat();
        
        fahrenheit = (9f * celsius + 160f) / 5f;
        
        System.out.println(fahrenheit);
        
    }
    
}
