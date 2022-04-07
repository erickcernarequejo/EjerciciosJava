package com.mycompany.clases;

/*
 * Implementar la clase Empleado. De cada empleado
 * se conoce su código, apellidos, nombres, puesto y salario mensual.
 * Se pide:
 * - Ingresar los datos de los empleados en un arreglo.
 * - Listar Empleados
 * - Listar los datos de los empleados ordenados en forma
 *   ascendente por el apellido.
 * - Calcular el salario promedio, el mayor y el menor.
 * - Buscar empleado por la posición
 */
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class App {

    public static void main(String[] args) {

        int opcion;
        final String menu = "\n1. Ingresar datos " + "\n2. Listar empleados" + "\n3. Listar por apellidos asc"
                + "\n4. Salario promedio, mayor y menor" + "\n5. Buscar por posición" + "\n6. Salir"
                + "\n\nDigite opción: ";

        Empleado empleado = null;
        ListaEmpleado listaE = new ListaEmpleado(10);
        int posE = 0;

        do {
            opcion = Integer.parseInt(showInputDialog(menu));
            switch (opcion) {
                case 1:
                    if (listaE.verificarEspacio()) {
                        showMessageDialog(null, "No se puede ingresar datos");
                    } else {
                        String codigo = "", apellidos = "", nombres = "", puesto = "";
                        double salario = 0.0;

                        do {
                            codigo = showInputDialog(null, "Codigo", "Menu", 3);
                            posE = listaE.existePersona(codigo);
                        } while (posE != -1);

                        System.out.println(posE);

                        apellidos = showInputDialog(null, "apellidos", "Menu", 3);
                        nombres = showInputDialog(null, "nombres", "Menu", 3);
                        puesto = showInputDialog(null, "puesto", "Menu", 3);
                        salario = Double.parseDouble(showInputDialog(null, "puesto", "Menu", 3));
                        empleado = new Empleado(codigo, apellidos, nombres, puesto, salario);
                        listaE.setEmpleado(empleado);
                    }
                    break;
                case 2:
                    showMessageDialog(null, listaE.getEmpleados());
                    break;
                case 3:
                    showMessageDialog(null, listaE.getListarPorApellidos());
                    break;
                case 4:
                    showMessageDialog(null, "\nSalario Promedio " + listaE.getSalarioPromedio()
                            + "\nSalario Mayor " + listaE.getSalarioMayor()
                            + "\nSalario Menor " + listaE.getSalarioMenor());
                    break;
                case 5:
                    int pos = Integer.parseInt(showInputDialog(null, "Ingresar posición a mostrar", "Menu", 3));
                    showMessageDialog(null, "\nEmpleado encontrado " + listaE.buscarEmpleado(pos - 1));
                    break;

                default:
                    break;
            }
        } while (opcion != 6);
    }

}
