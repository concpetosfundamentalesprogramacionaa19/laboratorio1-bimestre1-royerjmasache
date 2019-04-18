/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author royerjmasache
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sueldot, sueldo, numhoras, costo, descuento;
        // Ingreso de datos
        System.out.println("Ingrese el número de horas");
        numhoras = entrada.nextDouble();
        System.out.println("Ingrese el costo por hora oficial");
        costo = entrada.nextDouble();
        // Operación
        sueldot = numhoras * costo;
        descuento = sueldot * 0.1;
        sueldo =  sueldot - descuento;
        // Presentación de datos
        System.out.printf("El descuento por el Seguro Social es de:%.2f\n"
                + "El sueldo mensual del trabajador es de: %.2f\n", descuento,
                sueldo);
    }
}
