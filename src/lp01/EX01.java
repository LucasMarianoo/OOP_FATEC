/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lp01;

import java.util.Scanner;

/**
 *
 * Em época de pouco dinheiro, os comerciantes estão procurando aumentar suas 
 * vendas oferecendo desconto. Faça um programa que possa entrar com o nome de 
 * um produto e seu valor unitário e calcular e exibir um novo valor com um 
 * desconto de 9%.
 * 
 */

public class EX01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String produto;
        float valor, desconto;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto: ");
        produto = input.next();
        
        System.out.println("Digite o valor do produto: ");
        valor = input.nextFloat();
        
        desconto = valor * 1.09f;
        
        System.out.println("Valor original do produto " 
                + produto + ": " 
                + valor 
                + "\nValor com desconto: " + desconto);
        
    }
    
}
