package com.mycompany.vectores;

import java.util.Scanner;

public class IntercambioColumnas {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar cantidad de filas");
        int f = sc.nextInt();

        System.out.println("Ingresar cantidad de columnas");
        int c = sc.nextInt();

        int[][] array = new int[f][c];

        //Llenar array
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        //Intercambio valores de columnas
        System.out.println("Ingresar primera columna a intercambiar");
        int indiceI = sc.nextInt() - 1 ;

        System.out.println("Ingresar segunda columna a intercambiar");
        int indiceJ = sc.nextInt() - 1;

        int aux;
        for (int i = 0; i < array.length; i++) {
            aux = array[i][indiceI];
            array[i][indiceI] = array[i][indiceJ];
            array[i][indiceJ] = aux;
        }

        //Mostrar valores
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}