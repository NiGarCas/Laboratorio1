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
public class Parqueadero { 
    
    private City ciudad;
    private String nombre;
    private Seccion[] secciones;
    private double ingresos;

    public Parqueadero(String nombre, City ciudad) {
        this.nombre = nombre;
        this.ingresos =0;
        this.secciones = new Seccion[3];
        this.ciudad = ciudad;
    }

    public City getCiudad() {
        return ciudad;
    }

    public void setCiudad(City ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Seccion[] getSecciones() {
        return secciones;
    }

    public void setSecciones(Seccion[] secciones) {
        this.secciones = secciones;
        this.secciones[0].setParqueadero(this);
        this.secciones[1].setParqueadero(this);
        System.out.println(secciones[1].getParqueadero().getNombre());
        this.secciones[2].setParqueadero(this);
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
    
    public Seccion seccionMenosOcupada(){
        int disp1 = this.getSecciones()[0].getDisponibilidad();
        int disp2 = this.getSecciones()[1].getDisponibilidad();
        int disp3 = this.getSecciones()[2].getDisponibilidad();
        Seccion menos_ocupada = new Seccion (0);
        menos_ocupada.setDisponibilidad(0);
        for (int i = 0; i < 3; i++){
            if (this.getSecciones()[i].getDisponibilidad() > menos_ocupada.getDisponibilidad()){
                menos_ocupada = this.getSecciones()[i];
            }
        }   
        return menos_ocupada;
    }
    public void registrarPago (Vehiculo vehiculo){
        int minutos = vehiculo.getHoraSalida()-vehiculo.getHoraIngreso();
        System.out.println("Se ha registrado pago: $" + (minutos*55));
        this.ingresos = this.ingresos + (minutos*55);
    }
    
    public void eliminarVehiculo (Vehiculo vehiculo){
        int a = vehiculo.getSeccion().getDisponibilidad();
        int posicion = 0;
        int i = 0;
        for (i = 0; i < 5; i++){
            if (vehiculo.getPlaca().equals(vehiculo.getSeccion().getVehiculos()[i].getPlaca())){
                posicion = i;
                break;
            }
        }
        int j = posicion;
        if (a != 4){
            for (j = posicion; j < (4 - a); j++){
                vehiculo.getSeccion().setVehiculos(j, vehiculo.getSeccion().getVehiculos()[j+1]);
            }
            System.out.println(j);
            vehiculo.getSeccion().setVehiculos(j, null);
        }else{
            vehiculo.getSeccion().setVehiculos(j, null);
        }
        int nd = vehiculo.getSeccion().getDisponibilidad();
        vehiculo.getSeccion().setDisponibilidad(nd +1);
    }
}
       
    
    
 
    
    

