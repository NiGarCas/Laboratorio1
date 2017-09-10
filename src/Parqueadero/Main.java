/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueadero;
import Parqueadero.*;
import becker.robots.*;
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
    public static void girarEspalda(Robot robot){
     robot.turnLeft();
     robot.turnLeft();
        
    }
    public static void mover2(Robot robot){
        robot.move();
         robot.move();
    }
    public static void mover3(Robot robot){
         robot.move(); 
         robot.move();
         robot.move();
    }
    public static void mover4(Robot robot){
        for(int i=0;i<4;i++){
             robot.move();
        }
    }
    public static void mover5(Robot robot){
                for(int i=0;i<5;i++){
             robot.move();
        }
    }
    public static void mover6(Robot robot){
           for(int i=0;i<6;i++){
             robot.move();
    }
    }
    public static void mover7(Robot robot){
           for(int i=0;i<7;i++){
             robot.move();
    }
    }
           public static void mover8(Robot robot){
           for(int i=0;i<8;i++){
             robot.move();
              }
           }
    
    
    
    
    
    
    public static void ingresarVehiculo(Robot robot,int seccion){
        if(seccion==0){
            robot.pickThing();
               for(int i=0;i<7;i++){
                robot.move();
               }
            girarDerecha(robot);
                for(int i=0;i<5;i++){
                robot.move();
                }
            
                robot.turnLeft();
                
                robot.turnLeft();
            for(int i=0;i<5;i++){
                  if(robot.canPickThing()){
                  robot.move();
                  }else if(robot.canPickThing()==false){
                      if(robot.countThingsInBackpack()==1)
                      robot.putThing();
                      robot.move();

                  }

            }
            robot.turnLeft();
               for(int i=0;i<7;i++){
                robot.move();
               }
            robot.turnLeft();
             robot.turnLeft();
            
        }else if(seccion==1){
              
                robot.pickThing();
               for(int i=0;i<6;i++){
                robot.move();
               }
            girarDerecha(robot);
                for(int i=0;i<5;i++){
                robot.move();
                }
            
                robot.turnLeft();
                
                robot.turnLeft();
            for(int i=0;i<5;i++){
                  if(robot.canPickThing()){
                  robot.move();
                  }else if(robot.canPickThing()==false){
                      if(robot.countThingsInBackpack()==1)
                      robot.putThing();
                      robot.move();

                  }

            }
            robot.turnLeft();
               for(int i=0;i<6;i++){
                robot.move();
               }
            robot.turnLeft();
             robot.turnLeft();
                
        }else if(seccion==2){
            robot.pickThing();
               for(int i=0;i<5;i++){
                robot.move();
               }
            girarDerecha(robot);
                for(int i=0;i<5;i++){
                robot.move();
                }
            
                robot.turnLeft();
                
                robot.turnLeft();
            for(int i=0;i<5;i++){
                  if(robot.canPickThing()){
                  robot.move();
                  }else if(robot.canPickThing()==false){
                      if(robot.countThingsInBackpack()==1)
                      robot.putThing();
                      robot.move();

                  }

            }
            robot.turnLeft();
               for(int i=0;i<5;i++){
                robot.move();
               }
            robot.turnLeft();
             robot.turnLeft();
               
            
         }
        
   }
 public static void sacarVehiculo(int seccion,int posicion,Robot robot){
     if(seccion==0){
         if(posicion==4){
               for(int i=0;i<7;i++){
                robot.move();
               }
               girarDerecha(robot);
               robot.move();
               robot.pickThing();
               girarEspalda(robot);
               robot.move();
               robot.turnLeft();
               for(int i=0;i<8;i++){
                robot.move();
               }
               robot.putThing();
              girarEspalda(robot);
               robot.move();
         }else if(posicion==3){
               mover7(robot);
               girarDerecha(robot);
               robot.move();
               if(robot.canPickThing()){
                   robot.pickThing();
                   girarEspalda(robot);
                   robot.move();
                   robot.turnLeft();
                   mover3(robot);  
                   robot.turnLeft();
                   robot.move();
                   robot.putThing();
                   girarEspalda(robot);
                   robot.move();
                   girarDerecha(robot);
                   for(int i=0; i<3;i++){
                       robot.move();
                   }
                   girarDerecha(robot);
                   mover2(robot);
                   robot.pickThing();
                   girarEspalda(robot);
                   mover2(robot);
                    robot.turnLeft();
                   for(int i=0;i<8;i++){
                    robot.move();
                   }
                   robot.putThing();
                    girarEspalda(robot);
                   mover5(robot);
                   girarDerecha(robot);
                   robot.move();
                   robot.pickThing();
                   girarEspalda(robot);
                   robot.move();
                   girarDerecha(robot);
                   mover3(robot);
                   girarDerecha(robot);
                   mover2(robot);
                   robot.putThing();
                   girarEspalda(robot);
                   mover2(robot);
                   robot.turnLeft();
                   mover7(robot);
                   girarEspalda(robot);
               
               }else {
               
               robot.move();
               robot.pickThing();
               girarEspalda(robot);
               mover2(robot);
               robot.turnLeft();
               mover8(robot);
               robot.putThing();
               girarEspalda(robot);
               robot.move();
               }
               
               
         
               
                   
             
         }
     }
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
               

            
       Robot roboco=new Robot(ny, 5, 7, Direction.WEST,0);
      
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
            System.out.println("1. Agregar vehiculo");
            System.out.println("2. Sacar vehiculo");
            System.out.println("3. Informacion seccion");
            opcion = in.nextInt();
            if(opcion == 1){
                  System.out.println("Ingrese los datos del vehiculo");
                System.out.println("Placa");
               int placa= in.nextInt();               
               
              int seccion=p.Determinanandoseccion();
              boolean resultado=p.agregarSeccionVehicularDeterminando(placa, ny, 5, 7);
              ingresarVehiculo(roboco,seccion);
              
                if(resultado == true){
                    System.out.println("Se creo el auto ");
                }else{
                    System.out.println("El parqueadero esta completo");
                }
//               
            }else if(opcion == 2){
             
             System.out.println("Ingrese la seccion donde esta el vehiculo(0,1,2)");
                int seccion= in.nextInt();
                 System.out.println("Ingrese la placa del vehiculo");
                int placa= in.nextInt(); 
               int posicion=p.posicionplacaplaca(seccion, placa);
              System.out.println(p.posicionplacaplaca(seccion, placa));  
                sacarVehiculo(seccion,posicion,roboco);
                boolean resultado=p.eliminarVehiculoPlaca(seccion, placa);
                   if(resultado == true){
                    System.out.println("Se retiro apropiadamente el auto ");
                }else{
                    System.out.println("Problemas sacando el automovil");
                }
                                          
                             
                                
        
              
           
             }else if(opcion == 3){
                 System.out.println("Ingrese el numero de la seccion");
                 int numseccion= in.nextInt();
                 System.out.println("Lista de vehiculos existentes en la seccion");
                boolean resultado=p.informacionvehiculos(numseccion); 
                 if(resultado=true){
                     System.out.println("Fin de la lista");
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

