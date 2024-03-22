/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp03;

/**
 *
 * @author skynn
 */
public class Incrementar {
    
    private int limite;
    private int incremento;

    public Incrementar(int limite, int incremento) {
        this.limite = limite;
        this.incremento = incremento;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }
    
    public void funcIncremento(int limite, int incremento) {        
            
        for (int i = 0; i <= limite; i += incremento) {
            System.out.println(i);
        }
    }       
}
