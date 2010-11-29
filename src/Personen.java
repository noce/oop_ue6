
public class Personen implements Befoerderung {

	private int seats;
	
	public Personen(int seats){
		this.seats = seats;
	}
	
	public String isType(){
		return "Personen";
	}
	
	public int numberOfSeats(){
		return seats;
	}
}
