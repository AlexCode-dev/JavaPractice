package test;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestMySqlJDBC {
    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver"); Es necesario para aplicaciones web
            //Como trabajamos con conexiones locales entonces seguimos sin eso
            //(class.forName)Dado el nombre completo de una clase, este método intenta localizar, cargar y vincular la clase. Si se realiza correctamente, se devuelve una referencia al objeto de la clase. Si falla, entonces se lanza una instancia de. ClassClassNotFoundException*/

            Connection conexion = DriverManager.getConnection(url, "root", "admin");
            //Statement nos permite ejecuctar instrucciones en nuestra bd.
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            //Resultset nos permite ejecutar dicha instruccion "sql"
            ResultSet resultado = instruccion.executeQuery(sql);
            //Esta sentencia podria regresar mas de un registro entonces tendriamos que iterar todos los registros
            //resultado.next() regresa true si tenemos mas elementos para iterar.
            while(resultado.next()){
                System.out.print("Id Persona: " + resultado.getInt("id_persona"));
                System.out.print(" Nombre: " + resultado.getString("nombre"));
                System.out.print(" Apellido: " + resultado.getString("apellido"));
                System.out.print(" Email: " + resultado.getString("email"));
                System.out.print(" Telefono: " + resultado.getString("telefono"));
                System.out.println("");
            }
            //Cerramos los "objetos"
            resultado.close();
            instruccion.close();
            conexion.close();
        }catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
