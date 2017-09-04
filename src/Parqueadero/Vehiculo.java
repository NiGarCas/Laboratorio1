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
public class Vehiculo extends Thing {
    private int placa;
//    private int  horaactual;
//    Calendar calendario = Calendar.getInstance();
// int hora =calendario.get(Calendar.HOUR_OF_DAY);
//int minutos = calendario.get(Calendar.MINUTE);




    
  

    public Vehiculo(int placa, City city, int i, int i1) {
        super(city, i, i1);
        this.placa = placa;
    }

   



    
    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    
    
}
