/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrevista;

/**
 *
 * @author nicol
 */
public class SuperMercado {
    private String nombre;
    private Producto[] productos;
    private int dia;
    private Mes mes;
    private Factura[] facturas;
    private Empleado[] empleados;

    public String getNombre() {
        return nombre;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public int getDia() {
        return dia;
    }

    public Mes getMes() {
        return mes;
    }

    public Factura[] getFacturas() {
        return facturas;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }

    public void setFacturas(Factura[] facturas) {
        this.facturas = facturas;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public SuperMercado(String nombre, int dia, Mes mes) {
        this.nombre = nombre;
        this.productos = new Producto[1000];
        this.dia = dia;
        this.mes = mes;
        this.facturas =new Factura [1000];
        this.empleados = new Empleado [7];
    }
}
