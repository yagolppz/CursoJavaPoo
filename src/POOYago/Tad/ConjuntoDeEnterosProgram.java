package POOYago.Tad;

public class ConjuntoDeEnterosProgram {

	public static void main(String[] args) {
        ConjuntoDeEnteros conjunto = new ConjuntoDeEnteros();
        conjunto.insertar(1);
        conjunto.insertar(2);
        conjunto.insertar(3);
        conjunto.insertar(4);
        conjunto.insertar(5);
        System.out.println(conjunto);
        System.out.println(conjunto.cardinalidad());
        System.out.println(conjunto.pertenece(3));
        conjunto.eliminar(3);
        System.out.println(conjunto);
        System.out.println(conjunto.cardinalidad());
        System.out.println(conjunto.aleatorio());
    }

}
