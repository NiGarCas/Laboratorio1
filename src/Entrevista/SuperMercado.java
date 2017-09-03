/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrevista;

/**
 *
 * @author Nicolas Garcia y Juan David Jaime
 */
public class SuperMercado {
    private String nombre;
    private int dia;
    private Mes mes;
    private Producto[] productos;
    private Factura[] facturas;
    private Venta[] ventas;
    private Compra[] compras;
    private Gasto[] gastos;
    private Empleado[] empleados;
    private int num_productos;
    private int num_facturas;
    private int num_ventas;
    private int num_compras;
    private int num_gastos;

    public String getNombre() {
        return nombre;
    }

    public int getDia() {
        return dia;
    }

    public Mes getMes() {
        return mes;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public Factura[] getFacturas() {
        return facturas;
    }

    public Venta[] getVentas() {
        return ventas;
    }

    public Compra[] getCompras() {
        return compras;
    }

    public Gasto[] getGastos() {
        return gastos;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public int getNum_productos() {
        return num_productos;
    }

    public int getNum_facturas() {
        return num_facturas;
    }

    public int getNum_ventas() {
        return num_ventas;
    }

    public int getNum_compras() {
        return num_compras;
    }

    public int getNum_gastos() {
        return num_gastos;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public void setFacturas(Factura[] facturas) {
        this.facturas = facturas;
    }

    public void setVentas(Venta[] ventas) {
        this.ventas = ventas;
    }

    public void setCompras(Compra[] compras) {
        this.compras = compras;
    }

    public void setGastos(Gasto[] gastos) {
        this.gastos = gastos;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void setNum_productos(int num_productos) {
        this.num_productos = num_productos;
    }

    public void setNum_facturas(int num_facturas) {
        this.num_facturas = num_facturas;
    }

    public void setNum_ventas(int num_ventas) {
        this.num_ventas = num_ventas;
    }

    public void setNum_compras(int num_compras) {
        this.num_compras = num_compras;
    }

    public void setNum_gastos(int num_gastos) {
        this.num_gastos = num_gastos;
    }

    public SuperMercado(String nombre, int dia, Mes mes) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.productos = new Producto[1000];
        this.facturas =new Factura[1000];
        this.ventas =new Venta[1000];
        this.compras =new Compra[1000];
        this.gastos =new Gasto[1000];
        this.empleados = new Empleado[7];
        this.num_productos = 0;
        this.num_facturas = 0;
        this.num_ventas = 0;
        this.num_compras = 0;
        this.num_gastos = 0;
    }
    
    public void agregarProducto(String nombre, String proovedor, double costo, double precio){
        Producto producto = new Producto(nombre, proovedor, costo, precio);
        if(this.num_productos < 1000){
            this.productos[this.num_productos] = producto;
            this.num_productos++;
            System.out.println("Producto agregado exitosamente");
        }else{
            System.out.println("No es posible agregar producto. Se ha excedido limite de cantidad de productos");
        }    
    }

    public void registrarVentaProducto(Producto producto, int cantidad){
        if (cantidad <= producto.getCantidad_actual()){
            Venta venta = new Venta(producto, cantidad, (producto.getPrecio() * cantidad), this.getDia(), this.getMes());
            if(this.num_ventas < 1000){
                this.ventas[this.num_ventas] = venta;
                this.num_ventas++;
                producto.setCantidad_actual(producto.getCantidad_actual()- cantidad);
                producto.setCantidad_vendida(producto.getCantidad_vendida() + cantidad);
                System.out.println("Venta registrada exitosamente");
                System.out.println("Cantidad actual de " + producto.getNombre() + ": " + producto.getCantidad_actual());
            }else{
                System.out.println("No es posible registrar venta. Se ha excedido el limite de numero de ventas");
            }
        }else{
            System.out.println("No es posible registrar venta. No hay suficiente cantidad de ese producto");
        }
    }
    
    public void hacerPedidoProducto(Producto producto, int cantidad, int dia_plazo, Mes mes_plazo){
        Factura factura = new Factura(producto, cantidad, producto.getCosto() * cantidad, this.getDia(), this.getMes(), dia_plazo, mes_plazo);
        if(this.num_facturas < 1000){
                this.facturas[this.num_facturas] = factura;
                this.num_facturas++;
                producto.setCantidad_actual(producto.getCantidad_actual() + cantidad);
                System.out.println("Pedido realizado exitosamente. Recuerde pagar cuanto antes la factura");
                System.out.println("Cantidad actual de " + producto.getNombre() + ": " + producto.getCantidad_actual());
            }else{
                System.out.println("No es posible realizar pedido. Se ha exedido el limite de numero de facturas");
            }
        
    }
    
    public void mostrarFacturasProovedor (String Proovedor){
        boolean existe = false;
        for(int i = 0; i< this.num_facturas; i++){
            if (this.facturas[i].getProovedor().equals(Proovedor)){
                System.out.println("FACTURA A PAGAR #" + (i+1));
                System.out.println("Fecha de creacion: " + this.facturas[i].getDia_creado()+ " / " + this.facturas[i].getMes_creado().getNombre());
                System.out.println("Plazo maximo para pagar: " + this.facturas[i].getDia_vence()+ " / " + this.facturas[i].getMes_vence().getNombre());
                System.out.println("Producto: " + this.facturas[i].getProducto().getNombre());
                System.out.println("Cantidad: " + this.facturas[i].getCantidad());
                System.out.println("Valor a pagar: $" + this.facturas[i].getValor());
                System.out.println(" ");
                existe = true;
            }
        }
        if (existe == false){
            System.out.println("El nombre dado no corresponde a ningun proovedor del supermercado");
        }
    }
    
    public void mostrarFacturasFechaPlazo (){
        for(int i=0; i<(this.num_facturas - 1); i++){
            int min = i;
            for(int j=i+1;j < this.num_facturas;j++){
                if(this.facturas[j].getMes_vence().getNumero() < this.facturas[min].getMes_vence().getNumero()){
                    min = j;
                }
            }
            if(i!= min){
                Factura aux = this.facturas[i];
                this.facturas[i]=this.facturas[min];
                this.facturas[min] = aux;
            }
        }
        int primero_mes = 0;
        int z;
        for (z = 0; z < this.num_facturas - 1; z++){
            if ((this.facturas[z].getMes_vence().getNumero() == this.facturas[z+1].getMes_vence().getNumero())|| (z == this.num_facturas - 2)){
                for(int i= primero_mes; i<(z - 1); i++){
                    int min = i;
                    for(int j = i+1;j < z;j++){
                        if(this.facturas[j].getMes_vence().getNumero() < this.facturas[min].getMes_vence().getNumero()){
                            min = j;
                        }
                    }
                    if(i!= min){
                        Factura aux = this.facturas[i];
                        this.facturas[i]=this.facturas[min];
                        this.facturas[min] = aux;
                    }
                }
                primero_mes = z + 1;
            }
        }
        for(int i = 0; i< this.num_facturas; i++){
            System.out.println("FACTURA A PAGAR #" + (i+1));
            System.out.println("Fecha de creacion: " + this.facturas[i].getDia_creado()+ " / " + this.facturas[i].getMes_creado().getNombre());
            System.out.println("Plazo maximo para pagar: " + this.facturas[i].getDia_vence()+ " / " + this.facturas[i].getMes_vence().getNombre());
            System.out.println("Producto: " + this.facturas[i].getProducto().getNombre());
            System.out.println("Cantidad: " + this.facturas[i].getCantidad());
            System.out.println("Valor a pagar: $" + this.facturas[i].getValor());
            System.out.println(" ");  
        }
    }
    
    public void registrarPagoFactura (int numero_factura){
        int i = numero_factura - 1;
        Factura factura = this.facturas[i];
        Compra compra = new Compra(factura.getProducto(), factura.getCantidad(), factura.getValor(), this.getDia(), this.getMes());
        if(this.num_facturas > 0){
                    this.facturas[i]=null;
                    for(int j = i; j < this.num_facturas; j++){
                        this.facturas[j] =this.facturas[j+1];
                    }
                    this.num_facturas--;
                    System.out.println("Pago registrado correctamente");    
        }else{
            System.out.println("No es posible realizar pago. No hay facturas por pagar");
       }
    }
    
    public void mostrarProductosVentas (){
        for(int i=0; i<(this.num_productos - 1); i++){
            int max = i;
            for(int j=i+1;j < this.num_productos;j++){
                if(this.productos[j].getCantidad_vendida() > this.productos[max].getCantidad_vendida()){
                    max = j;
                }
            }
            if(i!= max){
                Producto aux = this.productos[i];
                this.productos[i]=this.productos[max];
                this.productos[max] = aux;
            }
        }
        for (int k = 0; k < this.num_productos; k++){
            System.out.println(this.productos[k].getNombre() +": "+ this.productos[k].getCantidad_vendida() + " unidades vendidas");
        }
    }
    
    public void mostrarProductosCantidadActual (){
        for(int i=0; i<(this.num_productos - 1); i++){
            int min = i;
            for(int j=i+1;j < this.num_productos;j++){
                if(this.productos[j].getCantidad_actual() < this.productos[min].getCantidad_actual()){
                    min = j;
                }
            }
            if(i!= min){
                Producto aux = this.productos[i];
                this.productos[i]=this.productos[min];
                this.productos[min] = aux;
            }
        }
        for (int k = 0; k < this.num_productos; k++){
            System.out.println(this.productos[k].getNombre() +": "+ this.productos[k].getCantidad_actual() + " unidades disponibles para venta");
        }
    }
    
    public void mostrarVentasDia (int dia, Mes mes){
        boolean existe = false;
        for(int i = 0; i< this.num_ventas; i++){
            if ((this.ventas[i].getDia() == dia)&&(this.ventas[i].getMes().getNumero() == mes.getNumero())){
                System.out.println("VENTA #" + (i+1));
                System.out.println("Producto: " + this.ventas[i].getProducto().getNombre());
                System.out.println("Cantidad: " + this.ventas[i].getCantidad());
                System.out.println("Valor total: " + this.ventas[i].getValor_total());
                System.out.println(" ");
                existe = true;
            }
        }
        if (existe == false){
            System.out.println("En el dia seleccionado no hubo ventas");
        }
    }
    
    public void mostrarComprasDia (int dia, Mes mes){
        boolean existe = false;
        for(int i = 0; i< this.num_compras; i++){
            if ((this.compras[i].getDia() == dia)&&(this.compras[i].getMes().getNumero() == mes.getNumero())){
                System.out.println("COMPRA #" + (i+1));
                System.out.println("Producto: " + this.compras[i].getProducto().getNombre());
                System.out.println("Cantidad: " + this.compras[i].getCantidad());
                System.out.println("Valor total: " + this.compras[i].getValor_total());
                System.out.println(" ");
                existe = true;
            }
        }
        if (existe == false){
            System.out.println("En el dia seleccionado no hubo compras");
        }
    }
    
    public void mostrarGastosDia (int dia, Mes mes){
        boolean existe = false;
        for(int i = 0; i< this.num_gastos; i++){
            if ((this.gastos[i].getDia() == dia)&&(this.gastos[i].getMes().getNumero() == mes.getNumero())){
                System.out.println("GASTO #" + (i+1));
                System.out.println("Asunto: " + this.gastos[i].getAsunto());
                System.out.println("Empleado: " + this.gastos[i].getEmpleado().getNumero());
                System.out.println("Valor: " + this.gastos[i].getValor());
                System.out.println(" ");
                existe = true;
            }
        }
        if (existe == false){
            System.out.println("En el dia seleccionado no hubo gastos");
        }
    }
    
    public void mostrarCostoProducto(String nombre_producto){
        boolean existe = false;
        for(int i = 0; i< this.num_productos; i++){
            if (this.productos[i].getNombre().equals(nombre_producto)){
                System.out.println("Costo de " + this.productos[i].getNombre() + " = $" + this.productos[i].getCosto());
                existe = true;
                break;
            }
        }
        if (existe == false){
            System.out.println("El nombre dado no corresponde a ningun producto del supermercado");
        }
    }
    
    public void cambiarPrecioProducto (String nombre_producto, double nuevo_precio){
        boolean existe = false;
        for(int i = 0; i< this.num_productos; i++){
            if (this.productos[i].getNombre().equals(nombre_producto)){
                Producto producto = this.productos[i];
                System.out.println("Cambio de precio realizado exitosamente");
                System.out.println("Anterior precio de " + producto.getNombre() + " = $" + producto.getPrecio());
                producto.setPrecio(nuevo_precio);
                System.out.println("Nuevo precio de " + producto.getNombre() + " = $" + producto.getPrecio());
                existe = true;
                break;
            }
        }
        if (existe == false){
            System.out.println("El nombre dado no corresponde a ningun producto del supermercado");
        }
    }
    
    public void salarioMensual (Empleado empleado, int horas_normales, int horas_extra, int horas_festivos){
        double s_minimo = 737717;
        double s_transporte = 83140;
        double valor_hn = (horas_normales * s_minimo)/ 240;
        double valor_he = ((horas_extra * s_minimo)/ 240) * 1.25;
        double valor_hf = ((horas_festivos * s_minimo)/ 240) * 2;
        double total = valor_hn + valor_he + valor_hf;
        double ssyp_empleador = total * 0.302;
        double ssyp_empleado = total * 0.08;
        total = (total + s_transporte) + (ssyp_empleador - ssyp_empleado);
        Gasto gasto = new Gasto ("Pago Salario", empleado, total, this.getDia(), this.getMes());
        System.out.println("Cantidad a pagar: $" + gasto.getValor());
        if(this.num_gastos < 1000){
            this.gastos[this.num_gastos] = gasto;
            this.num_gastos++;
            System.out.println("Pago de salario registrado exitosamente");
        }else{
            System.out.println("No es posible pagar salario. Se ha excedido el limite de numero de gastos");
        }
    }
    
    public void liquidacion (Empleado empleado, int horas_normales, int horas_extra, int horas_festivos){
        double s_minimo = 737.717;
        double s_transporte = 83.140;
        double valor_hn = (horas_normales * s_minimo)/ 2880;
        double valor_he = ((horas_extra * s_minimo)/ 2880) * 1.25;
        double valor_hf = ((horas_festivos * s_minimo)/ 2880) * 2;
        double cesantias = ((valor_hn + valor_he + valor_hf)/12) + s_transporte;
        double intereses_cesantias = cesantias * 0.12;
        double prima_servicios = cesantias;
        double total = cesantias + intereses_cesantias + prima_servicios;
        Gasto gasto = new Gasto ("Pago Liquidacion", empleado, total, this.getDia(), this.getMes());
        System.out.println("Cantidad a pagar: $" + gasto.getValor());
        if(this.num_gastos < 1000){
            this.gastos[this.num_gastos] = gasto;
            this.num_gastos++;
            System.out.println("Pago de liquidacion registrado exitosamente");
        }else{
            System.out.println("No es posible pagar liquidacion. Se ha excedido el limite de numero de gastos");
        }
    }
    
    public void cambiarDeDia(int numero_mes, int dia){
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
        int nuevodia = 0;
        Mes month =  new Mes ("provisional", 0, 0);
        int w = numero_mes;
        switch (w){
            case 1:
                if (dia == 31){
                    nuevodia = 1;
                    month = febrero;
                }else{
                    nuevodia = dia + 1;
                    month = enero;
                }
            case 2:
                if (dia == 28){
                    nuevodia = 1;
                    month = marzo;
                }else{
                    nuevodia = dia + 1;
                    month = febrero;
                }
            case 3:
                if (dia == 31){
                    nuevodia = 1;
                    month = abril;
                }else{
                    nuevodia = dia + 1;
                    month = marzo;
                }
            case 4:
                if (dia == 30){
                    nuevodia = 1;
                    month = mayo;
                }else{
                    nuevodia = dia + 1;
                    month = abril;
                }
            case 5:
                if (dia == 31){
                    nuevodia = 1;
                    month = junio;
                }else{
                    nuevodia = dia + 1;
                    month = mayo;
                }
            case 6:
                if (dia == 30){
                    nuevodia = 1;
                    month = julio;
                }else{
                    nuevodia = dia + 1;
                    month = junio;
                }
            case 7:
                if (dia == 31){
                    nuevodia = 1;
                    month = agosto;
                }else{
                    nuevodia = dia + 1;
                    month = julio;
                }
            case 8:
                if (dia == 31){
                    nuevodia = 1;
                    month = septiembre;
                }else{
                    nuevodia = dia + 1;
                    month = agosto;
                }
            case 9:
                if (dia == 30){
                    nuevodia = 1;
                    month = octubre;
                }else{
                    nuevodia = dia + 1;
                    month = septiembre;
                }
            case 10:
                if (dia == 31){
                    nuevodia = 1;
                    month = noviembre;
                }else{
                    nuevodia = dia + 1;
                    month = octubre;
                }
            case 11:
                if (dia == 30){
                    nuevodia = 1;
                    month = diciembre;
                }else{
                    nuevodia = dia + 1;
                    month = noviembre;
                }
            case 12:
                if (dia == 31){
                    nuevodia = 1;
                    month = enero;
                }else{
                    nuevodia = dia + 1;
                    month = diciembre;
                }
        }
        this.setDia(nuevodia);
        this.setMes(month);
    }
}
