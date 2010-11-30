public abstract class Fahrzeug implements IdAdmin{
	private double km = 1;
	private double verbrauch = 1;
	private final int id;
	private Befoerderung b;
	
	
	public Fahrzeug(int id){
		this.id = id;
	}
	
	public Fahrzeug(int id, double km, double verbrauch){
		this.id = id;
		this.km = km;
		this.verbrauch = verbrauch;
	}
	
	
	public Integer getId(){
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