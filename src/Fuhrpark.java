public class Fuhrpark{
	private final String id;
	
	public Fuhrpark(String id){
		this.id = id;
	}
	
	//Personenbeförderung mit Elektromotor
	private List persE = new List();
	//Personenbeförderung mit Verbrennungsmotor
	private List persV = new List();
	//Lastenbeförderung mit Elektromotor
	private List lastE = new List();
	//Lastenbeförderung mit Verbrennungsmotor
	private List lastV  = new List();
	
	private List getList(Fahrzeug f){
		if(f.getType() instanceof Personen){//Typ: Personen
			if(f instanceof Elektromotor){
				return persE;
			}else if(f instanceof Verbrennungsmotor){
				return persV;
			}else{
				System.out.println("ERROR: Type of Personen, but no Type of Elektro or Verbrenner");
				return null;
			}
		}else if(f.getType() instanceof Lasten){//Typ: Lasten
			if(f instanceof Elektromotor){
				return lastE;
			}else if(f instanceof Verbrennungsmotor){
				return lastV;
			}else{
				System.out.println("ERROR: Type of Lasten, but no Type of Elektro or Verbrenner");
				return null;
			}
		}else{
			System.out.println("ERROR: no Type of Personen or Lasten");
			return null;
		}
	}
	
	public void addFahrzeug(Fahrzeug f){
		this.getList(f).addNode(f);
	}
	
	public void removeFahrzeug(Fahrzeug f){
		//TODO: remove Fahrzeug;
	}
>>>>>>> a200602a653270530c0ad05c8efb6a9304f75693:src/Fuhrpark.java
	
	
}
