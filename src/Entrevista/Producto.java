/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrevista;

/**
 *
 * @author Nicolas Garcia y Juan David Jaime
 */
public class Producto {
    //Atributos de la clase Producto
    private String nombre;
    private String proovedor;
    private double costo;
    private double precio;
    private int cantidad_actual;
    private int cantidad_vendida;

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad_actual(int cantidad_actual) {
        this.cantidad_actual = cantidad_actual;
    }

    public void setCantidad_vendida(int cantidad_vendida) {
        this.cantidad_vendida = cantidad_vendida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProovedor() {
        return proovedor;
    }

    public double getCosto() {
        return costo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad_actual() {
        return cantidad_actual;
    }

    public int getCantidad_vendida() {
        return cantidad_vendida;
    }

    public Producto(String nombre, String proovedor, double costo, double precio) {
        this.nombre = nombre;
        this.proovedor = proovedor;
        this.costo = costo;
        this.precio = precio;
        this.cantidad_actual = 0;
        this.cantidad_vendida = 0;
    }
}
