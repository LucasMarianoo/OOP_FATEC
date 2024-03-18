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
public class EX01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);

        int num;
        float resto;
        
        System.out.println("Digite um número para verificar se é "
                + "múltiplo de 3: \n");
        num = input.nextInt();
        
        if ((resto = num % 3) == 0) {
            
            System.out.println(num + " é múltiplo de 3");
        } else {
            
            System.out.println(num + " não é múltiplo de 3");
        }       
        
    }
    
}
