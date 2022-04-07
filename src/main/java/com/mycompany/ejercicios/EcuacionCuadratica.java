package com.mycompany.ejercicios;

import java.util.Scanner;

public class EcuacionCuadratica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar el valor de a: ");
        double a = scanner.nextDouble();

        System.out.println("Ingresar el valor de b: ");
        double b = scanner.nextDouble();

        System.out.println("Ingresar el valor de c: ");
        double c = scanner.nextDouble();

        double discriminante = calcularDiscriminante(a, b, c);

        if (discriminante < 0) {
            System.out.println("No tiene raíces reales");
        } else {
            calcularRaices(a, b, discriminante);
        }

        scanner.close();
    }

    private static double calcularDiscriminante(double a, double b, double c){
        return Math.pow(b, 2) - 4 * a * c;
    }

    private static void calcularRaices(double a, double b, double discriminante) {
        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

        if (x1 == x2) {
            System.out.println("x1 y x2 = " + x1);
        } else {
            System.out.println("El valor de x1 = " + x1 + " y el valor de x2 = " + x2);
        }
    }
    
}
