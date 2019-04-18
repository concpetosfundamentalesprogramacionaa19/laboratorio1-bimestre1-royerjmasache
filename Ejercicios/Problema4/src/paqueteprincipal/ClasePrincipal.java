/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal;
import paquete1.*;
import paquete2.*;
import paquete3.*;
/**
 *
 * @author royerjmasache
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        //Uso de expresión lógica ? expresión1 : expresión2
        String resultado = MiClase1.edad >= 18 ? "y es mayor de edad" :
                "y es menor de edad";
        // Presentación de datos
        System.out.printf("Nombre:\n\t%s\nApellido:\n\t%s\nEdad:\n\t%d"
                + " %s\n", MiClase2.nombre, MiClase3.apellido, MiClase1.edad,
                resultado);
    }
}
