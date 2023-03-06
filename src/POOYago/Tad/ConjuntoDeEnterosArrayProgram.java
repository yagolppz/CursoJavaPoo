package POOYago.Tad;

public class ConjuntoDeEnterosArrayProgram {

	public static void main(String[] args) {
		ConjuntoDeEnterosArray conjunto = new ConjuntoDeEnterosArray();
		conjunto.insertar(10);
		conjunto.insertar(1);
		conjunto.insertar(2);
		conjunto.insertar(3);
		conjunto.insertar(4);
		System.out.println(conjunto.aleatorio());

	}

}
