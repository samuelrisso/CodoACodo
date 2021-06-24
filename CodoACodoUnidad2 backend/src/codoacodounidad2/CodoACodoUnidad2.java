/*
 Crear un programa en java en el cual se pida al usuario ingresar su nombre, apellido, edad, hobbie, editor de código preferido,
sistema operativo que utiliza, luego deberá mostrarse por consola los datos ingresados.
El programa deber ser subido a un repositorio de GitHub, pegar el link del ejercicio resuelto en el siguiente recuadro
 */
package codoacodounidad2;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class CodoACodoUnidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        String apellido;
        int edad;
        String hobbie;
        String editor;
        String SO;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese su hobbie: ");
        hobbie = sc.nextLine();
        System.out.println("Ingrese su editor de codigo favorito");
        editor = sc.nextLine();
        System.out.println("Ingrese su sistema operativo");
        SO = sc.nextLine();
        
        Usuario usuario = new Usuario(nombre, apellido, edad, hobbie, editor, SO);
        System.out.println(usuario.toString());
    }

}
