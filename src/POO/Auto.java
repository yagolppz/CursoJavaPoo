package POO;

public class Auto {
	//_____________Atributos___________
	private int ruedas;
	private double largo;
	private double ancho;
	private boolean climatizador;
	private String tapiceria;
	//_____________constructores (son metodos)___________
	public Auto() {
	  ruedas = 4;
	  largo = 3;
	  ancho = 2;
	  climatizador = false;
	  tapiceria = "tela";
	}

	public Auto(double largoAuto, double anchoAuto) {
	  ruedas = 4;
	  largo = largoAuto;
	  ancho = anchoAuto;
	  climatizador = false;
	  tapiceria = "tela";
	}
	//_____________Getters y Setters (son metodos)___________
	public String getInfoAtuto() {
	  return "El auto tiene:\n" + "  ruedas:" + ruedas + "\n  largo:" + largo + "\n  ancho:" + ancho;
	}

	public void setExtras(boolean climatiador, String tapiceria) {
	  this.climatizador = climatiador;
	  this.tapiceria = tapiceria;
	}

	public String getExtras() {
	  return "El auto tiene:\n" + "  climatizador:" + climatizador + "\n  tapiceria:" + tapiceria + "\n";
	}
}


