
package domain;
/*
Los bloques de inicializacion de codigos, tenemos dos tipos:
Estaticos y No estaticos (Ambos se ejecutan antes del constructor)
*/

public class Personas {
    private final int idPersona;
    private static int contadorPersonas;
    
    
    //Bloque de codigo de iniliciacion estatico. Se ejecuta cuando se carga una clase en memoria
   // Se ejecuta 1 sola vez nada mas. Por lo que " Se ejecuta cuando se carga una clase en memoria"
    static{
        System.out.println("Ejecucion de bloque estatico");
        ++Personas.contadorPersonas;
        
    }
    //Bloque de inicializacion No-Estatico.
    //Se ejecuta constantemente, cada vez que se crea un nuevo objeto de la clase.
    {
        System.out.println("Ejecucion de bloque no estatico");
        this.idPersona=Personas.contadorPersonas++;
    }
    //para este momento ya se ejecutaron los anteriores bloques de codigo.
    public Personas(){
        System.out.println("ejecucion del constructor");
    }


}
