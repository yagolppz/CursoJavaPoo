package POO;

public class FamiliaHumano extends Familia{
	//Constructor
    public FamiliaHumano(String nombreHumano) { //busca el segundo constructor de la clase Padre
        super(nombreHumano);
    }

    //Metodos de la clase
    public void hablar() {
        System.out.println("soy una persona");
    }

}
