
package mx.com.gm.argumentosvariables;

public class NewClass {
    public static void main(String[] args) {
        imprimirNumeros(2,3,4);
    }
    //para utilizar los argumentos variables(no sabemos cuantos argumentos podemos tener) se utilizan los ...
    //Es util para evitar definir multiples parametros ej: (numero1,numero2,numero3) etc.
    //lo definimos como estatico por que lo llamamos desde el main que es estatico
    public static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento"+numeros[i]);
        }
    }
    //Se puede hacer esto tambien, solo que se pone como ultimo argumento del metodo (int... numeros)
    public static void variosParametros(String nombre, int... numeros){
        System.out.println("Nombre: "+nombre);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento"+numeros[i]);
        }
    }
}
