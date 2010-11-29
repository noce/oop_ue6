public abstract class Fahrzeug{
	private double km = 1;
	private double verbrauch = 1;
	private final int id;
	private Befoerderung b;
	
	
	//TODO überladender Konstruktor zum setzen von km & verbrauch ??
	public Fahrzeug(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public double getKm(){
		return km;
	}
	
	public void increaseKm(int amount){
		km += amount;
	}
	
	public double getVerbrauch(){
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