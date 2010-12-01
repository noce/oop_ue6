public class TestLofo{
	public static void main(String args[]){
		Fuhrpark fuhrpark = new Fuhrpark("klo");
		Fahrzeug f1 = new VerbrennungsMotor(1);
		Fahrzeug f2 = new VerbrennungsMotor(2);
		Fahrzeug f3 = new Elektromotor(3);
		Fahrzeug f4 = new Elektromotor(4);
		
		Befoerderung b1 = new Personen(5);
		Befoerderung b3 = new Personen(3);
		Befoerderung b2 = new Lasten(45, 2);
		
		f1.setType(b3);
		f2.setType(b2);
		f3.setType(b1);
		f4.setType(b2);
		
		f1.increaseKm(300);
		f1.increaseVerbrauch(12);
		f2.increaseKm(4000);
		f2.increaseVerbrauch(2);
		f3.increaseKm(10);
		f3.increaseVerbrauch(2);
		f4.increaseKm(200);
		f4.increaseVerbrauch(3);
		
		fuhrpark.addFahrzeug(f1);
		fuhrpark.addFahrzeug(f2);
		fuhrpark.addFahrzeug(f3);
		fuhrpark.addFahrzeug(f4);
		
		fuhrpark.removeFahrzeug(f4);
		fuhrpark.removeFahrzeug(f2);
		
		System.out.println(fuhrpark.statistics(1));
		System.out.println(fuhrpark.statistics(2));
		System.out.println(fuhrpark.statistics(3));
		System.out.println(fuhrpark.statistics(4));
		
	}
	
}