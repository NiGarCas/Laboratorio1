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
 * @author El PcGamer
 */
public class Vehiculo extends Thing {
    private int placa;

    public Vehiculo(int placa, City city, int i, int i1, Direction drctn, boolean bln, Icon icon) {
        super(city, i, i1, drctn, bln, icon);
        this.placa = placa;
    }

    public Vehiculo(int placa, City city, int i, int i1) {
        super(city, i, i1);
        this.placa = placa;
    }

    public Vehiculo(int placa, City city, int i, int i1, Direction drctn) {
        super(city, i, i1, drctn);
        this.placa = placa;
    }

    public Vehiculo(int placa, Robot robot) {
        super(robot);
        this.placa = placa;
    }



    
    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    
    
}
