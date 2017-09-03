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
public class Empleado {
    private int numero;
    private int horas_normales;
    private int horas_extra;
    private int horas_festivos;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setHoras_normales(int horas_normales) {
        this.horas_normales = horas_normales;
    }

    public void setHoras_extra(int horas_extra) {
        this.horas_extra = horas_extra;
    }

    public void setHoras_festivos(int horas_festivos) {
        this.horas_festivos = horas_festivos;
    }

    public int getNumero() {
        return numero;
    }

    public int getHoras_normales() {
        return horas_normales;
    }

    public int getHoras_extra() {
        return horas_extra;
    }

    public int getHoras_festivos() {
        return horas_festivos;
    }

    public Empleado(int numero) {
        this.numero = numero;
        this.horas_normales = 0;
        this.horas_extra = 0;
        this.horas_festivos = 0;
    }
}
