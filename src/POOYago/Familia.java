package POOYago;

public class Familia {
	//____________________Atributo____________________
	private String nombreIntegrante;
	
	//____________________Constructor____________________
	public Familia() {
		nombreIntegrante = "nada";
	}
	public Familia(String nombreIntegrante) {
		this.nombreIntegrante = nombreIntegrante;
	}
	
	//____________________getter y setter____________________
	public String getNombreIntegrante() {
		return (nombreIntegrante);
	}
	public void setNombreIntegrante() {
		this.nombreIntegrante=nombreIntegrante;
	}
	
	//____________________Metodo Particular____________________
	public void respirar() {
		System.out.println("Puedo respirar por la boca");
	}
	public void comer() {
		System.out.println("Puedo comer");
	}
}
