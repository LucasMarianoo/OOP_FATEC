/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp04;

/**
 *
 * @author skynn
 */
public class Fatorial {
    private int num;

    public Fatorial(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public int calcFatorial(int n) {
        
        int f = n;
        while (n > 1) {
            f = f *(n-1);
            n--;
        }
        return f;
    }
}
