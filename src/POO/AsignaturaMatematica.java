package POO;

public class AsignaturaMatematica extends Asignaturas{
	public void sumar(int a, int b) {
        System.out.println(a + b);
    }

    public void sumar(double a, double b) {
        System.out.println(a + b);
    }

    @Override
    public void nota() {
        System.out.println("10");
    }

}
