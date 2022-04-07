package com.mycompany.ejercicios;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar primer número");
        double primeroNumero = scanner.nextDouble();
        System.out.println("Ingresar operador");
        String operador = scanner.next();
        System.out.println("Ingresar segundo número");
        double segundoNumero = scanner.nextDouble();

        switch (operador) {
            case "+":
                double suma = primeroNumero + segundoNumero;
                System.out.println(suma);
                break;
            case "-":
                double resta = primeroNumero - segundoNumero;
                System.out.println(resta);
                break;
            case "*":
                double multiplicacion = primeroNumero * segundoNumero;
                System.out.println(multiplicacion);
                break;
            case "/":
                if(segundoNumero == 0){
                    System.out.println("División por 0");
                }
                else {
                    double division = primeroNumero / segundoNumero;
                    System.out.println("El resultado es : " + division);
                }
                break;
            default:
                System.out.println("Operador no válido");
                break;
        }
    }

}
