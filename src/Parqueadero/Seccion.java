/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueadero;
import becker.robots.*;

/**
 *
 * @author Nicolas Garcia y Juan David Jaime
 */
public class Seccion {
    
    private int numero;
    private Vehiculo[] vehiculos;
    private int disponibilidad;
    private Parqueadero parqueadero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos( int pos, Vehiculo vehiculo) {
        this.vehiculos[pos] = vehiculo;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }
    
    public Seccion(int numero) {
        this.numero = numero;
        this.vehiculos=new Vehiculo[5];
        this.disponibilidad = 5;
    }
    
    public void mostrarVehiculos(){
        if (this.disponibilidad != 5){
            System.out.println("Vehiculos de la seccion "+ this.numero+": ");
            for (int i = 0; i < (5 - this.disponibilidad); i++){
            System.out.println(" - " + this.getVehiculos()[i].getPlaca());
            }
            System.out.println(" ");
        }else{
            System.out.println("La seccion " + this.numero + " no tiene vehiculos actualmente");
            System.out.println(" ");
        }
        
    }
 
}

 
    


