/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasjunit;

import java.util.Scanner;

/**
 *
 * @author Emilio
 */
public class PruebasJunit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        metodos trabajo = new metodos();
        // TODO code application logic here
        Scanner introducir = new Scanner(System.in);
        int x, y, z, op, sum, resta = 0, multi, div;
        System.out.println("Bienvenido a la Calculadora");
        System.out.println("Introduce 1 elemento: ");
        x = introducir.nextInt();
        System.out.println("Introduce 2 elemento: ");
        y = introducir.nextInt();
        System.out.println("Introduce 3  elemento: ");
        z = introducir.nextInt();

        System.out.println("Introduce la opcion");
        op = introducir.nextInt();
        switch (op) {

            case 1:
                sum = trabajo.suma(x, y, z);
                break;
            case 2:
                resta = trabajo.resta(x, y, z);
                break;
            case 3:
                multi = trabajo.multiplicacion(x, y, z);
                System.out.println("maximo es: " + multi);
                break;
            case 4:
                div = trabajo.division(x, y, z);
                System.out.println("minimo es : " + resta);
                break;

        }
    }
}
