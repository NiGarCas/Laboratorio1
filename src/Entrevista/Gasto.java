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
public class Gasto {
    private String asunto;
    private Empleado empleado;
    private double valor;
    private int dia;
    private Mes mes;

    public String getAsunto() {
        return asunto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public double getValor() {
        return valor;
    }

    public int getDia() {
        return dia;
    }

    public Mes getMes() {
        return mes;
    }

    public Gasto(String asunto, Empleado empleado, double valor, int dia, Mes mes) {
        this.asunto = asunto;
        this.empleado = empleado;
        this.valor = valor;
        this.dia = dia;
        this.mes = mes;
    }

}