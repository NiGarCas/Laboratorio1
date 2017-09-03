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
public class Car {
    private CarModel model;
    private int traveled;

    public void setTraveled(int traveled) {
        this.traveled = traveled;
    }

    public Car(CarModel model, int traveled) {
        this.model = model;
        this.traveled = traveled;
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
