package POO;

public class AsignaturaLengua extends Asignaturas{
	public void sumar(String nombre1, String nombre2) {
        System.out.println(nombre1 + " y " + nombre2 + " se juntaron a estudiar ProgramacionII");
    }

    @Override
    public void nota() {
        System.out.println("9");
    }
}
