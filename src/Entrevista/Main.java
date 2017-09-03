/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrevista;
import java.util.*;

/**
 *
 * @author Nicolas Garcia y Juan David Jaime
 */
public class Main {
    public static void main (String [] args){
        Scanner lectura = new Scanner (System.in);
        Mes enero = new Mes ("enero", 1, 31);
        Mes febrero = new Mes ("febrero", 2, 28);
        Mes marzo = new Mes ("marzo", 3, 31);
        Mes abril = new Mes ("abril", 4, 30);
        Mes mayo = new Mes ("mayo", 5, 31);
        Mes junio = new Mes ("junio", 6, 30);
        Mes julio = new Mes ("julio", 7, 31);
        Mes agosto = new Mes ("agosto", 8, 31);
        Mes septiembre = new Mes ("septiembre", 9, 30);
        Mes octubre = new Mes ("octubre", 10, 31);
        Mes noviembre = new Mes ("noviembre", 11, 30);
        Mes diciembre = new Mes ("diciembre", 12, 31);
        Mes[] meses = {enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre};
        SuperMercado x = new SuperMercado ("Supermercado", 1, enero);
        Empleado[] empleados = new Empleado[7];
        for (int n = 0; n < 7; n++){
            empleados[n] = new Empleado (n+1);
        }
        x.setEmpleados(empleados);
        int salir = 0;
        int opcion;
        int opcion2;
        do{
            System.out.println("SUPERMERCADO");
            System.out.println("DIA: " + x.getDia()+ " de " + x.getMes().getNombre());
            System.out.println("MENU:");
            System.out.println(" ");
            System.out.println("1. Productos (Agregar, registrar venta, hacer pedido, mostrar costo, cambiar precio).");
            System.out.println("2. Inventarios.");
            System.out.println("3. Proovedores / Facturas.");
            System.out.println("4. Nomina.");
            System.out.println("5. Pasar al dia siguiente.");
            System.out.println(" ");
            opcion = lectura.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Productos - opciones disponibles:");
                    System.out.println(" ");
                    System.out.println("1. Agregar producto al supermercado.");
                    System.out.println("2. Registrar venta de un producto.");
                    System.out.println("3. Hacer pedido de un producto.");
                    System.out.println("4. Revisar costo de un producto.");
                    System.out.println("5. Cambiar precio de un producto.");
                    System.out.println(" ");
                    opcion2 = lectura.nextInt();
                    switch (opcion2){
                        case 1:
                            System.out.println("Ingrese nombre del producto:");
                            String nombre = lectura.next();
                            System.out.println("Ingrese nombre del proovedor del producto:");
                            String proovedor = lectura.next();
                            System.out.println("Ingrese costo del producto ($):");
                            double costo = lectura.nextDouble();
                            System.out.println("Ingrese precio del producto ($):");
                            double precio = lectura.nextDouble();
                            x.agregarProducto(nombre, proovedor, costo, precio);
                            break;
                        case 2:
                            System.out.println("Ingrese nombre del producto:");
                            String nombreproducto = lectura.next();
                            System.out.println("Ingrese cantidad  que desea vender:");
                            int cantidad = lectura.nextInt();
                            boolean existe = false;
                            for(int i = 0; i< x.getNum_productos(); i++){
                                if (x.getProductos()[i].getNombre().equals(nombreproducto)){
                                x.registrarVentaProducto(x.getProductos()[i], cantidad);
                                existe = true;
                                break;
                                }
                            }
                            if (existe == false){
                            System.out.println("El nombre dado no corresponde a ningun producto del supermercado");
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese nombre del producto:");
                            String nombreproducto_ = lectura.next();
                            System.out.println("Ingrese cantidad  que desea pedir:");
                            int cantidad_ = lectura.nextInt();
                            int num_mes = 0;
                            Mes mes = new Mes ("provisional", 0, 0);
                            do {
                                System.out.println("Ingrese numero del mes (1 a 12) en que vence el plazo para pagar pedido:");
                                num_mes = lectura.nextInt();
                            }while ((num_mes < 1) || (num_mes > 12));
                            for (int i = 0; i < 12; i++){
                                if (meses[i].getNumero() == num_mes){
                                    mes = meses[i];
                                }
                            }
                            int num_dia = 0;
                            do {
                                System.out.println("Ingrese numero del dia (1 a " + mes.getNumero_dias() +") en que vence el plazo para pagar pedido:");
                                num_dia = lectura.nextInt();
                            }while ((num_dia < 1) || (num_dia > mes.getNumero_dias()));
                            boolean existe_ = false;
                            for(int i = 0; i< x.getNum_productos(); i++){
                                if (x.getProductos()[i].getNombre().equals(nombreproducto_)){
                                x.hacerPedidoProducto(x.getProductos()[i], cantidad_, num_dia, mes);
                                existe_ = true;
                                break;
                                }
                            }
                            if (existe_ == false){
                            System.out.println("El nombre dado no corresponde a ningun producto del supermercado");
                            }
                            break;
                        case 4:
                            System.out.println("Ingrese nombre del producto cuyo costo desea revisar: ");
                            String name = lectura.next();
                            x.mostrarCostoProducto(name);
                            break;
                        case 5:
                            System.out.println("Ingrese nombre del producto cuyo precio desea cambiar: ");
                            String name_ = lectura.next();
                            System.out.println("Ingrese nuevo precio del producto ($): ");
                            double precio_ = lectura.nextDouble();
                            x.cambiarPrecioProducto(name_, precio_);
                            break;
                        default:
                            System.out.println("OPCION NO DISPONIBLE");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Inventarios - opciones disponibles:");
                    System.out.println(" ");
                    System.out.println("1. Revisar ventas segun dia.");
                    System.out.println("2. Revisar compras segun dia.");
                    System.out.println("3. Revisar gastos segun dia.");
                    System.out.println("4. Mostrar productos segun numero de ventas ( mas ventas a menos ventas).");
                    System.out.println("5. Mostrar productos segun cantidad actual (menor cantidad a mayor cantidad).");
                    System.out.println(" ");
                    opcion2 = lectura.nextInt();
                    switch (opcion2){
                        case 1:
                            int num_mes = 0;
                            Mes mes = new Mes ("provisional", 0, 0);
                            do {
                                System.out.println("Ingrese numero del mes (1 a 12) en que vence el plazo para pagar pedido:");
                                num_mes = lectura.nextInt();
                            }while ((num_mes < 1) || (num_mes > 12));
                            for (int i = 0; i < 12; i++){
                                if (meses[i].getNumero() == num_mes){
                                    mes = meses[i];
                                }
                            }
                            int num_dia = 0;
                            do {
                                System.out.println("Ingrese numero del dia (1 a " + mes.getNumero_dias() +") en que vence el plazo para pagar pedido:");
                                num_dia = lectura.nextInt();
                            }while ((num_dia < 1) || (num_dia > mes.getNumero_dias()));
                            x.mostrarVentasDia(num_dia, mes);
                            break;
                        case 2:
                            int nummes = 0;
                            Mes mess = new Mes ("provisional", 0, 0);
                            do {
                                System.out.println("Ingrese numero del mes (1 a 12) en que vence el plazo para pagar pedido:");
                                nummes = lectura.nextInt();
                            }while ((nummes < 1) || (nummes > 12));
                            for (int i = 0; i < 12; i++){
                                if (meses[i].getNumero() == nummes){
                                    mess = meses[i];
                                }
                            }
                            int numdia = 0;
                            do {
                                System.out.println("Ingrese numero del dia (1 a " + mess.getNumero_dias() +") en que vence el plazo para pagar pedido:");
                                numdia = lectura.nextInt();
                            }while ((numdia < 1) || (numdia > mess.getNumero_dias()));
                            x.mostrarComprasDia(numdia, mess);
                            break;
                        case 3:
                            int num_mes_ = 0;
                            Mes mes_ = new Mes ("provisional", 0, 0);
                            do {
                                System.out.println("Ingrese numero del mes (1 a 12) en que vence el plazo para pagar pedido:");
                                num_mes_ = lectura.nextInt();
                            }while ((num_mes_ < 1) || (num_mes_ > 12));
                            for (int i = 0; i < 12; i++){
                                if (meses[i].getNumero() == num_mes_){
                                    mes_ = meses[i];
                                }
                            }
                            int num_dia_ = 0;
                            do {
                                System.out.println("Ingrese numero del dia (1 a " + mes_.getNumero_dias() +") en que vence el plazo para pagar pedido:");
                                num_dia_ = lectura.nextInt();
                            }while ((num_dia_ < 1) || (num_dia_ > mes_.getNumero_dias()));
                            x.mostrarGastosDia(num_dia_, mes_);
                            break;
                        case 4:
                            x.mostrarProductosVentas();
                            break;
                        case 5:
                            x.mostrarProductosCantidadActual();
                            break;
                        default:
                            System.out.println("OPCION NO DISPONIBLE");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Proovedores/Facturas - opciones disponibles:");
                    System.out.println(" ");
                    System.out.println("1. Mostrar facturas de determinado proovedor.");
                    System.out.println("2. Mostrar facturas segun plazo de pago (mas urgente a menos urgente).");
                    System.out.println("3. Registrar pago de una factura.");
                    System.out.println(" ");
                    opcion2 = lectura.nextInt();
                    switch (opcion2){
                        case 1:
                            System.out.println("Ingrese nombre del proovedor: ");
                            String proovedor = lectura.next();
                            x.mostrarFacturasProovedor(proovedor);
                            break;
                        case 2:
                            x.mostrarFacturasFechaPlazo();
                            break;
                        case 3:
                            if (x.getNum_facturas() == 0){
                                System.out.println("Actualmente no hay facturas por pagar");
                                break;
                            }
                            System.out.println("LISTA DE FACTURAS: ");
                            for (int i = 0; i < x.getNum_facturas(); i++){
                                System.out.println("Factura #" + (i+1));
                                System.out.println("Proovedor: " + x.getFacturas()[i].getProovedor());
                                System.out.println("Producto: " + x.getFacturas()[i].getProducto().getNombre());
                                System.out.println("Valor: $" + x.getFacturas()[i].getValor());
                                System.out.println("Fecha pedido: "+ x.getFacturas()[i].getDia_creado()+ " de " + x.getFacturas()[i].getMes_creado().getNombre());
                                System.out.println("Maximo plazo para pagar: "+ x.getFacturas()[i].getDia_vence()+ " de " + x.getFacturas()[i].getMes_vence().getNombre());
                                System.out.println(" ");
                            }
                            int numfac = 0;
                            do{
                                System.out.println("Escriba numero de factura cuyo pago desea registrar");
                                numfac = lectura.nextInt();
                            }while ((numfac < 1)||(numfac > x.getNum_facturas()));
                            x.registrarPagoFactura(numfac);
                            break;
                        default:
                            System.out.println("OPCION NO DISPONIBLE");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Nomina - opciones disponibles:");
                    System.out.println(" ");
                    System.out.println("1. Calcular salario y registrar su pago.");
                    System.out.println("2. Calcular liquidacion y registrar su pago.");
                    System.out.println(" ");
                    opcion2 = lectura.nextInt();
                    switch (opcion2){
                        case 1:
                            int empleado = 0;
                            do{
                                System.out.println("Introduza numero de empleado (1 al 7):");
                                empleado = lectura.nextInt();
                            }while ((empleado < 1)||(empleado > 7));
                            System.out.println("Introduza horas normales trabajadas por el empleado durante el mes:");
                            int hn = lectura.nextInt();
                            System.out.println("Introduza horas extra trabajadas por el empleado durante el mes:");
                            int he = lectura.nextInt();
                            System.out.println("Introduza horas trabajadas por el empleado durante el mes en dias festivos:");
                            int hf = lectura.nextInt();
                            x.salarioMensual(x.getEmpleados()[empleado - 1], hn, he, hf);
                            break;
                        case 2:
                            int empleado_ = 0;
                            do{
                                System.out.println("Introduza numero de empleado (1 al 7):");
                                empleado_ = lectura.nextInt();
                            }while ((empleado_ < 1)||(empleado_ > 7));
                            System.out.println("Introduza horas normales trabajadas por el empleado durante el anio:");
                            int hn_ = lectura.nextInt();
                            System.out.println("Introduza horas extra trabajadas por el empleado durante el anio:");
                            int he_ = lectura.nextInt();
                            System.out.println("Introduza horas trabajadas por el empleado durante el anio en dias festivos:");
                            int hf_ = lectura.nextInt();
                            x.liquidacion(x.getEmpleados()[empleado_ - 1], hn_, he_, hf_);
                            break;
                        default:
                            System.out.println("OPCION NO DISPONIBLE");
                            break;
                    }
                    break;
                case 5:
                    System.out.println(x.getMes().getNumero());
                    System.out.println(x.getDia());
                    x.cambiarDeDia(x.getMes().getNumero(), x.getDia());
                    break;
                default:
                    System.out.println("OPCION NO DISPONIBLE");
                    break;
            }
        }while (salir == 0);
    }
    
}
