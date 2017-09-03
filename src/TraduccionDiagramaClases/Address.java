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
public class Address {
    private String house;
    private String country;
    private String postcode;

   

    public String getHouse() {
        return house;
    }

    public String getCountry() {
        return country;
    }

    public String getPostcode() {
        return postcode;
    }
     public Address(String house, String country, String postcode) {
        this.house = house;
        this.country = country;
        this.postcode = postcode;
    }
    
}
