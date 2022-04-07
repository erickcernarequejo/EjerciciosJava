package com.mycompany.ejercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class SimpleChatBot {
    
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Hola, qué nombre deseas colocarme ?");
        String nombre = scanner.nextLine();
        saludar(nombre, LocalDate.now().getYear());
        recordarNombre();
        adivinarEdad();
        contar();
        prueba();
        finalizar();
    }

    static void saludar(String nombreAsistente, int año){
        System.out.println("\nHola mi nombre es " + nombreAsistente);
        System.out.println("Fui creado en el año " + año);
        System.out.println("\nPor favor, dime cómo te llamas");
    }

    static void recordarNombre() {
        String nombreRecordar = scanner.nextLine();
        System.out.println("\nQue gran nombre tienes, " + nombreRecordar + ".");
    }

    static void adivinarEdad(){
        System.out.println("Déjame adivinar tu edad");
        System.out.println("Cuál es el resto de dividir tu edad por 3");
        int resto3 = scanner.nextInt();
        System.out.println("Cuál es el resto de dividir tu edad por 5");
        int resto5 = scanner.nextInt();
        System.out.println("Cuál es el resto de dividir tu edad por 7");
        int resto7 = scanner.nextInt();
        int edad = (resto3 * 70 + resto5 * 21 + resto7 * 15) % 105;
        System.out.println("Tu edad es " + edad + "; es un buen momento para empezar a programar");
    }

    static void contar(){
        System.out.println("\nAhora te demostraré que puedo contar, dime un número");
        int numero = scanner.nextInt();
        for (int i = 0; i <= numero; i++) {
            System.out.println(i);
        }
    }

    static void prueba(){
        System.out.println("\nAhora te realizaré una pregunta");
        System.out.println("Cuál es el motivo por el que usamos métodos?");
        int opcion;
        do {
            System.out.println("\n1. Para repetir una declaración varias veces."
                    + "\n2. Para descomponer un programa en varias subrutinas pequeñas."
                    + "\n3. Para determinar el tiempo de ejecución de un programa."
                    + "\n4. Para interrumpir la ejecución de un programa.");

            System.out.println("Ingresa la opción correcta");
            opcion = scanner.nextInt();

        } while (!verificarRespuesta(opcion));
    }

    static boolean verificarRespuesta(int opcion){
        if(opcion == 2) return true;
        System.out.println("No es la correcta, por favor intenta nuevamente");
        return false;
    }

    static void finalizar(){
        System.out.println("Felicidades, que tengas un excelente día");
    }
}
