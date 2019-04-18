/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Scanner;

/**
 *
 * @author royerjmasache
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nota1, nota2, nota3;
        double promedio;
        // Ingreso de datos
        System.out.println("Ingrese el valor de la primera nota");
        nota1 = entrada.nextLine();
        System.out.println("Ingrese el valor de la segunda nota");
        nota2 = entrada.nextLine();
        System.out.println("Ingrese el valor de la tercera nota");
        nota3 = entrada.nextLine();
        // Transformación de datos
        double pnota = Double.parseDouble(nota1);
        double snota = Double.parseDouble(nota2);
        double tnota = Double.parseDouble(nota3);
        // Operación
        promedio = ((pnota+snota+tnota)/3);
        // Uso de expresión lógica ? expresión1 : expresión2
        String resultado = promedio > 14 ? "pasa el año" : "no pasa el año";
        System.out.printf("El alumno %s\n", resultado);
    }
}
