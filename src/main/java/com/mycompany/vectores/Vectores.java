package com.mycompany.vectores;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Vectores {

    
    public static void main(final String[] args) {

        int opcion, tam = 0;
        double[] numeros = null;
        double promedio, suma = 0;

        final String menu1 = "\n1. Ingresar tamaño del vector \n2. Ingresar números " + "\n3. Listar Vector"
                + "\n4. Calcular promedio" + "\n5. Número mayor " + "\n6. Número menor" + "\n7. Buscar número"
                + "\n8. Ordenar forma ascendente" + "\n9. Salir" + "\n\nDigite opción: ";

        do {
            opcion = Integer.parseInt(showInputDialog(menu1));
            switch (opcion) {
                case 1:
                    do {
                        tam = Integer.parseInt(showInputDialog("Ingresar tamaño del vector"));
                    } while (tam <= 0);
                    numeros = new double[tam];
                    break;
                case 2:
                    if (numeros == null) {
                        showMessageDialog(null, "Opción no válida");
                    } else {
                        for (int i = 0; i < numeros.length; i++) {
                            numeros[i] = Double.parseDouble(showInputDialog("Ingresar número " + (i + 1) + " : "));
                        }
                    }
                    break;

                case 3:
                    if (numeros == null) {
                        showMessageDialog(null, "Opción no válida");
                    } else {
                        String cad = "";
                        for (int i = 0; i < numeros.length; i++) {
                            cad += numeros[i] + "\n";
                        }
                        showMessageDialog(null, "Lista de números ingresados \n" + cad);

                        Arrays.stream(numeros).forEach(num -> System.out.println(num));

                    }
                    break;

                case 4:
                    if (numeros == null) {
                        showMessageDialog(null, "Opción no válida");
                    } else {
                        for (int i = 0; i < numeros.length; i++) {
                            suma += numeros[i];
                        }
                        promedio = suma / numeros.length;
                        showMessageDialog(null, "Promedio " + promedio);

                        var promedioStream = Arrays.stream(numeros).average().getAsDouble();
                        System.out.println("El promedio es : " + promedioStream);
                    }
                    break;

                case 5:
                    if (numeros == null) {
                        showMessageDialog(null, "Opción no válida");
                    } else {
                        double mayor = numeros[0];
                        for (int i = 0; i < numeros.length; i++) {
                            if (numeros[i] > mayor) {
                                mayor = numeros[i];
                            }
                        }

                        showMessageDialog(null, "El número mayor es :  " + mayor);

                        var mayorStream = Arrays.stream(numeros).max().getAsDouble();
                        System.out.println("El número mayor es : " + mayorStream);
                    }
                    break;

                case 6:
                    if (numeros == null) {
                        showMessageDialog(null, "Opción no válida");
                    } else {
                        double menor = numeros[0];
                        for (int i = 0; i < numeros.length; i++) {
                            if (numeros[i] < menor) {
                                menor = numeros[i];
                            }
                        }

                        showMessageDialog(null, "El número menor es :  " + menor);

                        var menorStream = Arrays.stream(numeros).min().getAsDouble();
                        System.out.println("El número menor es : " + menorStream);
                    }
                    break;
                case 7:
                    if (numeros == null) {
                        showMessageDialog(null, "Opción no válida");
                    } else {
                        boolean encontrado = false;
                        final double numBuscar = Double.parseDouble(showInputDialog("Ingresar número a buscar "));
                        // for (int i = 0; i < numeros.length; i++) {
                        //     if (numeros[i] == numBuscar) {
                        //         encontrado = true;
                        //     }
                        // }

                        encontrado = Arrays.stream(numeros).filter(num -> num == numBuscar).findFirst().isPresent();

                        if (encontrado)
                            showMessageDialog(null, "Se encontró el número");
                        else
                            showMessageDialog(null, "No se encontró el número");
                    }
                    break;

                case 8:
                    if (numeros == null) {
                        showMessageDialog(null, "Opción no válida");
                    } else {
                        double aux, num1, num2;
                        for (int i = 0; i < numeros.length; i++) {
                            num1 = numeros[i];
                            for (int j = i+1; j < numeros.length; j++) {
                                num2 = numeros[j];
                                if(num1 > num2){
                                    aux = numeros[i];
                                    numeros[i] = numeros[j];
                                    numeros[j] = aux;
                                }
                            }
                        }

                        String cad = "";
                        for (int i = 0; i < numeros.length; i++) {
                            cad += numeros[i] + "\n";
                        }
                        showMessageDialog(null, "Lista ordena de forma ascendente \n" + cad);
                    
                    }
                    break;
                default:

                    break;
            }
        } while (opcion != 9);

    

    }

    
}