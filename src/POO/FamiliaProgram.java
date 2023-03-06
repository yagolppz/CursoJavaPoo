package POO;

public class FamiliaProgram {

	public static void main(String[] args) {
		//Creamos instancias 
        Familia nuevo = new Familia("ninguno");//Llama al constructor por parametros
		FamiliaGato gatoSimpson = new FamiliaGato();//Llama al constructor sin parametros de la clase Padre
        FamiliaPerro perroSimpson = new FamiliaPerro("Ayudante de Santa");//Llaman al segundo constructor de la clase Padre
        FamiliaHumano hijoSimpson = new FamiliaHumano("Bart");
        FamiliaHumano hijaSimpson = new FamiliaHumano("Lisa");
        FamiliaPez pezSimpson= new FamiliaPez();

        //Utilizo las instancias
        perroSimpson.ladrar();
        gatoSimpson.maullar();
        
        
        
        
        
        
        gatoSimpson.respirar();
        nuevo.respirar();
        System.out.println(nuevo.getInfo());
        hijaSimpson.hablar();

        System.out.println("");
        System.out.println(gatoSimpson.getInfo());
        gatoSimpson.setInfo("Bola de Nieve");
        System.out.println(gatoSimpson.getInfo());
        System.out.println("");

        System.out.println(perroSimpson.getInfo());
        perroSimpson.setApodoPerro("huesos");
        System.out.println(perroSimpson.getApodoPerro());	
        
        perroSimpson.respirar();
        gatoSimpson.respirar();
        pezSimpson.respirar();

	}
}

