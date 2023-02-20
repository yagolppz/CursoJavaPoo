package POOYago;

public class Auto {
	/**________Atributo________*/
	private int ruedas;
	private double largo;
	private double ancho;
	private boolean climatizador;
	public String tapiceria;
	
	/**_______Constructores(metedo)__________*/
	/**Si tengo metodos iguales con diferente numero de parametros --> SOBRECARGA DEL METODO*/
	public Auto(){//Uso en Auto1 y Auto2 (no tiene parametros)
		ruedas=5;
		largo=3;
		ancho=2;
		climatizador=false;
		tapiceria="tela";		
	}
	public Auto(double largoAuto, double anchoAuto){//Uso en Auto3 (2 parametros)
		ruedas=5;
		largo=largoAuto;
		ancho=anchoAuto;
		climatizador=false;
		tapiceria="tela";		
	}
	public Auto(double largoAuto){//Nunca lo uso (1 parametro)
		ruedas=5;
		largo=largoAuto;
		ancho=2;
		climatizador=false;
		tapiceria="tela";		
	}
	
	/**_______Metodos particulares_________*/
	
	
	
	/**_______getters y setters (metodos)_____*/
	public String getInfoAuto() {
		return "El auto tiene:\n " + "ruedas:" + ruedas + "\n largo:" + largo + "\n ancho:"+ ancho +"\n";
	}
	public int getrueda() {//consulta el numero de ruedas
		return  ruedas;
	}
	public String getExtras() {//consulta el numero de ruedas
		return  "El auto tiene:\n " + "climatizador:" + climatizador + "\n tapiceria:" + tapiceria + "\n";
	}
	
	
	public void setrueda(int ruedas) {//Cambia el valor de las ruedas
		this.ruedas=ruedas;
	}
	
	
	/**Si tengo metodos iguales con IGUAL numero de parametros Y DIFERENTE TIPO --> SOBRECARGA DEL METODO*/
	public void setExtras(boolean climatizadorX, String tapiceriaX) {//Cambia los extras
		tapiceria=tapiceriaX;
		climatizador=climatizadorX;
		
	}
	public void setExtras(String tapiceriaX, boolean climatizadorX) {//Cambia los extras
		climatizador=climatizadorX;
		tapiceria=tapiceriaX;
	}
	
}
