/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TraduccionDiagramaClases;
import java.util.*;

/**
 *
 * @author nicol
 */
public class Main {
    public static void main (String [] args){
        Scanner lectura = new Scanner (System.in);
        System.out.println("BIENVENIDO");
        System.out.println("Por favor ingrese datos de la direccion de la tienda:");
        System.out.println("Casa: ");
        String casa = lectura.next();
        System.out.println("Condado: ");
        String condado = lectura.next();
        System.out.println("Codigo postal: ");
        String codigo_postal = lectura.next();
        Address direccion = new Address (casa, condado, codigo_postal);
        Store store = new Store (direccion);
        int salir = 0;
        int opcion;
        int opcion2;
        do{
            System.out.println("MENU:");
            System.out.println(" ");
            System.out.println("1. Registrar informacion.");
            System.out.println("2. Mostrar lista de carros.");
            System.out.println(" ");
            opcion = lectura.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Opciones:");
                    System.out.println(" ");
                    System.out.println("1. Crear carro");
                    System.out.println("2. Crear modelo");
                    System.out.println("3. Crear categoria");
                    System.out.println(" ");
                    break;
                case 2:
                    for (int i = 0; i < store.getNumcarros(); i++){
                        System.out.println("CARRO #" + (i+1));
                        System.out.println("Modelo: " + store.getCar()[i].getModel());
                        System.out.println("Categoría: " + store.getCar()[i].getModel().getCategory().getName());
                        System.out.println(" ");
                    }
                    break;
            }
        }while (salir == 0);
   }
}

