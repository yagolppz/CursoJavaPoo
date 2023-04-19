import java.time.LocalDate;

public class FondoInversión extends Activo
{
    private String categoría;

    public FondoInversión(String símbolo, String nombre, boolean negociable, String categoría){ // 1.a
        super(símbolo, nombre, negociable);
        this.categoría = categoría; // De los 4 parámetros, 3 van al padre y 1 lo resuelvo.
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    /** MÉTODOS PARTICULARES **/

    public double precio(LocalDate fecha){

    }
}
