
package com.mycompany.tareaunointecap;

import java.util.Scanner;

/**
 *
 * @author Emerson
 */
public class EjercicioQuinto {
    public void radioCircunferencia(){
        double c, l, a;
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        c = sp.nextDouble();
        l = (2 * 3.1416 * c);
        a = (3.1416 * (c * c));
        System.out.println("La longitud es: " + l);
        System.out.println("El area es: " + a);
    } 
}
