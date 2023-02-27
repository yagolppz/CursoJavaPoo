package POOYago;

public class FamiliaProgram {

	public static void main(String[] args) {
		
		Familia nuevo = new Familia("Simpson");
		FamiliaPerro perroSimpson = new FamiliaPerro("Ayudante de Santa");
		FamiliaPerro perroSimpson2 = new FamiliaPerro("Procer");
		FamiliaGato gatoSimpson = new FamiliaGato();
		FamiliaHumano hijaSimpson = new FamiliaHumano("Lisa");
		
		nuevo.respirar();//nuevo es de tipo Familia
		
		perroSimpson.respirar();//En el Padre
		perroSimpson.ladrar();//En la clase Perro
		
		gatoSimpson.respirar();//En el Padre
		gatoSimpson.maullar();//En la clase Gato
		
		System.out.println(perroSimpson.getApodo());
		
		perroSimpson.setApodo("huesos");
		System.out.println(perroSimpson.getApodo());
		
		System.out.println(perroSimpson2.getApodo());
	}
}
