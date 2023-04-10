/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;

import entidades.Raices;
import extra1.Servicios.RaicesServicios;

/**
 * El discriminante de una ecuación cuadrática permite saber la cantidad de raíces que la ecuación tiene.
 * D(ax2 +bx -c = 0) = b2 -4 * a * c;
 * Si D > 0 => tiene dos raíces (cruza dos veces el eje x; y=0)
 * Si D = 0 => tiene una sola raíz (toca una sola vez el eje x; y=0)
 * Si D < 0 => no tiene raíz (no toca al eje x; no existe un y=0)
 * @author leandro
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesServicios rs = new RaicesServicios();
        Raices r1 = rs.cargaNumeros();
        rs.calcular(r1);
        
    }
    
}
