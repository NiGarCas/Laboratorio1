/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TraduccionDiagramaClases;

/**
 *
 * @author El PcGamer
 */
public class Store {
    private Address address;
    private Car[] car;
   private int numcarros;
    public Store(Address address) {
        this.address = address;
        this.car=new Car[20];
        this.numcarros=0;
    }
    public void addCar(CarModel model, int traveled){
    Car car=new Car(model,traveled );
    }
}
