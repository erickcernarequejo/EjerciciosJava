package com.mycompany.clases;

public class ListaEmpleado {

    private final Empleado listaE[];
    private int posicion;

    public ListaEmpleado(int tamano) {
        listaE = new Empleado[tamano];
        posicion = -1;
    }

    public void setEmpleado(Empleado empleado) {
        listaE[++posicion] = empleado;
    }

    public boolean verificarEspacio() {
        if (posicion == listaE.length - 1) {
            return true;
        }
        return false;
    }

    public String getEmpleados() {
        String cadena = "";
        for (int i = 0; i <= posicion; i++) {
            cadena += listaE[i] + "\n";
        }
        return cadena;
    }

    public Empleado buscarEmpleado(int pos) {
        if (pos >= 0 && pos <= posicion) {
            return listaE[pos];
        }
        return null;
    }

    public double getSalarioPromedio() {
        double suma = 0, promedio = 0;
        for (int i = 0; i <= posicion; i++) {
            suma += listaE[i].getSalario();
        }
        promedio = suma / (posicion + 1);
        return promedio;
    }

    public double getSalarioMayor(){
        double mayor = listaE[0].getSalario();
        for (int i = 0; i <= posicion; i++) {
            if(listaE[i].getSalario() > mayor){
                mayor = listaE[i].getSalario();
            }
        }
        return mayor;
    }

    public double getSalarioMenor(){
        double menor = listaE[0].getSalario();
        for (int i = 0; i <= posicion; i++) {
            if(listaE[i].getSalario() < menor){
                menor = listaE[i].getSalario();
            }
        }
        return menor;
    }

    public String getListarPorApellidos(){
        Empleado aux;
        String cadena1="", cadena2="";
        for (int i = 0; i <= posicion; i++) {
            cadena1 = listaE[i].getApellidos();
            for (int j = i + 1; j <= posicion; j++) {
                cadena2 = listaE[j].getApellidos();
                if(cadena1.compareTo(cadena2) > 0){
                    aux = listaE[i];
                    listaE[i] = listaE[j];
                    listaE[j] = aux;
                }
            }
        }

        String cad = "";
        for (int i = 0; i <= posicion; i++) {
            cad += listaE[i] + "\n";
        }
        return cad;
    }
    
    public int existePersona(String codigo) {
        for(int i=0; i<=posicion; i++) {
            if(listaE[i].getCodigo().compareToIgnoreCase(codigo) == 0) {
                return i;
            }
        }
        return -1;
    }
}