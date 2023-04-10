/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *  El discriminante de una ecuación cuadrática permite saber la cantidad de raíces que la ecuación tiene.
 * D(ax2 +bx -c = 0) = b2 -4 * a * c;
 * Si D > 0 => tiene dos raíces (cruza dos veces el eje x; y=0)
 * Si D = 0 => tiene una sola raíz (toca una sola vez el eje x; y=0)
 * Si D < 0 => no tiene raíz (no toca al eje x; no existe un y=0)
 * 
 * @author leandro
 */
public class Raices {
    private double a;
    private double b;
    private double c;

    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
    
}
