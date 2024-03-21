/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp03;

/**
 *
 * @author skynn
 */
public class Media {
    
    private float p1, p2, p3, trab;
    
    public Media() {
        p1 = 0;
        p2 = 0;
        p3 = 0;
        trab = 0;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public float getP3() {
        return p3;
    }

    public void setP3(float p3) {
        this.p3 = p3;
    }

    public float getTrab() {
        return trab;
    }

    public void setTrab(float trab) {
        this.trab = trab;
    }
    
    public int calcMedia(float p1, float p2, float p3, float trab) {
        
        int status = 0;
        
        float media;
        
        media = (p1 + p2 + trab) / 3;
        
        if (media >= 6) {
            status = 1;
        } else {
            if (p1 < p2) {
                p1 = p3;
                media = (p1 + p2 + trab) / 3;
                if (media >= 6) {
                    status = 1;
                }
            } else if (p2 < p1) {
                p2 = p3;
                media = (p1 + p2 + trab) / 3;
                if (media >= 6) {
                    status = 1;
                } else {
                    status = 0;
                }
            }
        }        
        return status;
    }    
    
}
