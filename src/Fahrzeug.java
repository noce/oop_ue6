public abstract class Fahrzeug{
	private int km = 0;
	private int verbrauch = 0;
	private final int id;
	private Befoerderung b;
	
	public Fahrzeug(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
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
	
	public void setType(Befoerderung b){
		this.b = b;

	}
	
	public Befoerderung getType(){
		return b;
	}
}