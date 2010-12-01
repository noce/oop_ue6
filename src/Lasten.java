
public class Lasten implements Befoerderung{

	private int sizeOfLoadingSpace;
	private int maxWeight;
	
	public Lasten(int sizeOfLoadingSpace, int maxWeight){
		this.sizeOfLoadingSpace = sizeOfLoadingSpace;
		this.maxWeight = maxWeight;
	}
	
	public String getType(){
		return "Lasten";
	}
	
	public int getMaxWeight(){
		return maxWeight;
	}
	
	public int getSize(){
		return sizeOfLoadingSpace;
	}
}
