
package com.mycompany.tareaunointecap;

import java.util.Scanner;

/**
 *
 * @author Emerson
 */
public class EjerciciosTres {
    public void numero (){
    Scanner sp = new Scanner (System.in);
    int uno, dos;
    
        System.out.println("Ingrese un numero");
        int value = sp.nextInt();
        uno = value*2;
        dos = value*3;
        System.out.println("El doble del numero es: "+uno+" y el triple del numero es: "+ dos);
    }
}
