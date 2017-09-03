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
public class Factura {
    private String proovedor;
    private Producto producto;
    private int cantidad;
    private double valor;
    private int dia_creado;
    private Mes mes_creado;
    private int dia_vence;
    private Mes mes_vence;

    public void setProovedor(String proovedor) {
        this.proovedor = proovedor;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDia_creado(int dia_creado) {
        this.dia_creado = dia_creado;
    }

    public void setMes_creado(Mes mes_creado) {
        this.mes_creado = mes_creado;
    }

    public void setDia_vence(int dia_vence) {
        this.dia_vence = dia_vence;
    }

    public void setMes_vence(Mes mes_vence) {
        this.mes_vence = mes_vence;
    }

    public String getProovedor() {
        return proovedor;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getValor() {
        return valor;
    }

    public int getDia_creado() {
        return dia_creado;
    }

    public Mes getMes_creado() {
        return mes_creado;
    }

    public int getDia_vence() {
        return dia_vence;
    }

    public Mes getMes_vence() {
        return mes_vence;
    }

    public Factura(Producto producto, int cantidad, int dia_creado, Mes mes_creado, int dia_vence, Mes mes_vence) {
        this.proovedor = producto.getProovedor();
        this.producto = producto;
        this.cantidad = cantidad;
        this.dia_creado = dia_creado;
        this.mes_creado = mes_creado;
        this.dia_vence = dia_vence;
        this.mes_vence = mes_vence;
    }
}
