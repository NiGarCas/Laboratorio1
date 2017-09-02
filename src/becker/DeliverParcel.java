package becker;

import becker.robots.*;
import java.util.*;

public class DeliverParcel
{
   public static void main(String[] args)
   {  
     // Set up the initial situation
       Scanner flujo = new Scanner(System.in);
      City prague = new City();
      Robot karel = new Robot(prague, 1, 0, Direction.EAST,5);
      int j;
      // Direct the robot to the final situation
      karel.move();
      karel.move();
      //karel.pickThing();
      System.out.println("HOLA");
      karel.move();
      karel.turnLeft();	// start turning right as three turn lefts
      karel.turnLeft();
      karel.turnLeft();	// finished turning right
      karel.move();
     // karel.putThing();
      karel.move();
      j = flujo.nextInt();
      if (j == 1){
          karel.turnLeft();
          karel.turnLeft();
          karel.turnLeft();
          karel.turnLeft();
          karel.turnLeft();
          karel.turnLeft();
          karel.turnLeft();
          karel.turnLeft();
      }
   }
}
