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
    
    public static void moverNveces(Robot robot, int veces){
        for (int i = 1; i <= veces; i++){
            robot.move();
        }
    }
    
    public static void ubicarVehiculo (Robot conductor, Vehiculo vehiculo){
        int seccion = vehiculo.getSeccion().getNumero();
        int disponibilidad = vehiculo.getSeccion().getDisponibilidad();
        int u = 7 - seccion;
        conductor.move();
        conductor.pickThing();
        girarDerecha(conductor);
        moverNveces(conductor, u);
        girarDerecha(conductor);
        moverNveces(conductor, disponibilidad);
        conductor.putThing();
        girarEspalda(conductor);
        moverNveces(conductor, disponibilidad);
        conductor.turnLeft();
        moverNveces(conductor, u);
        conductor.turnLeft();
        conductor.move();
        girarEspalda(conductor);
        int pos = 5 - vehiculo.getSeccion().getDisponibilidad();
        vehiculo.getSeccion().setVehiculos(pos,vehiculo);
        vehiculo.getSeccion().setDisponibilidad(vehiculo.getSeccion().getDisponibilidad() - 1);
    }
    
    public static void ubicarEnZT (Robot conductor, Vehiculo vehiculo){
        int seccion = vehiculo.getSeccion().getNumero();
        int num_vehiculo = 0;
        for (int i=0;i< 5; i++){
            if (vehiculo == vehiculo.getSeccion().getVehiculos()[i] ){
                num_vehiculo = i+1;
                break;
            }
        }
        int disponibilidad = vehiculo.getSeccion().getDisponibilidad();
        int u = 7 - seccion;
        switch (num_vehiculo){
            case 1:
                switch (disponibilidad){
                    case 0:
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u);
                        girarDerecha(conductor);
                        conductor.move();
                        conductor.pickThing();
                        girarEspalda(conductor);
                        conductor.move();
                        conductor.turnLeft();
                        moverNveces(conductor, u-3);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-3);
                        girarDerecha(conductor);
                        moverNveces(conductor, 2);
                        conductor.pickThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 2);
                        conductor.turnLeft();
                        moverNveces(conductor, u-2);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-2);
                        girarDerecha(conductor);
                        moverNveces(conductor, 3);
                        conductor.pickThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 3);
                        conductor.turnLeft();
                        moverNveces(conductor, u-1);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-1);
                        girarDerecha(conductor);
                        moverNveces(conductor, 4);
                        conductor.pickThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 4);
                        conductor.turnLeft();
                        moverNveces(conductor, u);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        break;
                    case 1:
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u);
                        girarDerecha(conductor);
                        moverNveces(conductor, 2);
                        conductor.pickThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 2);
                        conductor.turnLeft();
                        moverNveces(conductor, u-3);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-3);
                        girarDerecha(conductor);
                        moverNveces(conductor, 3);
                        conductor.pickThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 3);
                        conductor.turnLeft();
                        moverNveces(conductor, u-2);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-2);
                        girarDerecha(conductor);
                        moverNveces(conductor, 4);
                        conductor.pickThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 4);
                        conductor.turnLeft();
                        moverNveces(conductor, u-1);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        moverNveces(conductor, 1);
                        conductor.turnLeft();
                        moverNveces(conductor, 1);
                        conductor.turnLeft();
                        moverNveces(conductor, 1);
                        girarEspalda(conductor);
                        break;
                    case 2:
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u);
                        girarDerecha(conductor);
                        moverNveces(conductor, 3);
                        conductor.pickThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 3);
                        conductor.turnLeft();
                        moverNveces(conductor, u-3);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-3);
                        girarDerecha(conductor);
                        moverNveces(conductor, 4);
                        conductor.pickThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 4);
                        conductor.turnLeft();
                        moverNveces(conductor, u-2);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        moverNveces(conductor, 1);
                        conductor.turnLeft();
                        moverNveces(conductor, 2);
                        conductor.turnLeft();
                        moverNveces(conductor, 1);
                        girarEspalda(conductor);
                        break;
                    case 3:
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u);
                        girarDerecha(conductor);
                        moverNveces(conductor, 4);
                        conductor.pickThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 4);
                        conductor.turnLeft();
                        moverNveces(conductor, u-3);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        moverNveces(conductor, 1);
                        conductor.turnLeft();
                        moverNveces(conductor, 3);
                        conductor.turnLeft();
                        moverNveces(conductor, 1);
                        girarEspalda(conductor);
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                switch (disponibilidad){
                    case 0:
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u);
                        girarDerecha(conductor);
                        conductor.move();
                        conductor.pickThing();
                        girarEspalda(conductor);
                        conductor.move();
                        conductor.turnLeft();
                        moverNveces(conductor, u-3);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-3);
                        girarDerecha(conductor);
                        moverNveces(conductor, 2);
                        conductor.pickThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 2);
                        conductor.turnLeft();
                        moverNveces(conductor, u-2);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-2);
                        girarDerecha(conductor);
                        moverNveces(conductor, 3);
                        conductor.pickThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 3);
                        conductor.turnLeft();
                        moverNveces(conductor, u-1);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        moverNveces(conductor, 1);
                        conductor.turnLeft();
                        moverNveces(conductor, 1);
                        conductor.turnLeft();
                        moverNveces(conductor, 1);
                        girarEspalda(conductor);
                        break;
                    case 1:
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u);
                        girarDerecha(conductor);
                        moverNveces(conductor, 2);
                        conductor.pickThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 2);
                        conductor.turnLeft();
                        moverNveces(conductor, u-3);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-3);
                        girarDerecha(conductor);
                        moverNveces(conductor, 3);
                        conductor.pickThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 3);
                        conductor.turnLeft();
                        moverNveces(conductor, u-2);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        moverNveces(conductor, 1);
                        conductor.turnLeft();
                        moverNveces(conductor, 2);
                        conductor.turnLeft();
                        moverNveces(conductor, 1);
                        girarEspalda(conductor);
                        break;
                    case 2:
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u);
                        girarDerecha(conductor);
                        moverNveces(conductor, 3);
                        conductor.pickThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 3);
                        conductor.turnLeft();
                        moverNveces(conductor, u-3);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        moverNveces(conductor, 1);
                        conductor.turnLeft();
                        moverNveces(conductor, 3);
                        conductor.turnLeft();
                        moverNveces(conductor, 1);
                        girarEspalda(conductor);
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                switch (disponibilidad){
                    case 0:
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u);
                        girarDerecha(conductor);
                        conductor.move();
                        conductor.pickThing();
                        girarEspalda(conductor);
                        conductor.move();
                        conductor.turnLeft();
                        moverNveces(conductor, u-3);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-3);
                        girarDerecha(conductor);
                        moverNveces(conductor, 2);
                        conductor.pickThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 2);
                        conductor.turnLeft();
                        moverNveces(conductor, u-2);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        moverNveces(conductor, 1);
                        conductor.turnLeft();
                        moverNveces(conductor, 2);
                        conductor.turnLeft();
                        moverNveces(conductor, 1);
                        girarEspalda(conductor);
                        break;
                    case 1:
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u);
                        girarDerecha(conductor);
                        moverNveces(conductor, 2);
                        conductor.pickThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 2);
                        conductor.turnLeft();
                        moverNveces(conductor, u-3);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        moverNveces(conductor, 1);
                        conductor.turnLeft();
                        moverNveces(conductor, 3);
                        conductor.turnLeft();
                        moverNveces(conductor, 1);
                        girarEspalda(conductor);
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                switch (disponibilidad){
                    case 0:
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u);
                        girarDerecha(conductor);
                        conductor.move();
                        conductor.pickThing();
                        girarEspalda(conductor);
                        conductor.move();
                        conductor.turnLeft();
                        moverNveces(conductor, u-3);
                        conductor.turnLeft();
                        conductor.move();
                        conductor.putThing();
                        girarEspalda(conductor);
                        
                        moverNveces(conductor, 1);
                        conductor.turnLeft();
                        moverNveces(conductor, 3);
                        conductor.turnLeft();
                        moverNveces(conductor, 1);
                        girarEspalda(conductor);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }
    
    public static void sacarVehiculo (Robot conductor, Vehiculo vehiculo){
        int seccion = vehiculo.getSeccion().getNumero();
        int u = 7 - seccion;
        int num_vehiculo = 0;
        for (int i=0;i< 5; i++){
            if (vehiculo == vehiculo.getSeccion().getVehiculos()[i] ){
                num_vehiculo = i+1;
                break;
            }
        }
        int v = 6 - num_vehiculo;
        conductor.move();
        girarDerecha(conductor);
        moverNveces(conductor, u);
        girarDerecha(conductor);
        moverNveces(conductor, v);
        conductor.pickThing();
        girarEspalda(conductor);
        moverNveces(conductor, v);
        conductor.turnLeft();
        moverNveces(conductor, u+1);
        conductor.putThing();
        girarEspalda(conductor);
        conductor.move();
        girarDerecha(conductor);
        conductor.move();
        girarEspalda(conductor);
    }    
     
    public static void regresarDeZT (Robot conductor, Vehiculo vehiculo){
        int seccion = vehiculo.getSeccion().getNumero();
        int num_vehiculo = 0;
        for (int i=0;i< 5; i++){
            if (vehiculo == vehiculo.getSeccion().getVehiculos()[i] ){
                num_vehiculo = i+1;
                break;
            }
        }
        int disponibilidad = vehiculo.getSeccion().getDisponibilidad();
        int u = 7 - seccion;
        switch (num_vehiculo){
            case 1:
                switch (disponibilidad){
                    case 0:
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u);
                        girarDerecha(conductor);
                        moverNveces(conductor, 5);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 5);
                        conductor.turnLeft();
                        moverNveces(conductor, u-1);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-1);
                        girarDerecha(conductor);
                        moverNveces(conductor, 4);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 4);
                        conductor.turnLeft();
                        moverNveces(conductor, u-2);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-2);
                        girarDerecha(conductor);
                        moverNveces(conductor, 3);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 3);
                        conductor.turnLeft();
                        moverNveces(conductor, u-3);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-3);
                        girarDerecha(conductor);
                        moverNveces(conductor, 2);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 2);
                        conductor.turnLeft();
                        moverNveces(conductor, u);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        break;
                    case 1:
                        conductor.move();
                        girarDerecha(conductor);
                        conductor.move();
                        girarDerecha(conductor);
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-1);
                        girarDerecha(conductor);
                        moverNveces(conductor, 5);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 5);
                        conductor.turnLeft();
                        moverNveces(conductor, u-2);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-2);
                        girarDerecha(conductor);
                        moverNveces(conductor, 4);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 4);
                        conductor.turnLeft();
                        moverNveces(conductor, u-3);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-3);
                        girarDerecha(conductor);
                        moverNveces(conductor, 3);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 3);
                        conductor.turnLeft();
                        moverNveces(conductor, u);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        break;
                    case 2:
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, 2);
                        girarDerecha(conductor);
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-2);
                        girarDerecha(conductor);
                        moverNveces(conductor, 5);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 5);
                        conductor.turnLeft();
                        moverNveces(conductor, u-3);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-3);
                        girarDerecha(conductor);
                        moverNveces(conductor, 4);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 4);
                        conductor.turnLeft();
                        moverNveces(conductor, u);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        break;
                    case 3:
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, 3);
                        girarDerecha(conductor);
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-3);
                        girarDerecha(conductor);
                        moverNveces(conductor, 5);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 5);
                        conductor.turnLeft();
                        moverNveces(conductor, u);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                switch (disponibilidad){
                    case 0:
                        conductor.move();
                        girarDerecha(conductor);
                        conductor.move();
                        girarDerecha(conductor);
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-1);
                        girarDerecha(conductor);
                        moverNveces(conductor, 4);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 4);
                        conductor.turnLeft();
                        moverNveces(conductor, u-2);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-2);
                        girarDerecha(conductor);
                        moverNveces(conductor, 3);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 3);
                        conductor.turnLeft();
                        moverNveces(conductor, u-3);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-3);
                        girarDerecha(conductor);
                        moverNveces(conductor, 2);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 2);
                        conductor.turnLeft();
                        moverNveces(conductor, u);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        break;
                    case 1:
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, 2);
                        girarDerecha(conductor);
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-2);
                        girarDerecha(conductor);
                        moverNveces(conductor, 4);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 4);
                        conductor.turnLeft();
                        moverNveces(conductor, u-3);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-3);
                        girarDerecha(conductor);
                        moverNveces(conductor, 3);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 3);
                        conductor.turnLeft();
                        moverNveces(conductor, u);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        break;
                    case 2:
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, 3);
                        girarDerecha(conductor);
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-3);
                        girarDerecha(conductor);
                        moverNveces(conductor, 4);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 4);
                        conductor.turnLeft();
                        moverNveces(conductor, u);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                switch (disponibilidad){
                    case 0:
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, 2);
                        girarDerecha(conductor);
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-2);
                        girarDerecha(conductor);
                        moverNveces(conductor, 3);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 3);
                        conductor.turnLeft();
                        moverNveces(conductor, u-3);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-3);
                        girarDerecha(conductor);
                        moverNveces(conductor, 2);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 2);
                        conductor.turnLeft();
                        moverNveces(conductor, u);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        break;
                    case 1:
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, 3);
                        girarDerecha(conductor);
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-3);
                        girarDerecha(conductor);
                        moverNveces(conductor, 3);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 3);
                        conductor.turnLeft();
                        moverNveces(conductor, u);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                switch (disponibilidad){
                    case 0:
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, 3);
                        girarDerecha(conductor);
                        conductor.move();
                        girarEspalda(conductor);
                        
                        conductor.pickThing();
                        conductor.move();
                        girarDerecha(conductor);
                        moverNveces(conductor, u-3);
                        girarDerecha(conductor);
                        moverNveces(conductor, 2);
                        conductor.putThing();
                        girarEspalda(conductor);
                        moverNveces(conductor, 2);
                        conductor.turnLeft();
                        moverNveces(conductor, u);
                        conductor.turnLeft();
                        conductor.move();
                        girarEspalda(conductor);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }
    
    public static void main(String[] args){

      //Creando la estructura del parqueadero
   
        City ny = new City();
        Seccion seccion1 = new Seccion(1);
        Seccion seccion2 = new Seccion(2);
        Seccion seccion3 = new Seccion(3);
        Seccion[] secciones = {seccion1, seccion2, seccion3};
        Parqueadero p = new Parqueadero("Parqueadero Santa Rita", ny);
        p.setSecciones(secciones);
        Robot conductor = new Robot (ny, 4, 6, Direction.SOUTH, 1);
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
        Scanner in = new Scanner(System.in);
        //iniciar 
        int continuar = 1, opcion = 0;
        do{
            System.out.println("Bienvenido a " + p.getNombre());
            System.out.println("Tarifa: $55 por minuto");
            System.out.println("1. Ingresar vehiculo");
            System.out.println("2. Sacar vehiculo");
            System.out.println("3. Mostrar vehículos de una seccion");
            System.out.println("4. Mostrar ingresos");
            System.out.println(" ");
            opcion = in.nextInt();
            switch (opcion){
                case 1:
                    if (((p.getSecciones()[0].getDisponibilidad() != 0) || (p.getSecciones()[1].getDisponibilidad() != 0)) || (p.getSecciones()[2].getDisponibilidad() != 0)){
                        System.out.println("Ingrese placa del vehiculo: ");
                        String placa = in.next();
                        System.out.println("Ingrese horas del dia ya transcurridas (0 a 23): ");
                        int horas = in.nextInt();
                        System.out.println("Ingrese minutos transcurridos sin contar las horas ingresadas previamente (0 a 59): ");
                        int minutos = in.nextInt();
                        System.out.println(" ");
                        int horaIngreso = (horas*60) + minutos;
                        Seccion menos_ocupada = p.seccionMenosOcupada();
                        Vehiculo vai = new Vehiculo(placa, horaIngreso, menos_ocupada);
                        ubicarVehiculo(conductor, vai);
                        System.out.println("El vehiculo de placa " + vai.getPlaca() + " quedo ubicado en la seccion " + vai.getSeccion().getNumero());
                        break;
                    }else{
                        System.out.println("Actualmente no hay espacio para ingresar vehiculos en el parqueadero");
                        break;
                    }
                case 2:
                    System.out.println("Ingrese seccion donde se encuentra el vehiculo (1, 2 o 3): ");
                    int numseccion = in.nextInt();
                    if ((numseccion < 1)||(numseccion > 3)){
                        System.out.println("Seccion no existente");
                        break;
                    }
                    Seccion seccion = null;
                    for(int i = 0; i < 3; i++){
                        if(numseccion == p.getSecciones()[i].getNumero()){
                                seccion = p.getSecciones()[i];
                        }
                    }
                    if (seccion.getDisponibilidad() == 5){
                        System.out.println("La seccion " + numseccion + " no tiene vehiculos actualmente");
                        break;
                    }
                    seccion.mostrarVehiculos();
                    System.out.println("Ingrese placa del vehiculo que desea sacar: ");
                    String placa = in.next();
                    Vehiculo vas = null;
                    for(int i = 0; i < (5 - seccion.getDisponibilidad()); i++){
                        if(seccion.getVehiculos()[i].getPlaca().equals(placa)){
                                vas = seccion.getVehiculos()[i];
                        }
                    }
                    if (vas == null){
                        System.out.println("Placa " + placa + " no coincide con ningun vehiculo de la seccion " + seccion.getNumero());
                        break;
                    }
                    System.out.println("Ingrese horas del dia ya transcurridas (0 a 23): ");
                        int horas = in.nextInt();
                        System.out.println("Ingrese minutos transcurridos sin contar las horas ingresadas previamente (0 a 59): ");
                        int minutos = in.nextInt();
                        int horaSalida = (horas*60) + minutos;
                        vas.setHoraSalida(horaSalida);
                        p.registrarPago(vas);
                        ubicarEnZT(conductor, vas);
                        sacarVehiculo(conductor, vas);
                        regresarDeZT(conductor, vas);
                        p.eliminarVehiculo(vas);
                    break;
                case 3:
                    System.out.println("Ingrese numero de seccion (1, 2 o  3): ");
                    int num_seccion = in.nextInt();
                    if ((num_seccion > 0)||(num_seccion < 4)){
                        Seccion seccion_ = null;
                        for(int i = 0; i < 3; i++){
                            if(num_seccion == p.getSecciones()[i].getNumero()){
                                seccion_ = p.getSecciones()[i];
                                break;
                            }
                        }
                        seccion_.mostrarVehiculos();
                        break;
                    }else{
                        System.out.println("Seccion no existente");
                        break;
                    }    
                case 4:
                    System.out.println("Total de ingresos obtenidos durante la jornada: $" + p.getIngresos());
                    break;
            }
        }while(continuar == 1);
    
    }
   }

