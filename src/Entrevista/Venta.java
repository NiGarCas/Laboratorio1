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
public class Venta {
    private Producto producto;
    private int cantidad;
    private double valor_total;
    private int dia;
    private Mes mes;

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getValor_total() {
        return valor_total;
    }

    public int getDia() {
        return dia;
    }

    public Mes getMes() {
        return mes;
    }

    public Venta(Producto producto, int cantidad, double valor_total, int dia, Mes mes) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.valor_total = valor_total;
        this.dia = dia;
        this.mes = mes;
    }
}
