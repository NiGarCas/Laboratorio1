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
            if(this.seccion[j].getNumeroseccion()==numeroseccion){
              resultado = this.seccion[j].agregarvehiculo(placa, city, i, i1);
              break;
            }
        }
       return resultado;
     
     
 }
 
 public int Determinanandoseccion(){
    int num=0;
    //for(int j=0;j<this.getNumerodesecciones()-1;j++){
    Seccion[]seccion=this.getSeccion();
//    int numerovehiculosseccion=seccion[j].getNumvehiculos();
//    int numerovehiculosseccion1=seccion[j+1].getNumvehiculos();
if(seccion[0].getNumvehiculos()==seccion[1].getNumvehiculos()&&seccion[1].getNumvehiculos()==seccion[2].getNumvehiculos()){
    num=0;
}
if(seccion[0].getNumvehiculos()<seccion[1].getNumvehiculos()){
        num=0;
}else if(seccion[0].getNumvehiculos()>seccion[1].getNumvehiculos()){
            num=1;  
            
      }else if(seccion[1].getNumvehiculos()>seccion[2].getNumvehiculos()){
       //num=seccion[2].getNumeroseccion();
       num=2;  
  
           
            }
    //}
 return  num;

 }
 public boolean agregarSeccionVehicularDeterminando(int placa,City city,  int i, int i1){
    int numerodeseccion=this.Determinanandoseccion();
     boolean resultado= this.agregarSeccionVehiculo(numerodeseccion, placa, city, i,i1);
   return resultado;
 
 }
 
 
 
 
     public boolean informacionvehiculos(int numerodeseccion){
    
          if (this.seccion[numerodeseccion].getNumeroseccion()==numerodeseccion){ 
               System.out.println("Seccion"+ numerodeseccion);
              for(int i=0;i<this.seccion[numerodeseccion].getNumvehiculos();i++){
                 
                 System.out.println("Vehiculo"+0+i);
                    Vehiculo[] vehiculo=this.seccion[numerodeseccion].getVehiculo();
                    System.out.println(  "Placa  :"+ vehiculo[i].getPlaca()   );
              }
              
             return true;
              
        
           
          
        }else{
              return false;
          }
  
       
}   
//   public void ubicarvehiculo(Robot robot){
//       robot.move();    
//       
//       
//       
//   }  
 public int posicionplacaplaca(int numerodeseccion, int placa){
    int num=0;
    Vehiculo[] vehiculo=this.seccion[numerodeseccion].getVehiculo();
          if (this.seccion[numerodeseccion].getNumeroseccion()==numerodeseccion){ 
               
              for(int i=0;i<this.seccion[numerodeseccion].getNumvehiculos();i++){
                    if( vehiculo[i].getPlaca()==placa){
                       num=i;
                        break;
                    }
              }   
             
                  
                 
              }
              
             return num;
              
        
           
          
        }
 public boolean eliminarVehiculoPlaca(int numerodeseccion, int placa){
                  boolean resultado = false;
       
            if(this.seccion[numerodeseccion].getNumeroseccion()==numerodeseccion){
              resultado = this.seccion[numerodeseccion].eliminarVehiculo(placa);
            return resultado;
            }
        
       return resultado;
     
    }
 
 
  
     
}
       
    
    
 
    
    

