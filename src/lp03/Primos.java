/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp03;

/**
 *
 * @author skynn
 */
public class Primos {
    
    private int range1, range2, primo;    
       
    public Primos() {
        range1 = 0;
        range2 = 0;
        
    }
    
    public void setRange(int range1, int range2) {
        this.range1 = range1;
        this.range2 = range2;
    }    
    
    public void checkPrimo() {
        for (int i = range1; i <= range2; i++) {
            
            if (i == 1 || i == 0)
                continue;
            
            primo = 1;
            
            for (int j = 2; j <= i / 2; j++) {
                if (j % i == 0) {
                    primo = 0;
                    break;
                }
            }
            
            if (primo == 1)
                System.out.println(i);

            
        }
    } 
}
