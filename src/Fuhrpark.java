public class Fuhrpark implements IdAdmin{
	private final String id;

	public Fuhrpark(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	//mit Elektromotor
	private List elektro = new List();
	//mit Verbrennungsmotor
	private List verbrenner = new List();


	private List getList(Fahrzeug f){
		if(f instanceof Elektromotor){
			return elektro;
		}else if(f instanceof VerbrennungsMotor){
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
		if(f instanceof Elektromotor) elektro.removeNode(f);
		else if(f instanceof VerbrennungsMotor) verbrenner.removeNode(f);
		else System.out.println("ERROR: when removing - not an instance of elektro or verbrenner");
	}

	public void removeFahrzeugById(Object id){
		elektro.removeNodeById(id);
		verbrenner.removeNodeById(id);
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
	
	public Fahrzeug getFahrzeugById(int fahrzeugId){
		Iter iterE = elektro.getIterator();
		Iter iterV = verbrenner.getIterator();
		boolean found = false;
		while(iterE.hasNext() && !found){
			Fahrzeug tempF = (Fahrzeug) iterE.next();
			if(tempF.getId() == fahrzeugId) return tempF;
		}
		while(iterV.hasNext() && !found){
			Fahrzeug tempF = (Fahrzeug) iterV.next();
			if(tempF.getId() == fahrzeugId) return tempF;
		}
		return null;	
	}

	public String statistics(int i){
		StringBuffer ret = new StringBuffer();

		ret.append("------------------- Statistik ------------------- ");
		ret.append("\n");

		switch(i){
		case 1:{
			ret.append("Fall 1: Treibstoffverbrauch pro Kilometer mit Verbrennungskraftwagen: ");
			ret.append("\n");
			double verbrauch = 0;
			double km = 0;
			double avgVerbrauch = 0;
			double verbrauchLasten = 0;
			double kmLasten = 0;
			double avgLasten = 0;
			double verbrauchPersonen = 0;
			double kmPersonen = 0;
			double avgPersonen = 0;
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
			ret.append("Durchschnittlicher Verbrauch/km fuer Lastentransporter: " + avgLasten);
			ret.append("\n");

			avgPersonen = verbrauchPersonen/kmPersonen;
			ret.append("Durchschnittlicher Verbrauch/km fuer Personentransporter: " + avgPersonen);
			ret.append("\n");
			ret.append("\n");

			break;
		}//end case1
		case 2:{
			ret.append("Fall 2: Stromverbrauch pro Kilometer mit Elektrokraftwagen: ");
			ret.append("\n");
			double verbrauch = 0;
			double km = 0;
			double avgVerbrauch = 0;
			double verbrauchLasten = 0;
			double kmLasten = 0;
			double avgLasten = 0;
			double verbrauchPersonen = 0;
			double kmPersonen = 0;
			double avgPersonen = 0;
			Fahrzeug tmpF;
			Iter it = elektro.getIterator();
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
			ret.append("Durchschnittlicher Verbrauch/km fuer Lastentransporter: " + avgLasten);
			ret.append("\n");

			avgPersonen = verbrauchPersonen/kmPersonen;
			ret.append("Durchschnittlicher Verbrauch/km fuer Personentransporter: " + avgPersonen);
			ret.append("\n");
			ret.append("\n");

			break;
		}//end case2
		case 3:{
			ret.append("Fall 3: Durchschnittliche Anzahl der Sitze pro Fahrzeug ");
			ret.append("\n");
			Fahrzeug tmpF;
			Iter itE = elektro.getIterator();
			Iter itV = verbrenner.getIterator();

			double seats = 0;
			double count = 0;
			double avgSeats = 0;
			double avgSeatsE = 0;
			double seatsE = 0;
			double countE = 0;
			double avgSeatsV = 0;
			double seatsV = 0;
			double countV = 0;

			while(itE.hasNext()){
				tmpF = (Fahrzeug)itE.next();

				if(tmpF.getType() instanceof Personen){
					Personen p = (Personen) tmpF.getType();
					seatsE += p.getSeats();
					countE++;
				}
			}
			while(itV.hasNext()){
				tmpF = (Fahrzeug)itV.next();

				if(tmpF.getType() instanceof Personen){
					Personen p = (Personen) tmpF.getType();
					seatsV += p.getSeats();
					countV++;
				}
			}

			seats = seatsE + seatsV;
			count = countE + countV;
			avgSeats = seats/count;

			ret.append("Durchschnittliche Anzahl pro Fahrzeug: " + avgSeats);
			ret.append("\n");

			avgSeatsV = seatsV/countV;
			ret.append("Durchschnittliche Anzahl pro Fahrzeug bei Verbrennerfahrzeugen: " + avgSeatsV);
			ret.append("\n");

			avgSeatsE = seatsE/countE;
			ret.append("Durchschnittliche Anzahl pro Fahrzeug bei Elektrofahrzeugen: " + avgSeatsE);
			ret.append("\n");

			break;
		}//end case3

		case 4:{
			ret.append("Fall 3: Durchschnittliche Groesse der Ladeflaeche pro Fahrzeug ");
			ret.append("\n");
			Fahrzeug tmpF;
			Iter itE = elektro.getIterator();
			Iter itV = verbrenner.getIterator();

			double load = 0;
			double count = 0;
			double avgLoad = 0;
			double avgLoadE = 0;
			double loadE = 0;
			double countE = 0;
			double avgLoadV = 0;
			double loadV = 0;
			double countV = 0;

			while(itE.hasNext()){
				tmpF = (Fahrzeug)itE.next();

				if(tmpF.getType() instanceof Lasten){
					Lasten p = (Lasten) tmpF.getType();
					loadE += p.getSize();
					countE++;
				}
			}
			while(itV.hasNext()){
				tmpF = (Fahrzeug)itV.next();

				if(tmpF.getType() instanceof Lasten){
					Lasten p = (Lasten) tmpF.getType();
					loadV += p.getSize();
					countV++;
				}
			}

			load = loadE + loadV;
			count = countE + countV;
			avgLoad = load/count;

			ret.append("Durchschnittliche Groesse der Ladeflaeche: " + avgLoad);
			ret.append("\n");

			avgLoadV = loadV/countV;
			ret.append("Durchschnittliche Groesse der Ladeflaeche bei Verbrennerfahrzeugen: " + avgLoadV);
			ret.append("\n");

			avgLoadE = loadE/countE;
			ret.append("Durchschnittliche Anzahl pro Fahrzeug bei Elektrofahrzeugen: " + avgLoadE);
			ret.append("\n");

			break;

		}//end case4
		}//end switch
		return ret.toString();
	}//end public String statistics
	
	public String printFahrzeuge(){
		StringBuffer ret = new StringBuffer();
		Iter iterE = elektro.getIterator();
		Iter iterV = verbrenner.getIterator();
		int countE = 0;
		int countV = 0;
		
		while(iterE.hasNext()){
			Fahrzeug tempF = (Fahrzeug) iterE.next();
			countE++;
		}
		ret.append(countE + "x");
		ret.append("Elektrokraftwaegen: " + "\n");
		while(iterV.hasNext()){
			Fahrzeug tempF = (Fahrzeug) iterV.next();
			countV++;
		}
		ret.append(countV + "x");
		ret.append("Verbrennungskraftwaegen: " + "\n");
		
		return ret.toString();
	}
	
	public String toString(){
		return "Fuhrpark: " + getId(); 
	}
}

