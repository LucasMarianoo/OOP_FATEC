/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LP01;

import java.util.Scanner;

/**
 *
 * @author skynn
 */
public class EX02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float sal, salMin, qtdeSal;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor do salário mínimo atual: ");
        salMin = input.nextFloat();
        
        System.out.println("Digite o valor do seu salário: ");
        sal = input.nextFloat();
        
        qtdeSal = sal / salMin;
        
        System.out.println("Você recebe o total de: " + qtdeSal + " salario(s)");
    }
    
}
