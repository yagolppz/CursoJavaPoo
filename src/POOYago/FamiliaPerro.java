package POOYago;

public class FamiliaPerro extends Familia{
	//____________________Atributo____________________
	private String apodo;
	
	
	//____________________Constructor____________________
	public FamiliaPerro(String nombreIntegrante) {
		 super (nombreIntegrante);
		 this.apodo = "sin apodo";
	}
		
	//____________________Getters y Setters____________________
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public String getApodo() {
		return(apodo);
	}
	
	//____________________Metodos____________________
	public void ladrar() {
		System.out.println("gua gua");
	}
}
