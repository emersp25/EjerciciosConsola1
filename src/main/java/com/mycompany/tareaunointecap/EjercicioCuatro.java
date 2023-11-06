
package com.mycompany.tareaunointecap;

import java.util.Scanner;

/**
 *
 * @author Emerson
 */
public class EjercicioCuatro {
    public void convert() {
        double c, f;
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese grados C");
        c = sp.nextDouble();
        f = (32 + (9 * (c / 5)));
        System.out.println("Equivale a de grados farenheit:" + f);
    }
}
