/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.ventas.test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;

/**
 *
 * @author Alejo
 */
public class Test {
    public static void main(String[] args) {
        Producto producto1= new Producto("Camisa", 50.00);
        Producto producto2= new Producto("Pantalon", 550.00);
        Producto producto3= new Producto("Remera Adidas", 15.20);
        
        Orden Orden1= new Orden();
        Orden1.agregarProducto(producto1);
        Orden1.agregarProducto(producto2);
        Orden1.agregarProducto(producto3);
        Orden1.mostrarOrden();
        
    }
    
}
