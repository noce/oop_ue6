
public class Test {
	
	private static List fuhrparks = new List();
	private static int fahrzeugIDCounter = 1;
	
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
		
	}
}
