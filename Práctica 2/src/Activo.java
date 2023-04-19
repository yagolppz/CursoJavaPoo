import java.time.LocalDate;

public abstract class Activo // Clase abstracta. Si existe un método abstracto, la clase es abstracta. Pueden existir otros métodos no abstractos.
{
    /** ATRIBUTOS **/
    protected String símbolo; // Está protegido por las hijas.
    protected String nombre; // Se pasa al atributo.
    protected boolean negociable;

    /** CONSTRUCTORES **/
    public Activo(String símbolo, String nombre, boolean negociable)
    {
        this.símbolo = símbolo;
        this.nombre = nombre;
        this.negociable = negociable;
    }


    /** GETTERS Y SETTERS **/

    public String getSímbolo() {
        return símbolo;
    }
    public String getNombre() {
        return nombre;
    }
    public boolean getNegociable() {
        return negociable;
    }
    public String getInfo(){ // 1.b
        return " El nombre es: " + nombre + " el símbolo es: " + símbolo + " es negociable: " + negociable;
    }

    public void setSímbolo(String símbolo) {
        this.símbolo = símbolo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNegociable(boolean negociable) { // 1.c
        this.negociable = negociable;
    }

    /** MÉTODOS PARTICULARES **/

    public abstract double precio(LocalDate fecha);

    // TODO
    public double compra(double compraValor){
        double cantidad = 0;
        double comisión = 0;

        cantidad = comisión + compraValor;
        return cantidad;
    }
    public double venta(double compraValor){
        double cantidad = 0;
        double comisión = 0;

        cantidad = compraValor - comisión;
        return cantidad;
    }
    public void dividendos(){}
}

