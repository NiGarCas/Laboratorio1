/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TraduccionDiagramaClases;

/**
 *
 * @author El Nicolas Garcia y Juan David Jaime
 */
public class Car {
    private CarModel model;
    private int traveled;

    public void setTraveled(int traveled) {
        this.traveled = traveled;
    }

    public Car(CarModel model) {
        this.model = model;
        this.traveled = 0;
    }

    public CarModel getModel() {
        return model;
    }

    public int getTraveled() {
        return traveled;
    }
    public void agregarCarModel(Category category, int price, String modelnumber){ 
        CarModel carmodel=new CarModel(category,price, modelnumber);
    
    }
    
}
