/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            double calificacion;
            String nombre;

            int i = 1;
            while (i <= 4) {
                System.out.println("Ingrese calificación: \n");
                calificacion = entrada.nextDouble();
                if (calificacion > 10) {
                    throw new InputMismatchException("El valor ingresado es mayor a 10");
                } else {
                    if (calificacion < 0) {
                        throw new InputMismatchException("El valor ingresado es menor a 0");
                    }
                }
                entrada.nextLine();
                System.out.println("Ingrese nombre: \n");
                nombre = entrada.nextLine();
                if ("Mario".equals(nombre) || "Luis".equals(nombre) || "Ana".equals(nombre) || "Carolina".equals(nombre)
                        || "Pedro".equals(nombre)) {
                    throw new InputMismatchException("El nombre ingresado no está permitido");
                }
                System.out.printf("Nombre: %s\n"
                        + "Calificación: %.1f\n",
                        nombre, calificacion);
                i = i + 1;
            }

            System.out.printf("%s\n", "Gracias por usar el sistema");
        } catch (InputMismatchException e) {
            System.out.printf("(InputMismatchException) Ocurrió una excepción %s\n", e);
        }
    }
}
