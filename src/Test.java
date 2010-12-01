
public class Test {
	
	private static List fuhrparks = new List();
	private static int fahrzeugIDCounter = 1;
	private static int fuhrparkIDCounter = 1;
	
	//TODO: pre und postcond sowie inv schreiben
	//TODO: typ von befoerderung auf lasten aendern und umgekehrt
	//TODO: sichtbarkeiten und typsicherheiten
	//TODO: !!WICHTIG: vorher in fuhrpark ansehen, was da lofo da genau implementiert hat
	//		 - falls des funzt, brauchst keine statistik auswertungen mehr schreiben (nurmehr testen)
	
	//TODO: print mit ausgabe der fahrzeuge zu den fuhrparks, mit ausgabe ob elektro, od verbrennungsmotor
	//		und kilometerstand sowie treibstoff- bzw stromverbrauch
	//		personenbefoerderung: anz d sitzplaetze (inkl fahrer)
	//		lastenbefoerderung: groesse d ladeflaeche (in qm) und hoechst zulaessige zuladung (in kg)
	private static void printFuhrparkListe(List fuhrparks){
		Iter iter = fuhrparks.getIterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

	public static void main(String args[]){
		
		/*Tasks:
		 * -Fahrzeuge zu Fuhrparks hinzufuegen
		 * -einige Fahrzeuge entfernen
		 * -aendern der Informationen zu einzelnen Fahrzeugen
		 * -statistische Werte aller Fuhrparks berechenen
		 */
		
		
		
		
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
		
		FuhrparkUtil.deleteFuhrpark(fuhrparks, fuhrpark5);
		System.out.println("Nach Entfernen von Fuhrpark 5 und 1 sind noch folgende Fuhrparks vorhanden:");
		printFuhrparkListe(fuhrparks);
		
		FuhrparkUtil.deleteFahrzeug(fuhrparks, fuhrpark4, 20);
		FuhrparkUtil.deleteFahrzeug(fuhrparks, fuhrpark4, 17);
		FuhrparkUtil.deleteFahrzeug(fuhrparks, fuhrpark3, 13);
		
		System.out.println("Nach Entfernen der Fahrzeuge 13, 17, 20:");
		printFuhrparkListe(fuhrparks);
		
		/*
		 * Erhoehung und Auslesung des Kilometerstandes eines Fahrzeugs
		 */
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 6).increaseKm(220);
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 6).increaseKm(80);
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 7).increaseKm(600);
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 8).increaseKm(900);

		System.out.println("Nach Erhoehung des km-Standes der Fahrzeuge 6, 7, 8 betraegt der aktuelle km-Stand:");
		printFuhrparkListe(fuhrparks);
		
		/*
		 * Erhoehung und Auslesung des Treibstoff- bzw. Stromverbrauchs eines Fahrzeugs
		 */
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 6).increaseVerbrauch(150);
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 7).increaseVerbrauch(200);
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 8).increaseVerbrauch(200);
		
		System.out.println("Nach Erhoehung des Antrieb-Verbrauchs der Fahrzeuge 6, 7, 8 betraegt der aktuelle Treibstoff- bzw. Stromverbrauch:");
		printFuhrparkListe(fuhrparks);
		
		/*
		 * Aenderung der Befoerderungsart (Personen bzw. Lasten)
		 * (Informationen ueber fruehere Einsaetze gehen verloren)
		 */
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 7).setType(new Lasten(8, 700));
		FuhrparkUtil.getFahrzeugFromFuhrparkList(fuhrparks, 8).setType(new Lasten(15, 1550));

		System.out.println("Nach Aenderung der Befoerderungsart der Fahrzeuge 7, 8:");
		printFuhrparkListe(fuhrparks);
		
	}
}
