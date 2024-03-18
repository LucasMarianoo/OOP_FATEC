/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp02;

import java.util.Scanner;

/**
 *
 * @author skynn
 */
public class Plano {
    
    public static void calculoPlano() {
        
        int idade;
        float plano1 = 30f;
        float plano2 = 60f;
        float plano3 = 120f;
        float plano4 = 150f;
        float plano5 = 250f;
        float plano6 = 400f;
        
        System.out.println("Digite a sua idade: ");
        
        Scanner input = new Scanner(System.in);
        
        idade = input.nextInt();
        
        if (idade <= 10) {
            System.out.println("O valor do seu plano é: R$" + plano1);
            
        } else if (idade > 10 && idade <= 29) {
            System.out.println("O valor do seu plano é: R$" + plano2);
            
        } else if (idade > 29 && idade <= 45) {
            System.out.println("O valor do seu plano é: R$" + plano3);
            
        } else if (idade > 45 && idade <= 59) {
            System.out.println("O valor do seu plano é: R$" + plano4);
            
        } else if (idade > 59 && idade <= 65) {
            System.out.println("O valor do seu plano é: R$" + plano5);
            
        } else {
            System.out.println("O valor do seu plano é: R$" + plano6);
            
        }
        
    }
    
}
