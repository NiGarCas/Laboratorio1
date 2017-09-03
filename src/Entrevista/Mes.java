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
public class Mes {
    private String nombre;
    private int numero;
    private int numero_dias;
    private int[] dias;

    public Mes(String nombre,int numero, int numero_dias) {
        this.nombre = nombre;
        this.numero = numero;
        this.numero_dias = numero_dias;
        this.dias = new int[numero_dias];
        for (int i = 0; i < numero_dias; i++){
            this.dias[i] = i+1;
        }
    }

    public int getNumero() {
        return numero;
    }

    
}
