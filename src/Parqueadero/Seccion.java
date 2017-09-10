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
   
    public boolean eliminarVehiculo(int placa){
       if(this.numvehiculos>0){
           for(int i =0; i<this.numvehiculos;i++){
           if(placa==this.vehiculo[i].getPlaca()){
              this.vehiculo[i]=null;
                 for(int j=i; j<this.numvehiculos-1;j++){
                 this.vehiculo[j]=this.vehiculo[j+1];
                 }                  
                 
           
           }
           break;
      }
       
       
       this.numvehiculos--;
       return true;
       }else
           return false;
                
                
         }
          
          
    }

 
    


