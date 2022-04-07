package com.mycompany.ejercicios;

import java.util.Scanner;

public class VerificarOrdenamiento {

    /**
     * Mostrar true o false si 3 números están ordenados de forma ascendente o descendente
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        boolean resultado = (n1 >= n2 && n2 >= n3 || n1 <= n2 && n2 <= n3)? true: false;

        System.out.println(resultado);






    }

}
