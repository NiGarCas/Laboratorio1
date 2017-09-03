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
 * @author nicol
 */
public class Main {
    public static void girarDerecha(Robot karel){
     karel.turnLeft();
     karel.turnLeft();
     karel.turnLeft();
   }
    public static Thing ingresarvehiculo(City ny,int pos,int pos2){
        Thing thing= new Thing(ny,pos,pos2);
    return thing;
   }
    
    
  
  
    
    

    
    public static void main(String[] args)
   {         City ny = new City();

           
      // Set up the initial situation
      //Creando la estructura del parqueadero
   
      
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
      
       
  
     
       Robot karel = new Robot(ny, 5, 6, Direction.WEST);

       Vehiculo vehiculo=new Vehiculo(1000,ny,5,7);
       
       
   girarDerecha(karel);

    
        
      
      
          


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
}
