package POO;

public class FamiliaPez extends Familia{
	//Constructor  

    //Metodos de la clase
    public void ruido() {
        System.out.println("glup glup");
    }
    	@Override
    	public void respirar() {
    		System.out.println("Puedo respirar por el costado");
    }
}
