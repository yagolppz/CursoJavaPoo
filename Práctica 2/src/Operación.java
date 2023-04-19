public class Operación
{
    /** ATRIBUTOS **/
    private Activo activo;
    private TipoOperación tipoOperación;
    private String fecha;
    private int num;
    private double precio;
    private double comisión;

    /** CONSTRUCTORES **/ // 2.a
    public Operación(Activo activo, TipoOperación tipoOperación, String fecha, int num, double precio, double comisión)
    {
        this.activo = activo;
        this.tipoOperación = tipoOperación;
        this.fecha = fecha;
        this.num = num;
        this.precio = precio;
        this.comisión = comisión;
    }

    /** GETTERS Y SETTERS **/ // 2.b
    public Activo getActivo() {
        return activo;
    }

    public TipoOperación getTipoOperación() {
        return tipoOperación;
    }

    public String getFecha() {
        return fecha;
    }

    public int getNum() {
        return num;
    }

    public double getPrecio() {
        return precio;
    }

    public double getComisión() {
        return comisión;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }

    public void setTipoOperación(TipoOperación tipoOperación) {
        this.tipoOperación = tipoOperación;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setComisión(double comisión) {
        this.comisión = comisión;
    }

    /** ATRIBUTOS **/

}
