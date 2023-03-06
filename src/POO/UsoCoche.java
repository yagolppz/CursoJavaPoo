package POO;

public class UsoCoche {

	public static void main(String[] args) {
	    Auto auto1 = new Auto();//Creamos el objeto auto1 de tipo Auto y llamamos al constructor con new
	    Auto auto2 = new Auto(3.5, 5);//Se crea auto2 con el segundo constructor
	    Auto auto3 = new Auto(6 , 3.5 , 2.5, false, "ninguna");//Se crea auto2 con el segundo constructor
	    
	    
	    System.out.println(auto2.getExtras());
	    
	    auto2.setExtras(true, "cuero");//cambio tapiceria y pongo climatizador
	    System.out.println(auto2.getExtras());
	    
	    System.out.println("");
	    System.out.println(auto1.getInfoAtuto());
	    System.out.println(auto1.getExtras());
	    System.out.println(auto2.getInfoAtuto());
	   
	    System.out.println(auto3.getExtras());
	    System.out.println(auto3.getInfoAtuto());
	}

}
