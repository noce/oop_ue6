
public class Personen implements Befoerderung {

	private int seats;
	
	public Personen(int seats){
		this.seats = seats;
	}
	
	public int getSeats(){
		return seats;
	}
	
	public String getType(){
		return "Personen";
	}
	
	public int numberOfSeats(){
		return seats;
	}
}
