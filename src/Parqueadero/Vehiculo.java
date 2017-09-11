/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueadero;
import becker.robots.*;
import becker.robots.icons.Icon;
import java.util.*;
/**
 *
 * @author Nicolas Garcia y Juan David Jaime
 */
public class Vehiculo {
    
    private String placa;
    private int horaIngreso;
    private int horaSalida;
    private Seccion seccion;
    private Thing thing;

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public void setHoraIngreso(int horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public void setThing(Thing thing) {
        this.thing = thing;
    }

    public String getPlaca() {
        return placa;
    }
    
    public int getHoraIngreso() {
        return horaIngreso;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public Thing getThing() {
        return thing;
    }
    
    public Vehiculo(String placa, int horaIngreso, Seccion seccion) {
        this.placa = placa;
        this.horaIngreso = horaIngreso;
        this.horaSalida = 0;
        this.seccion = seccion;
        this.thing = new Thing (seccion.getParqueadero().getCiudad(),5,6);
    }
    
}
