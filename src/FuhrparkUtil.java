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

	public static Fahrzeug getFahrzeugFromFuhrparkList(List fuhrparks , int fahrzeugId){
		Iter iter = fuhrparks.getIterator();
		while(iter.hasNext()){
			Fuhrpark curFp = (Fuhrpark)iter.next();
			if(curFp.getFahrzeugById(fahrzeugId) != null) return curFp.getFahrzeugById(fahrzeugId);
		}
		return null;
	}

	
}
