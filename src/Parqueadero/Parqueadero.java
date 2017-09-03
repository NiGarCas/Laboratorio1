/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueadero;

import becker.robots.*;
import java.util.*;
/**
 *
 * @author El PcGamer
 */
public class Parqueadero { 
    private String nombre;
    private City ciudad;
    private Robot vehiculo;

    public Parqueadero(String nombre) {
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public City getCiudad() {
        return ciudad;
    }

    public void setCiudad(City ciudad) {
        this.ciudad = ciudad;
    }

    public Robot getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Robot vehiculo) {
        this.vehiculo = vehiculo;
    }
    

    
       public void girarderecha(Robot robot){
        this.vehiculo.turnLeft();
         this.vehiculo.turnLeft();
          this.vehiculo.turnLeft();
         
}
       
       
       
    
    
 
    
    
}
