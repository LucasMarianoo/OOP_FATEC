/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp04;

/**
 *
 * @author skynn
 */
public class Radianos {
    
    private float graus;

    public Radianos(float graus) {
        this.graus = graus;
    }

    public float getGraus() {
        return graus;
    }

    public void setGraus(float graus) {
        this.graus = graus;
    }
    
    public float calcRadiano() {        
        float rad;
        rad = (graus * 3.14159f) / 180;
        
        return rad;
    }
    
}
