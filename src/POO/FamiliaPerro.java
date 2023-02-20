package POO;

public class FamiliaPerro extends Familia{
	private String apodo;

    //Constructor
    public FamiliaPerro(String nombrePerro) { //base busca el segundo constructor de la clase Padre
        super(nombrePerro);
    }

    //Getters y Setters propios de la clase perro
    public void setApodoPerro(String apodo) {
        this.apodo = apodo;
    }

    public String getApodoPerro() {
        return (this.apodo);
    }

    //Metodos de la clase
    public void ladrar() {
        System.out.println("gua");
    }

}
