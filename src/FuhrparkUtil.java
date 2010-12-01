/*
 * helper fuer die testklasse
 */
public class FuhrparkUtil {
	
	private static int fuhrparkIDCounter = 1;
	
	public static String addFuhrpark(List fuhrparks) {
		String newName = "Fuhrpark" + fuhrparkIDCounter++;
		//fuegt fuhrpark zur liste hinzu
		fuhrparks.addNode(new Fuhrpark(newName));
		return newName;
	}
	
	private static Fuhrpark findFuhrparkID(List fuhrparks, String fuhrparkID) {
		Iter iter = fuhrparks.getIterator();
		while(iter.hasNext()){
			Fuhrpark next = (Fuhrpark)iter.next();
			if(fuhrparkID.equals(next.getId())){
				return next;
			}
		}
		return null;
	}
	
	/*
	 * add Elektro-Fahrzeug
	 */
	public static void addElektroFahrzeugToFuhrpark(List fuhrparks, String fuhrparkID, int fahrzeugID) throws IllegalArgumentException{
		Fuhrpark fp = findFuhrparkID(fuhrparks, fuhrparkID);
		if(fuhrparkID == null){
			throw new IllegalArgumentException("Fuhrpark not found");
		}
		fp.addFahrzeug(new Elektromotor(fahrzeugID));
	}
	
	/*
	 * add Benzin-Fahrzeug
	 */
	public static void addBenzinFahrzeugToFuhrpark(List fuhrparks, String fuhrparkID, int fahrzeugID) throws IllegalArgumentException{
		Fuhrpark fp = findFuhrparkID(fuhrparks, fuhrparkID);
		if(fuhrparkID == null){
			throw new IllegalArgumentException("Fuhrpark not found");
		}
		fp.addFahrzeug(new VerbrennungsMotor(fahrzeugID));
	}
	
	/*
	 * delete specified Fuhrpark
	 */
	public static void deleteFuhrpark(List fuhrparks, String fuhrparkID) throws IllegalArgumentException {
		if(fuhrparkID == null){
			throw new IllegalArgumentException("Fuhrpark not found");
		}
		fuhrparks.removeNode(new Fuhrpark(fuhrparkID));
	}
	
	/*
	 * delete specified Fahrzeug
	 */
	//TODO: ev. noch exc schmeissen falls fahrzeugID nicht vorhanden bzw. schon geloescht
	public static void deleteFahrzeug(List fuhrparks, String fuhrparkID, int fahrzeugID) throws IllegalArgumentException{
		Fuhrpark fp = findFuhrparkID(fuhrparks, fuhrparkID);
		if(fuhrparkID == null){
			throw new IllegalArgumentException("Fuhrpark not found");
		}
		fp.removeFahrzeugById(fahrzeugID);
	}
	
	//TODO: aendern der information zu einigen fahrzeugen
	//info: zu einem zeitpunkt wird ein fahrzeug fuer hoechstens 1 art von aufgabe eingesetzt
	public static void changeFunction(List fuhrparks, int fahrzeugID){
		//fahrzeug setType()
	}
	
	//TODO: erhoehung d kilometerstandes
	public static void increaseKm(int fahrzeugID, int km){
		//verwende methoden von fahrzeug
	}
	
	//TODO: erhoehung d Treibstoff- /Stromverbrauchs (liter bzw. kwh)
	public static void increaseFuelConsumption(List fuhrparks, int fahrzeugID, int amount){
		
	}
	
	
}
