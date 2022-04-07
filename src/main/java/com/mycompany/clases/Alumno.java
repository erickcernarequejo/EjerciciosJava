package com.mycompany.clases;

import java.util.Scanner;

public class Alumno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        String cadena = "", cadena1 = "", cadena2="1";
        for (int i = 1; i <= numero; i++) {
            System.out.printf( "%-15s %n", i);
        }

        for (int j = 2; j <= numero; j++) {
            System.out.printf( "%15s %n", j);
        }

        for (int k = 3; k <= numero; k++) {
            cadena2 += k;
        }

        
    }
}
