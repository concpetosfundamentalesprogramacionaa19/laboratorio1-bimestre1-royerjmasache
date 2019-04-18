/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author royerjmasache
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String varx, vary, varz;
        double m;
        // Ingreso de datos
        System.out.println("Ingrese el valor de la varible x");
        varx = entrada.nextLine();
        System.out.println("Ingrese el valor de la variable y");
        vary = entrada.nextLine();
        System.out.println("Ingrese el valor de lavariable z");
        varz = entrada.nextLine();
        // Transformación de datos usando Cast
        double x = Double.parseDouble(varx);
        double y = Double.parseDouble(vary);
        double z = Double.parseDouble(varz);
        // Operación
        m = (x+(y/z))/(x-(y/z));
        // Presentación de resultados
        System.out.printf("El valor de m, en base a las variables:\n"
                + "x = %.2f\n\t y = %.2f\n\t\t z = %.2f\n"
                + "da como resultado:\n\t\t"
                + "m = %.2f\n", x,y,z,m);    
    } 
}
