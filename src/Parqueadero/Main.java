/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueadero;
import Parqueadero.*;
import becker.robots.*;
import java.util.*;
import java.util.*;

/**
 *
 * @author Nicolas Garcia y Juan David Jaime
 */
public class Main {
    public static void girarDerecha(Robot robot){
     robot.turnLeft();
     robot.turnLeft();
     robot.turnLeft();
   }
    public static Thing ingresarvehiculo(City ny,int pos,int pos2){
        Thing thing= new Thing(ny,pos,pos2);
    return thing;
   }
    
    
  
  
    
    

    
    public static void main(String[] args){
//
//    {         Parqueadero ny = new Parqueadero("Santarita");
//
           
      // Set up the initial situation
      //Creando la estructura del parqueadero
   
      City ny=new City();
      for(int i=0;i<3;i++){
       Wall c1 = new Wall(ny, 0,i, Direction.NORTH);
       for(int j=0;j<5;j++){
       Wall c2=  new Wall(ny, j,i,Direction.WEST);
       Wall c3= new Wall(ny,j,i,Direction.EAST);
            }
      }
      for(int i=0;i<4;i++){
       Wall c3=  new Wall(ny,4 ,i+3,Direction.NORTH);
       Wall c4=  new Wall(ny,4 ,i+3,Direction.EAST);
   }
      for(int i=0;i<7;i++){
       Wall c5=  new Wall(ny,5 ,i,Direction.SOUTH);
      
   }
        Wall c1= new Wall(ny, 5,0, Direction.WEST);
               

            
       Robot roboco=new Roboco(ny, 5, 7, Direction.WEST);
       girarDerecha(roboco);
         Parqueadero p= new Parqueadero("Parqueadero Santa Rita");
        Scanner in = new Scanner(System.in);
        //iniciar 
        for(int i=0;i<3;i++){
        p.agregarSeccion(i);
        }
        int continuar = 1, opcion = 0;
        do{
            System.out.println(p.getNombre());
            System.out.println("El parqueadero cuenta con las secciones 0, 1  y 2 ");
            System.out.println("1. Sacar vehiculo");
            System.out.println("2. Agregar vehiculo");
            System.out.println("3. Informacion seccion");
            opcion = in.nextInt();
            if(opcion == 1){
                //System.out.println("Ingrese el numero de seccion de 0 a 2");
                //int numero = in.nextInt();
//                System.out.println("Ingrese el nombre del artista");
//                String artista = in.next();
               // boolean resultado =p.agregarSeccion(numero) ;
              //  if(resultado == true){
                //    System.out.println("Se ha creado satisfactoriamente la seccion");
                //}else{
                 //   System.out.println("Problemas en la creacion de la seccion");
                //}
            }else if(opcion == 2){
              //  System.out.println("Numero de la seccion  a la cual desea agregar vehiculo");
                
                 
                 
                 
                 
                 
                 
              //int numseccion=  in.nextInt();
                System.out.println("Ingrese los datos del vehiculo");
                System.out.println("Placa");
               int placa= in.nextInt();
               
               
//                System.out.println("Duracion");
//                float duracion = in.nextFloat();
//                System.out.println("Tamanio");
//                float tamanio = in.nextFloat();
//                System.out.println("Calidad");
//                float calidad = in.nextFloat();
              //  boolean  resultado = p.agregarSeccionVehiculo(numseccion,placa,ny,5,7);
              boolean resultado=p.agregarSeccionVehicularDeterminando(placa, ny, 5, 7);
              
                if(resultado == true){
                    System.out.println("Se creo el auto ");
                }else{
                    System.out.println("El parqueadero esta completo");
                }
           
             }else if(opcion == 3){
                 System.out.println("Ingrese el numero de la seccion");
                 int numseccion= in.nextInt();
                boolean resultado=p.informacionvehiculos(numseccion); 
                 if(resultado=true){
                     System.out.println("Lista de vehiculos exitentes en la seccion");
                 }else{
                     System.out.println("Problemas en la impresion de las placas de la seccion");
                 }
            }
            else {
                System.out.println("Opcion invalida");
            }
        
        }while(continuar == 1);
    
    }


        
      
      
          


      // mark goes around the roadblock
//      mark.turnLeft();
//      mark.move();
//      mark.move();
//      mark.turnLeft();     // start turning right as three turn lefts
//      mark.turnLeft();
//      mark.turnLeft();     // finished turning right
//      mark.move();

      // ann goes to meet mark
//      ann.turnLeft();      // start turning right as three turn lefts
//      ann.turnLeft();
//      ann.turnLeft();      // finished turning right
//     
//      if(ann.frontIsClear())
//          ann.move();
//      
//      ann.move();
//      ann.turnLeft();
//      
//      
   }

