package com.mycompany.ejercicios;

import java.util.Scanner;

public class AreaFigura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String menu = "\n1. Área trángulo." + "\n2. Área rectángulo." + "\n3. Área circulo" + "\n4. Salir\n";
        double area, base, altura, radio;
        int opcion;
        do {
            System.out.println(menu);
            opcion = Integer.parseInt(scanner.next());
            switch (opcion) {
                case 1:
                    System.out.println("Ingresar base");
                    base = scanner.nextDouble();
                    System.out.println("Ingresar altura");
                    altura = scanner.nextDouble();
                    area = (base * altura) / 2;
                    System.out.println("El área es : " + area);
                    break;
                case 2:
                    System.out.println("Ingresar base");
                    base = scanner.nextDouble();
                    System.out.println("Ingresar altura");
                    altura = scanner.nextDouble();
                    area = base * altura;
                    System.out.println("El área es : " + area);
                    break;
                case 3:
                    System.out.println("Ingresar valor del radio");
                    radio = scanner.nextDouble();
                    area = Math.pow(radio, 2) * 3.14;
                    System.out.println("El área es : " + area);
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } while (opcion != 4);
    }

}
