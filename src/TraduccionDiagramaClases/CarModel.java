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
public class CarModel {
    private Category category;
    private int price;
    private String modelnumber;

    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public String getModelnumber() {
        return modelnumber;
    }

    public CarModel(Category category, int Price, String modelnumber) {
        this.category = category;
        this.price = price;
        this.modelnumber = modelnumber;
    }
    public void agregarcategoria(String category){
        Category categoria=new Category(category);
       
    }
    
            
}
