import java.util.ArrayList;

public class Cartera
{
    /** ATRIBUTOS **/
    private String nombre;
    private ArrayList<Operación> operaciones;
    private CuentaBancaria cuentaAsociada;
    private ArrayList<Activo> activosCartera;

    /** CONSTRUCTORES **/ // 3.a
    public Cartera(String nombre, ArrayList<Operación> operaciones, CuentaBancaria cuentaAsociada, ArrayList<Activo> activosCartera)
    {
        this.nombre = nombre;
        this.operaciones = operaciones;
        this.cuentaAsociada = cuentaAsociada;
        this.activosCartera = activosCartera;
    }

    /** GETTERS Y SETTERS **/
    /** MÉTODOS PARTICULARES **/

    public double rentabilidad(double compraValor){
        double cantidad = 0;
        double comisión = 0;

        cantidad = compraValor - comisión;
        return cantidad;
    }

}
