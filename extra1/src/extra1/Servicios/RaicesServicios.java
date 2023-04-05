/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1.Servicios;

import entidades.Raices;
import java.util.Scanner;

/**
 *
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
        
    public double getDiscriminate(Raices r1){
        return Math.pow(r1.getB(), 2)-4*r1.getA()*r1.getC();
    }
    
    public boolean tieneRaices (Raices r1){
        double raices = getDiscriminate(r1);
        if (raices >= 0){
            return true;            
        } else {
            return false;
        }
    }
}
