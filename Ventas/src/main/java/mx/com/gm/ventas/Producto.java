package mx.com.gm.ventas;

/**
 *
 * @author Alejo
 */
public class Producto {
    private final int idProducto;// se añade final por que una vez que se le asigna un valor no deberia cambiar.
    private String nombre;
    private double Precio;
    private static int  contadorProductos;

    private Producto() {
        this.idProducto= ++Producto.contadorProductos;
    }

    public Producto(String nombre, double Precio) {
        this();//si hacemos una llamada a un constructor interno entonces tenemos que agregar el this(), se hace una llamada al constructor privado
               // y lo que hace es sumar el contadorProductos
        this.nombre = nombre;
        this.Precio = Precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return Precio;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", Precio=" + Precio + ", contadorProductos=" + contadorProductos + '}';
    }
    
}
