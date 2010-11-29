import java.util.List;
import java.util.ArrayList;

public class Test {
	
	static int counter = 1;
	
	public static void main(String args[]){
		
		List<Fuhrpark> fuhrparks = new ArrayList<Fuhrpark>();
		List<Fahrzeug> fahrzeuge = new ArrayList<Fahrzeug>();
		
		//TODO: eigene Liste verwenden?
		public void addFuhrpark(String name) throws IllegalArgumentException {
			for(Fuhrpark fp: fuhrparks){
				if(!name.equals(fp)){
					fuhrparks.add(name);
				} else {
					throw new IllegalArgumentException("name already exists");
				}
			}
		}
		
		//TODO: eigene Liste verwenden?
		public void addFahrzeug() {
			fahrzeuge.add(counter);
		}
		
		
	}
}
