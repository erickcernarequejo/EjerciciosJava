package com.mycompany.clases;

public class Empleado {
    
    private String codigo;
    private String apellidos;
    private String nombres;
    private String puesto;
    private double salario;

    public Empleado(String codigo, String apellidos, String nombres, String puesto, double salario) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return getCodigo() + " - " + getApellidos() + ", " + getNombres() +
        " - " + getPuesto() + " - " + getSalario();
    }

    
    
}