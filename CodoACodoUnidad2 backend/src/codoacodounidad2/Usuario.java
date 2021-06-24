/*
 Crear un programa en java en el cual se pida al usuario ingresar su nombre, apellido, edad, hobbie, editor de código preferido,
sistema operativo que utiliza, luego deberá mostrarse por consola los datos ingresados.
El programa deber ser subido a un repositorio de GitHub, pegar el link del ejercicio resuelto en el siguiente recuadro
 
 */
package codoacodounidad2;


public class Usuario {
    String nombre;
    String apellido;
    int edad;
    String hobbie;
    String editor;
    String SO;

    public Usuario(String nombre, String apellido, int edad, String hobbie, String editor, String SO) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.hobbie = hobbie;
        this.editor = editor;
        this.SO = SO;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Apellido: " + apellido + " Edad:" + edad + 
                " Hobbie: " + hobbie + " Editor preferido: " + editor + " Sistema operativo:" + SO;
    }
    
    
}
