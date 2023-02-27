package POOYago;

public class FamiliaHumano extends Familia{
	
	//____________________Constructor____________________
	public FamiliaHumano(String nombreHumano) {
		super(nombreHumano);//super busca el constructor en el padre
	}
	//____________________Metodos____________________
	public void hablar() {
		System.out.println("Hola mundo");
	}
}
