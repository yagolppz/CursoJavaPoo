package POO;

public class Familia {
	//Campos de clases o variables
    private String nombreIntegrante;

    //Constructores
    public Familia() {
        nombreIntegrante = "nada";
    }
    public Familia(String nombreIntegrante) {
        this.nombreIntegrante = nombreIntegrante;
    }

    //Getters y Setters
    public String getInfo() {
        return(nombreIntegrante);
    }
    public void setInfo(String nombreIntegrante) {
        this.nombreIntegrante = nombreIntegrante;
    }

    //Metodos de la clase
    public void respirar() {
        System.out.println("Puedo respirar");
    }
    public void comer() {
        System.out.println("Puedo comer");
    }
}
