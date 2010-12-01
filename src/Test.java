
public class Test {
	
	private static List fuhrparks = new List();
	private static int fahrzeugIDCounter = 1;

	private static void printFuhrparkListe(List fuhrparks){
		Iter iter = fuhrparks.getIterator();
		while(iter.hasNext()){
			System.out.println(iter.next().toString());
		}
	}

	public static void main(String args[]){
		
		/*
		 * neue fuhrparks erstellen
		 */

		String fuhrpark1 = FuhrparkUtil.addFuhrpark(fuhrparks);
		String fuhrpark2 = FuhrparkUtil.addFuhrpark(fuhrparks);
		String fuhrpark3 = FuhrparkUtil.addFuhrpark(fuhrparks);
		String fuhrpark4 = FuhrparkUtil.addFuhrpark(fuhrparks);
		String fuhrpark5 = FuhrparkUtil.addFuhrpark(fuhrparks);

		/*
		 * fahrzeuge zu fuhrparks hinzufuegen
		 */
		FuhrparkUtil.addElektroFahrzeugToFuhrpark(fuhrparks, fuhrpark1, fahrzeugIDCounter++);
		FuhrparkUtil.addBenzinFahrzeugToFuhrpark(fuhrparks, fuhrpark1, fahrzeugIDCounter++);
		FuhrparkUtil.addElektroFahrzeugToFuhrpark(fuhrparks, fuhrpark1, fahrzeugIDCounter++);
		FuhrparkUtil.addBenzinFahrzeugToFuhrpark(fuhrparks, fuhrpark1, fahrzeugIDCounter++);
		FuhrparkUtil.addElektroFahrzeugToFuhrpark(fuhrparks, fuhrpark1, fahrzeugIDCounter++);
		
		FuhrparkUtil.addBenzinFahrzeugToFuhrpark(fuhrparks, fuhrpark2, fahrzeugIDCounter++);
		FuhrparkUtil.addElektroFahrzeugToFuhrpark(fuhrparks, fuhrpark2, fahrzeugIDCounter++);
		FuhrparkUtil.addBenzinFahrzeugToFuhrpark(fuhrparks, fuhrpark2, fahrzeugIDCounter++);
		FuhrparkUtil.addElektroFahrzeugToFuhrpark(fuhrparks, fuhrpark2, fahrzeugIDCounter++);
		FuhrparkUtil.addBenzinFahrzeugToFuhrpark(fuhrparks, fuhrpark2, fahrzeugIDCounter++);
		
		FuhrparkUtil.addElektroFahrzeugToFuhrpark(fuhrparks, fuhrpark3, fahrzeugIDCounter++);
		FuhrparkUtil.addBenzinFahrzeugToFuhrpark(fuhrparks, fuhrpark3, fahrzeugIDCounter++);
		FuhrparkUtil.addElektroFahrzeugToFuhrpark(fuhrparks, fuhrpark3, fahrzeugIDCounter++);
		FuhrparkUtil.addBenzinFahrzeugToFuhrpark(fuhrparks, fuhrpark3, fahrzeugIDCounter++);
		FuhrparkUtil.addElektroFahrzeugToFuhrpark(fuhrparks, fuhrpark3, fahrzeugIDCounter++);
		
		FuhrparkUtil.addBenzinFahrzeugToFuhrpark(fuhrparks, fuhrpark4, fahrzeugIDCounter++);
		FuhrparkUtil.addElektroFahrzeugToFuhrpark(fuhrparks, fuhrpark4, fahrzeugIDCounter++);
		FuhrparkUtil.addBenzinFahrzeugToFuhrpark(fuhrparks, fuhrpark4, fahrzeugIDCounter++);
		FuhrparkUtil.addElektroFahrzeugToFuhrpark(fuhrparks, fuhrpark4, fahrzeugIDCounter++);
		FuhrparkUtil.addBenzinFahrzeugToFuhrpark(fuhrparks, fuhrpark4, fahrzeugIDCounter++);
		
		FuhrparkUtil.addBenzinFahrzeugToFuhrpark(fuhrparks, fuhrpark5, fahrzeugIDCounter++);
		FuhrparkUtil.addElektroFahrzeugToFuhrpark(fuhrparks, fuhrpark5, fahrzeugIDCounter++);
		FuhrparkUtil.addBenzinFahrzeugToFuhrpark(fuhrparks, fuhrpark5, fahrzeugIDCounter++);
		FuhrparkUtil.addElektroFahrzeugToFuhrpark(fuhrparks, fuhrpark5, fahrzeugIDCounter++);
		FuhrparkUtil.addBenzinFahrzeugToFuhrpark(fuhrparks, fuhrpark5, fahrzeugIDCounter++);
		
		System.out.println("Folgende Fuhrparks sind vorhanden:");
		printFuhrparkListe(fuhrparks);
		System.out.println();
		
		FuhrparkUtil.deleteFuhrpark(fuhrparks, fuhrpark5);
		System.out.println("Nach Entfernen von Fuhrpark 5 sind noch folgende Fuhrparks vorhanden:");
		printFuhrparkListe(fuhrparks);
		System.out.println();
		
		
		System.out.println("Anzahl der Fahrzeuge im Fuhrpark4:");
		System.out.println(FuhrparkUtil.findFuhrparkID(fuhrparks, fuhrpark4).printFahrzeuge());
		
		FuhrparkUtil.deleteFahrzeug(fuhrparks, fuhrpark4, 20);

		
		System.out.println("Nach Entfernen von Fahrzeug No.20:");
		System.out.println(FuhrparkUtil.findFuhrparkID(fuhrparks, fuhrpark4).printFahrzeuge());
		
		
		
		/*
		 * Aenderung der Befoerderungsart (Personen bzw. Lasten)
		 * (Informationen ueber fruehere Einsaetze gehen verloren)
		 */
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 8).setType(new Lasten(8, 700));
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 9).setType(new Lasten(15, 1550));
		
		System.out.println("Aenderung der Befoerderungsart der Fahrzeuge 8&9 zu Lastenfahrzeugen");
		System.out.println();

		
		/*
		 * Erhoehung und Auslesung des Kilometerstandes eines Fahrzeugs
		 */
		System.out.println("Vor der Erhoehung des km-Standes der Fahrzeuge 6, 7, 8 betraegt der aktuelle km-Stand:");
		System.out.println(FuhrparkUtil.findFuhrparkID(fuhrparks, fuhrpark2).statistics(1));
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 6).increaseKm(220);
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 8).increaseKm(600);
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 10).increaseKm(900);
		
		System.out.println("Nach Erhoehung des km-Standes der Fahrzeuge 6, 7, 8 betraegt der aktuelle km-Stand:");
		System.out.println(FuhrparkUtil.findFuhrparkID(fuhrparks, fuhrpark2).statistics(1));

		
		/*
		 * Erhoehung und Auslesung des Treibstoff- bzw. Stromverbrauchs eines Fahrzeugs
		 */
		
		System.out.println("Vor Erhoehung des Stromverbrauches");
		System.out.println(FuhrparkUtil.findFuhrparkID(fuhrparks, fuhrpark2).statistics(2));
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 6).increaseVerbrauch(150);
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 7).increaseVerbrauch(200);
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 8).increaseVerbrauch(200);
		
		System.out.println("Nach Erhoehung des Verbrauchs der Fahrzeuge 6, 7, 8 betraegt der Stromverbrauch:");
		System.out.println(FuhrparkUtil.findFuhrparkID(fuhrparks, fuhrpark2).statistics(2));
		
		
		/*
		 * sitzplatzanzahl aendern
		 * 
		 */
		System.out.println("Vor Veraenderung der Sitzplatzanzahl");
		System.out.println(FuhrparkUtil.findFuhrparkID(fuhrparks, fuhrpark3).statistics(3));
		Befoerderung b1 = new  Personen(8);
		Befoerderung b2 = new  Personen(7);
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 11).setType(b1);
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 13).setType(b2);
		
		System.out.println("Sitzplatzanzahl bei Fahrzeug 11 & 13 erhoeht");
		System.out.println(FuhrparkUtil.findFuhrparkID(fuhrparks, fuhrpark3).statistics(3));
		
		
		/*
		 * Ladeflaeche veraendern
		 */
		System.out.println("Vor Veraenderung der Ladeflaeche");
		
		System.out.println(FuhrparkUtil.findFuhrparkID(fuhrparks, fuhrpark2).statistics(4));
		Befoerderung b3 = new Lasten(1, 50);
		Befoerderung b4 = new Lasten(2, 70);
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 8).setType(b3);
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 9).setType(b4);
		
		System.out.println("Ladeflaeche bei Fahrzeug 8&9 verkleinert");
		System.out.println(FuhrparkUtil.findFuhrparkID(fuhrparks, fuhrpark2).statistics(4));
		
	}
}
