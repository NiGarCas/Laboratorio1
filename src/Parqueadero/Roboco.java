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
public class Roboco extends Robot {

    public Roboco(City city, int i, int i1, Direction drctn) {
        super(city, i, i1, drctn);
    }
     public  void girarDerechas(Roboco robot){
     robot.turnLeft();
     robot.turnLeft();
     robot.turnLeft();
   }
    
}
