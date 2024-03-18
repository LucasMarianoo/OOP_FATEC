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

public class Eleitor {
    
    public static void classeEleitor() {
        
        int idade;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a idade: ");
        idade = input.nextInt();
        
        if (idade < 16) {
            
            System.out.println("Não eleitor");
            
        } else if (idade >= 18 && idade <= 65) {
            
            System.out.println("Eleitor obrigatório");
            
        } else if (idade >= 16 && idade < 18 || idade > 65) {
            
            System.out.println("Eleitor facultativo");            
        }        
    }
}
