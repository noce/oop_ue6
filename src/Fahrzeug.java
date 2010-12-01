public abstract class Fahrzeug implements IdAdmin{
	private double km = 1;
	private double verbrauch = 1;
	private final int id;
	//Befoerderung ist, wenn nicht festgelegt, ein PKW mit 5 Sitzen
	private Befoerderung b = new Personen(5); 
	
	//inv: id
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
	//pre: Befoerderung has to be whether Lasten or Personen
	public void setType(Befoerderung b){
		this.b = b;
	}
	
	//post: Befoerderung is whether Lasten or Personen
	public Befoerderung getType(){
		return b;
	}
	
	public String toString(){
		return "FahrzeugID: " + getId() + ", Typ: " + getType() + ", km-Stand: " + getKm() + ", Treibstoff-/Stromverbrauch: "
				+ getVerbrauch();
	}
}