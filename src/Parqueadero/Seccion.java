/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueadero;
import becker.robots.*;

/**
 *
 * @author El PcGamer
 */
public class Seccion {
    private int numeroseccion;
    private Vehiculo[] vehiculo;
    private int numvehiculos;

    public int getNumeroseccion() {
        return numeroseccion;
    }

    public void setNumeroseccion(int numeroseccion) {
        this.numeroseccion = numeroseccion;
    }

    public Vehiculo[] getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo[] vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNumvehiculos() {
        return numvehiculos;
    }

    public void setNumvehiculos(int numvehiculos) {
        this.numvehiculos = numvehiculos;
    }

   

    public Seccion(int numeroseccion) {
        this.numeroseccion = numeroseccion;
        this.vehiculo=new Vehiculo[5];
        this.numvehiculos=0;
    }
    
    public boolean agregarvehiculo(int placa, City city, int i, int i1){
    Vehiculo vehiculo=new Vehiculo(placa,city,5,7);
    if(numvehiculos<5){
        this.vehiculo[this.numvehiculos]=vehiculo;
        this.numvehiculos++;
               return true;
    }else{
    
    
    return false;
   
    
}
    
}
    public int informacionvehiculo(){
        int vehiculo=0;
        for (int i = 0; i <this.getNumvehiculos(); i++) {
           
         vehiculo = this.vehiculo[i].getPlaca();  
             
          
         }
        return vehiculo;
        
    }
    
    }
    

