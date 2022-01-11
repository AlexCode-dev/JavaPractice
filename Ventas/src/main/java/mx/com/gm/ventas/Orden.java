
package mx.com.gm.ventas;

/**
 *
 * @author Alejo
 */
public class Orden{
    private final int idOrden;
    private Producto [] productos;
    private static int  contadorOrdenes;
    static final int MAX_PRODUCTOS=10;//INDICA EL TAMAÑO DEL ARRAY
    private int contadorDeProductos;
    
    public Orden() {
        this.idOrden=++Orden.contadorOrdenes;
        this.productos=new Producto[Orden.MAX_PRODUCTOS];//inicializa el array productos
    }
    
    public void agregarProducto(Producto producto){
       if(this.contadorDeProductos < Orden.MAX_PRODUCTOS){
           productos[contadorDeProductos++] = producto;
       }
       else
            System.out.println("se supero el maximo de productos:"+Orden.MAX_PRODUCTOS);
    }
    
    public double calcularTotal(){
        double total= 0;
        
        for (int i = 0; i < contadorDeProductos; i++) {
            total=total+ this.productos[i].getPrecio();
        }
        
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Id Orden: "+this.idOrden);
        double totalOrden=this.calcularTotal();
        System.out.println("Total Orden: $" + totalOrden);
        System.out.println("--------------------------");
        System.out.println("Productos de la orden");
        for (int i = 0; i < this.contadorDeProductos; i++) {
            System.out.println(this.productos[i]);
        }
        
    }
}
