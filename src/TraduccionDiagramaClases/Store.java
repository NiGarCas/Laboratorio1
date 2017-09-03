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

    public Car[] getCar() {
        return car;
    }

    public int getNumcarros() {
        return numcarros;
    }
   
    public Store(Address address) {
        this.address = address;
        this.car=new Car[20];
        this.numcarros=0;
    }
    public void addCar(CarModel model){
        if (this.numcarros < 20){
            Car car=new Car(model);
            this.numcarros++;
        }
    }
}
