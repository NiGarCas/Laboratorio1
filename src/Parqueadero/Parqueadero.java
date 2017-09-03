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
public class Parqueadero { 
    
    private City ciudad;
    private String nombre;
    private Seccion[] seccion;
    private int numerodesecciones;

    public Parqueadero(String nombre) {
        this.nombre = nombre;
        this.numerodesecciones=0;
        this.seccion= new Seccion[3];
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

    public Seccion[] getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion[] seccion) {
        this.seccion = seccion;
    }

    public int getNumerodesecciones() {
        return numerodesecciones;
    }

    public void setNumerodesecciones(int numerodesecciones) {
        this.numerodesecciones = numerodesecciones;
    }

   

    
    
 public boolean agregarSeccion(int numeroseccion){
       Seccion seccion = new Seccion(numeroseccion);
       if(this.numerodesecciones < 3){
         this.seccion[this.numerodesecciones] = seccion;
         this.numerodesecciones++;
         return true;
       }else{
         return false;
       }
    }
 public boolean agregarSeccionVehiculo(int numeroseccion,int placa,City city,  int i, int i1){
       boolean resultado = false;
        for (int j = 0; j < this.numerodesecciones; j++) {
            if(this.seccion[numeroseccion].getNumeroseccion()==numeroseccion){
              resultado = this.seccion[i].agregarvehiculo(placa, this.ciudad, i, i1);
              break;
            }
        }
       return resultado;
     
     
 }
     public boolean informacionvehiculos(int numerodeseccion){
    
          if (this.seccion[numerodeseccion].getNumeroseccion()==numerodeseccion){ 
               System.out.println("Seccion"+ numerodeseccion);
              for(int i=0;i<this.seccion[numerodeseccion].getNumvehiculos();i++){
                 
                 System.out.println("Vehiculo"+0+i);
                this.seccion[numerodeseccion].informacionvehiculo();
              }
              
             return true;
              
        
           
          
        }else{
              return false;
          }
  
}   

}
       
       
    
    
 
    
    

