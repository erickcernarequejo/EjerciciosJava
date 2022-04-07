package com.mycompany.vectores;

import java.util.Scanner;

public class InvertirMatrizNM {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar cantidad de filas ");
        int fila = sc.nextInt();

        System.out.println("Ingresar cantidad de columnas");
        int columna = sc.nextInt();

        int[][] array = new int[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[array.length - 1 - j][i] + " ");
            }
            System.out.println();
        }

        sc.close();

        // int[][] newArray = new int[columna][fila];

        // for (int i = 0; i < columna; i++) {
        //     for (int j = 0; j < fila; j++) {
        //         newArray[i][j] = array[(fila- 1) -j][i];
        //     }
        // }

        // for (int i = 0; i < columna; i++) {
        //     for (int j = 0; j < fila; j++) {
        //         System.out.print(newArray[i][j] + " ");
        //     }
        //     System.out.println();
        // }



    }
}