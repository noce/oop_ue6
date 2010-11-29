public class Fuhrpark{
	private final String id;
	
	public Fuhrpark(String id){
		this.id = id;
	}
	
	//mit Elektromotor
	private List elektro = new List();
	//mit Verbrennungsmotor
	private List verbrenner = new List();

	
	private List getList(Fahrzeug f){
		if(f instanceof Elektromotor){
			return elektro;
		}else if(f instanceof Verbrennungsmotor){
			return verbrenner;
		}else{
			System.out.println("ERROR: not in Elektro neither in Verbrenner");
			return null;
		}
	}
	
	public void addFahrzeug(Fahrzeug f){
		this.getList(f).addNode(f);
	}
	
	public void removeFahrzeug(Fahrzeug f){
		//TODO: remove Fahrzeug;
	}
	
	public Fahrzeug getFahrzeug(Fahrzeug f){
		List temp = this.getList(f);
		Iter i = temp.getIterator();
		while(i.hasNext()){
			Fahrzeug tempF = (Fahrzeug) i.next();
			if(tempF.getId() == f.getId()) return tempF;
		}
		return null;	
	}
	
	public String statistics(int i){
		StringBuffer ret = new StringBuffer();
		
		ret.append("------------------- Statistik ------------------- ");
		ret.append("\n");
		ret.append("\n");
		
		switch(i){
			case 1:{
				ret.append("Fall 1: Treibstoffverbrauch pro Kilometer mit Verbrennungskraftwägen: ");
				ret.append("\n");
				int verbrauch = 0;
				int km = 0;
				int avgVerbrauch = 0;
				int verbrauchLasten = 0;
				int kmLasten = 0;
				int avgLasten = 0;
				int verbrauchPersonen = 0;
				int kmPersonen = 0;
				int avgPersonen = 0;
				Fahrzeug tmpF;
				Iter it = verbrenner.getIterator();
				while(it.hasNext()){
					tmpF = (Fahrzeug) it.next();
					verbrauch += tmpF.getVerbrauch();
					km += tmpF.getKm();
					
					if(tmpF.getType() instanceof  Lasten){
						verbrauchLasten += verbrauch;
						kmLasten += km;
					}else if(tmpF.getType() instanceof  Personen){
						verbrauchPersonen += verbrauch;
						kmPersonen += km;
						
					}else System.out.println("ERROR: no Befoerderung defined!");
				}
				avgVerbrauch = verbrauch/km;
				ret.append("Durchschnittlicher Verbrauch/km: " + avgVerbrauch);
				ret.append("\n");
				
				avgLasten = verbrauchLasten/kmLasten;
				ret.append("Durchschnittlicher Verbrauch/km für Lastentransporter " + avgLasten);
				ret.append("\n");
				
				avgPersonen = verbrauchPersonen/kmPersonen;
				ret.append("Durchschnittlicher Verbrauch/km für Personentransporter " + avgPersonen);
				ret.append("\n");
			}
			case 2:{
				
			}
		}
		return null;
	}
	
}