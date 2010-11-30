/*
 * helper fuer die testklasse
 */
public class FuhrparkUtil {
	
	private static int fuhrparkIDCounter = 1;
	
	public static String addFuhrpark(List fuhrparks) {
		String newName = "Fuhrpark" + fuhrparkIDCounter++;
		//fuegt fuhrpark zur liste hinzu
		//TODO: add in list implementieren
		fuhrparks.add(new Fuhrpark(newName));
		return newName;
	}
	
	private static Fuhrpark findFuhrparkID(List fuhrparks, String fuhrparkID) {
		//TODO: iterator in list implementieren
		for(Fuhrpark fp: fuhrparks){
			//TODO: getID() in fuhrpark implementieren
			if(fuhrparkID.equals(fp.getID()){
				return fp;
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
	public static void clearFuhrpark(List fuhrparks, String fuhrparkID) throws IllegalArgumentException {
		if(fuhrparkID == null){
			throw new IllegalArgumentException("Fuhrpark not found");
		}
		//TODO: remove fuhrpark in fuhrpark implementieren
		fuhrparks.removeFuhrpark(fuhrparkID);
	}
	
	/*
	 * delete specified Fahrzeug
	 */
	public static void clearFahrzeug(List fuhrparks, String fuhrparkID, int fahrzeugID) throws IllegalArgumentException{
		Fuhrpark fp = findFuhrparkID(fuhrparks, fuhrparkID);
		if(fuhrparkID == null){
			throw new IllegalArgumentException("Fuhrpark not found");
		}
		//TODO: removeFahrzeug implementieren
		fp.removeFahrzeug(fahrzeugID);
	}
	
	//TODO: aendern der information zu einigen fahrzeugen
}
