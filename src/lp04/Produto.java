/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp04;

/**
 *
 * @author skynn
 */
public class Produto {
    
    private float n1;
    private float n2;

    public Produto(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }
    
    public float calcProd() {
        float prod;
        
        prod = n1 * n2;
        
        return prod;
    }    
    
}
