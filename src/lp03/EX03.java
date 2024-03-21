/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp03;

import java.util.Scanner;

/**
 *
 * Um  programa  capaz  de  imprimir  todos  os  números  primos  em  um  
 * intervalo  de números informado pelo usuário;
 */

public class EX03 {
    
    public static void main(String[] args) {
        
        int range1, range2;
        
        Scanner input = new Scanner(System.in);
        
        Primos primo = new Primos();
        
        System.out.println("Digite o primeiro intervalo: \n");
        range1 = input.nextInt();
        System.out.println("Digite o segundo intervalo: \n");
        range2 = input.nextInt();
        
        
        primo.setRange(range1, range2);
        
        primo.checkPrimo();
    }
    
}
