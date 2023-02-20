package POOYago;

public class UsoAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto();
		Auto auto2 = new Auto(); 
		Auto auto3 = new Auto(3.5 , 2.5);
		
		System.out.print("Auto1\n"+auto1.getInfoAuto());
		System.out.print("Auto1\n"+auto1.getExtras());
		
		auto2.setrueda(10);
		//auto2.setExtras(true,"cuero");
		auto2.setExtras("otra cosa", false);
		
		System.out.print("Auto2\n"+auto2.getInfoAuto());
		System.out.print("Auto2\n"+auto2.getExtras());
		
		System.out.print("Auto3\n"+auto3.getInfoAuto());
		System.out.print("Auto3\n"+auto3.getExtras());
				
	}
}
