package practicaentornosgit;

import java.util.Scanner;
import java.math.*;
/**
 *
 * @author MEDION-JLLR
 * @author ALBERHANIBAL
 */
public class PracticaEntornosGit {

    public static void main(String[] args) {

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
        System.out.println(Math.PI);
        System.out.println("Logo es mejor lenguaje que Python, C#, Java y Ensamblador.");
    }

}
