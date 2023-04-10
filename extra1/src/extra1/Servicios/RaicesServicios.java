/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1.Servicios;

import entidades.Raices;
import java.util.Scanner;

/**
 * El discriminante de una ecuación cuadrática permite saber la cantidad de raíces que la ecuación tiene.
 * Discriminante(ax2 +bx -c = 0) es -> b2 -4 * a * c;
 * Si D > 0 => tiene dos raíces (cruza dos veces el eje x; y=0)
 * Si D = 0 => tiene una sola raíz (toca una sola vez el eje x; y=0)
 * Si D < 0 => no tiene raíz (no toca al eje x; no existe un y=0)
 * @author Wendy
 */
public class RaicesServicios {
    private Scanner leer = new Scanner(System.in);
    
    public Raices cargaNumeros(){
                
        System.out.println("Ingrese el valor de a");
        double a = leer.nextDouble();
        System.out.println("Ingrese el valor de b");
        double b = leer.nextDouble();
        System.out.println("Ingrese el valor de c");
        double c = leer.nextDouble();
        
        return new Raices(a, b, c);
        
    }
        
    public double getDiscriminante(Raices r1){
        return Math.pow(r1.getB(), 2)-4*r1.getA()*r1.getC();
    }
    
    public boolean tieneRaices (Raices r1){
        double raices = getDiscriminante(r1);
        if (raices > 0){
            return true;            
        } else {
            return false;
        }
    }
    
    public boolean tieneRaiz (Raices r1){
        double raices = getDiscriminante(r1);
        if (raices == 0){
            return true;            
        } else {
            return false;
        }
    }
    
    public String obtenerRaices(Raices r1){
        boolean tRaices  = tieneRaices(r1);
        double Raiz1=0, Raiz2=0;
        if (tRaices = true){
            Raiz1 = (((-1) * r1.getB()) + (Math.sqrt(Math.pow(r1.getB(),2) - (4 * r1.getA() * r1.getC())))) / (2 * r1.getA());
            Raiz2 = (((-1) * r1.getB()) - (Math.sqrt(Math.pow(r1.getB(),2) - (4 * r1.getA() * r1.getC())))) / (2 * r1.getA());
        }
        return ("Raiz1 = " + String.valueOf(Raiz1) + "; Raiz2 = " + String.valueOf(Raiz2));
    }
    
    public String obtenerRaiz(Raices r1){
        boolean tRaiz  = tieneRaiz(r1);
        double Raiz = 0;
        if (tRaiz = true){
            Raiz = (((-1) * r1.getB()) + (Math.sqrt(Math.pow(r1.getB(),2) - (4 * r1.getA() * r1.getC())))) / (2 * r1.getA());
        }
        return ("Raiz = " + String.valueOf(Raiz));
    }
    
    public void calcular(Raices r1){
        double discriminante = getDiscriminante(r1);
        if (discriminante == 0){
            System.out.println("La solución a la ecuación y = " + r1.getA() + "x2 + " + r1.getB() +"x + " + r1.getC() + " \ncuando y = 0; es:");
            System.out.println(obtenerRaiz(r1));
        } else if (discriminante > 0) {
            System.out.println("Las soluciones a la ecuación y = " + r1.getA() + "x2 + " + r1.getB() +"x + " + r1.getC() + " \ncuando y = 0; son:");
            System.out.println(obtenerRaices(r1));
        } else if (discriminante < 0) {
            System.out.println("La ecuación y = " + r1.getA() + "x2 + " + r1.getB() +"x + " + r1.getC() + " \ncuando y = 0 no existe.");
        }
        
    }


    
}
