/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TraduccionDiagramaClases;

/**
 *
 * @author Nicolas Garcia y Juan David Jaime
 */
public class CarModel {
    private Category category;
    private int price;
    private String modelNumber;

    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public CarModel(Category category, int price, String modelNumber) {
        this.category = category;
        this.price = price;
        this.modelNumber = modelNumber;
    }
            
}
