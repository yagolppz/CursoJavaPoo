package POOYago;

public class Alumnos {
	/**________Atributo________*/
	private String nombre;
	private String apellido;
	private int edad;
	

	/**_______Constructores(metedo)__________*/
	/**Si tengo metodos iguales con diferente numero de parametros --> SOBRECARGA DEL METODO*/
	
	public Alumnos(){
		nombre = "null";
		apellido= "null";
		edad = 0;
	}
		
	public Alumnos(String apellido, String nombre, int edad){
		this.nombre = nombre;
		this.apellido= apellido;
		this.edad = edad;
	}
	
	public void imprimirNombre() {
		System.out.println("El nombre es: " + nombre + " "+ apellido);
	}
	
	
	/**_______Metodos particulares_________*/
	public void imprimirEdadFutura() {
		System.out.println("Dentro de diez años "  +  nombre  +  " tendra "+  (edad+10) + " años");
	}
}
