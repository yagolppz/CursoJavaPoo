
package POO;

public class Alumnos {
	//_____________Atributos___________
	private String nombre;
    private String apellido;
    private int edad;

    public Alumnos() {
        nombre = "null";
        apellido = "null";
        edad = 0;
    }
    //_____________constructores (son metodos)___________
    public Alumnos(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Alumnos(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void imprimirNombre() {
        System.out.println("El nombre del alumno es: " + nombre + ", " + apellido);
    }

    public void imprimirNombreEdad() {
        System.out.println("El nombre del alumno es: " + nombre + ", " + apellido + " Edad: " + edad);
    }

}
