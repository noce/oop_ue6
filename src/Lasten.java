
public class Lasten implements Befoerderung{

	private int sizeOfLoadingSpace;
	private int maxWeight;
	
	//post: creates a new instance of Lasten, with defined LoadingSpace & maxWeight
	public Lasten(int sizeOfLoadingSpace, int maxWeight){
		this.sizeOfLoadingSpace = sizeOfLoadingSpace;
		this.maxWeight = maxWeight;
	}

	//post:returns the Type as a String
	public String getType(){
		return "Lasten";
	}
	
	public int getSize(){
		return sizeOfLoadingSpace;
	}
}
