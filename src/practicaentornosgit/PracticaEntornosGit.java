/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaentornosgit;

import java.util.Scanner;

/**
 *
 * @author MEDION-JLLR
 */
public class PracticaEntornosGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("¡Hola mundo!");
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce dos enteros:");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.format("%d + %d = %d\n", a, b, a + b);
        System.out.format("%d - %d = %d\n", a, b, a - b);
        System.out.format("%d * %d = %d\n", a, b, a * b);
        System.out.format("%d / %d = %.2f\n", a, b, (double) a / b);
        // hola soy Alberto
        //¡Hola Alberto!
        System.out.format(".data\n texto: .asciiz \"Hola Mundo!\"\n");
        System.out.println("La verdad es que Logo es un buen lenguaje y"
                + " extremadamente útil en mi futuro laboral.");
        
    }

}
