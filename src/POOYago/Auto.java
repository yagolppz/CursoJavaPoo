package POOYago;

public class Auto {
	//________Atributo________
	private int ruedas;
	private double largo;
	private double ancho;
	private boolean climatizador;
	public String tapiceria;
	
	//_______Constructores(metedo)__________
	public Auto(){
		ruedas=5;
		largo=3;
		ancho=2;
		climatizador=false;
		tapiceria="tela";		
	}
	
	//_______Metodos particulares_________
	
	
	//_______getters y setters (metodos)_____
	public String getInfoAuto() {
		return "El auto tiene:\n " + "ruedas:" + ruedas + "\n largo:" + largo + "\n ancho:"+ ancho +"\n";
	}
	public int getrueda() {//consulta el numero de ruedas
		return  ruedas;
	}
	public void setrueda(int ruedasX) {//Cambia el valor de las ruedas
		ruedas=ruedasX;
	}
	
}
