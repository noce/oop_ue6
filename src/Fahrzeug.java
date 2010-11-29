public abstract class Fahrzeug{
	int km = 0;
	int verbrauch = 0;
	
	public int getKm(){
		return km;
	}
	
	public void increaseKm(int amount){
		km += amount;
	}
	
	public int getVerbrauch(){
		return verbrauch;
	}
	
	public void increaseVerbrauch(int amount){
		verbrauch += amount;
	}
	
	public void setType(boolean elektroFahrzeug){
		
	}
}