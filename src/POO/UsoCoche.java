package POO;

public class UsoCoche {

	public static void main(String[] args) {
	    Auto auto1 = new Auto();//Creamos el objeto auto1 de tipo Auto y llamamos al constructor con new
	    Auto auto2 = new Auto(3.5, 2.5);//Se crea auto2 con el segundo constructor
	    auto2.setExtras(true, "cuero");//cambio tapiceria y pongo climatizador

	    System.out.println(auto1.getInfoAtuto());
	    System.out.println(auto1.getExtras());
	    System.out.println(auto2.getInfoAtuto());
	    System.out.println(auto2.getExtras());
	}

}
