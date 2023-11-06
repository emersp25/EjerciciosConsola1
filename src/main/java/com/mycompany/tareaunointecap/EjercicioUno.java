
package com.mycompany.tareaunointecap;

import java.util.Scanner;

/**
 *
 * @author Emerson
 */
public class EjercicioUno {
    public void dosNumeros() {
        Scanner sp = new Scanner (System.in);
        
        System.out.println("Ingrese un numero");
        int value1 = sp.nextInt();
        System.out.println("Ingrese otro numero");
        int value2 = sp.nextInt();
        
        System.out.println("Sus numeros son: "+ value1 +" Y "+value2);
    }  
}
