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
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try{
        double sueldo;
        String nombre;
        double[] arregloSueldos;
        int numeroDatosArreglo;
        int i = 1;
        int j;
        
        
        while(i<=4){
            System.out.printf("Datos para usuario %d\n", i);
            
            System.out.println("Cuantos sueldos quiere agregar al arreglo");
            numeroDatosArreglo = entrada.nextInt();
            if(numeroDatosArreglo > 5 || numeroDatosArreglo < 0){
            throw new Exception("El valor ingresado se encuentra fuera de los límites (0-5)");
            }
            arregloSueldos = new double[numeroDatosArreglo];
            j = 0;
            while(j < arregloSueldos.length){
                System.out.printf("agregue sueldo %d para usuario %d\n",
                        j, i);
                sueldo = entrada.nextDouble();
                if(sueldo >10 || sueldo < 0){
                throw new InputMismatchException("El valor ingresado se encuentra fuera de los límites (0-10)");
                }
                arregloSueldos[j] = sueldo;
                j = j + 1;
            }
            
            for (int k = 0; k < arregloSueldos.length; k++) {
                System.out.printf("Sueldo ingresado: %.3f\n", arregloSueldos[k]);
            }
            
            
            i = i + 1;
        }

        System.out.printf("%s\n", "Gracias por usar el sistema");
        }catch (InputMismatchException e) {
            System.out.printf("(InputMismatchException) Ocurrió una excepción %s\n", e);
        }catch (Exception e) {
            System.out.printf("Ocurrió una excepción %s\n", e);
        }
    }
}
