public class CuentaBancaria
{
    /** ATRIBUTOS **/
    private String entidad;
    private String iban;
    private double saldo;

    /** CONSTRUCTORES **/ // 2.a
    public CuentaBancaria(String entidad, String iban, double saldo)
    {
        this.entidad = entidad;
        this.iban = iban;
        this.saldo = saldo;

    }
    public void ingresarEnCuenta(double cantidad){
        this.saldo += cantidad;

    }
    public boolean retirarDeCuenta(double cantidad){
        if (this.saldo >= cantidad){
            this.saldo -= cantidad;
            return true;
        }
        else {
            return false;
        }
    }

    /** GETTERS Y SETTERS **/ // 2.b

    public String getEntidad() {
        return entidad;
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
