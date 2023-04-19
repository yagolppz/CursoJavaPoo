import java.time.LocalDate;

public class Acción extends Activo // Extends Activo (acción es hijo de activo)
{
    private String mercado;

    public Acción(String símbolo, String nombre, boolean negociable, String mercado){ // 1.a
        super(símbolo, nombre, negociable);
        this.mercado = mercado; // De los 4 parámetros, 3 van al padre y 1 lo resuelvo.
    }


    /** MÉTODOS PARTICULARES **/
    @Override
    public double precio(LocalDate fecha){

    }

    /** GETTERS Y SETTERS **/ // 1.b
    public String getMercado() {
        return mercado;
    }

    public void setMercado(String mercado) {
        this.mercado = mercado;
    }
}

