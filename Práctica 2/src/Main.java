import java.time.LocalDate;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        LocalDate fecha = LocalDate.of(2023, 2, 1);
        String[] acciones = {"SAN", "TSLA", "ACN",
                "CSNDX.SW", "TNOW.PA", "F701.DE",
                "0P0001C2ZB.F", "0P0000Z32X.F", "0P0000WUYX"};
        String formato  = "%1$te/%1$tm/%1$tY";
        for(String acc : acciones)
        {
            System.out.println(acc + " el " + String.format(formato, fecha) + ": " + Precio.buscaPrecio(acc, fecha));
        }
    }
}