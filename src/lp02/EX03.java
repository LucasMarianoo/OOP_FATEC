/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp02;

import static lp02.Lucro.lucro;
import java.util.Scanner;

/**
 *
 * @author skynn
 */
public class EX03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float produto;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        produto = input.nextFloat();
        
        lucro(produto);
          
    }    
}
