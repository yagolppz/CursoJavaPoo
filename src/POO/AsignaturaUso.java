package POO;

public class AsignaturaUso {

	public static void main(String[] args) {
        AsignaturaMatematica objMatematicas = new AsignaturaMatematica();
        AsignaturaLengua objLengua = new AsignaturaLengua();
        AsignaturaFisica objFisica = new AsignaturaFisica();

        Asignaturas[] objAsignaturas = new Asignaturas[3];
        objAsignaturas[0] = objMatematicas; 
        objAsignaturas[1] = objLengua;  
        objAsignaturas[2] = objFisica;  

        // Polimorfismo Paramétrico
        objMatematicas.sumar(3.5, 2.2);
        objMatematicas.sumar(3, 2);

        // Polimorfismo de Sobrecarga
        objLengua.sumar("Juan", "Pedro");

        // Polimorfismo de Subtipado
        for (int i = 0; i < 3; i++) {
            objAsignaturas[i].nota();
        }
    }
}
