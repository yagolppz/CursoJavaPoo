package POO;

public class VerAlumnos {
	public static void main(String[] args) {
		Alumnos nuevoAlumno = new Alumnos("Ana", "Fernández", 99);
		Alumnos nuevoAlumno2 = new Alumnos();
		Alumnos nuevoAlumno3 = new Alumnos("Juan", "Pérez");
		nuevoAlumno.imprimirNombre();
		nuevoAlumno2.imprimirNombre();
		nuevoAlumno3.imprimirNombreEdad();
	}		
}
