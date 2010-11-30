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
		if(f instanceof Elektromotor) elektro.removeNode(f);
		else if(f instanceof Verbrennungsmotor) verbrenner.removeNode(f);
		else System.out.println("ERROR: when removing - not an instance of elektro or verbrenner");
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
				ret.append("Fall 1: Treibstoffverbrauch pro Kilometer mit Verbrennungskraftw�gen: ");
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
				ret.append("Durchschnittlicher Verbrauch/km f�r Lastentransporter: " + avgLasten);
				ret.append("\n");
				
				avgPersonen = verbrauchPersonen/kmPersonen;
				ret.append("Durchschnittlicher Verbrauch/km f�r Personentransporter: " + avgPersonen);
				ret.append("\n");
				ret.append("\n");
				
				break;
			}
			case 2:{
				ret.append("Fall 2: Treibstoffverbrauch pro Kilometer mit Elektrokraftw�gen: ");
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
				ret.append("Durchschnittlicher Verbrauch/km f�r Lastentransporter: " + avgLasten);
				ret.append("\n");
				
				avgPersonen = verbrauchPersonen/kmPersonen;
				ret.append("Durchschnittlicher Verbrauch/km f�r Personentransporter: " + avgPersonen);
				ret.append("\n");
				ret.append("\n");
				
				break;
			}
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
					tmpF = itE.next();

					if(tmpF.getType() instanceof Personen){
						Personen p = (Personen) tmpF.getType();
						seatsE += p.getSeats();
						countE++;
					}
				}
				while(itV.hasNext()){
					tmpF = itV.next();

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
			}

			case 4:{
				ret.append("Fall 3: Durchschnittliche Gr��e der Ladefl�che pro Fahrzeug ");
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
					tmpF = itE.next();

					if(tmpF.getType() instanceof Lasten){
						Lasten p = (Lasten) tmpF.getType();
						loadE += p.getSize();
						countE++;
					}
				}
				while(itV.hasNext()){
					tmpF = itV.next();

					if(tmpF.getType() instanceof Lasten){
						Lasten p = (Lasten) tmpF.getType();
						loadV += p.getSize();
						countV++;
					}
				}
				
				load = loadE + loadV;
				count = countE + countV;
				avgLoad = load/count;
				
				ret.append("Durchschnittliche Gr��e der Ladefl�che: " + avgLoad);
				ret.append("\n");
				
				avgLoadV = loadV/countV;
				ret.append("Durchschnittliche Gr��e der Ladefl�che bei Verbrennerfahrzeugen: " + avgLoadV);
				ret.append("\n");
				
				avgLoadE = loadE/countE;
				ret.append("Durchschnittliche Anzahl pro Fahrzeug bei Elektrofahrzeugen: " + avgLoadE);
				ret.append("\n");
				
				break;
				
			}	
		}
		return ret.toString();
	}
	
}